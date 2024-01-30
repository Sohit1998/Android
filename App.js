import {
  View,
  Text,
  TextInput,
  TouchableOpacity,
  NativeModules,
  DeviceEventEmitter,
  Alert,
} from 'react-native';
import React, {useEffect, useState} from 'react';
import styles from './styles';
import auth from '@react-native-firebase/auth';

const App = () => {
  const [data, setData] = useState('');
  const [userEmail, setUserEmail] = useState('');
  const [userPass, setUserPass] = useState('');

  useEffect(() => {
    const listener = DeviceEventEmitter.addListener('sendComment', comment =>
      setData(comment),
    );

    return () => {
      listener.remove();
    };
  }, [data]);

  const callnativefunction = () => {
    auth()
      .signInWithEmailAndPassword(userEmail, userPass)
      .then(res => {
        if (res && res.user) {
          NativeModules.CustomModule.addCommentScreen();
        } else {
          Alert.alert('Please enter correct email & password');
        }
      })
      .catch(err => NativeModules.CustomModule.addCommentScreen());
  };

  const emailChangeHandler = email => {
    setUserEmail(email);
  };

  const passwordTextHanlder = pass => {
    setUserPass(pass);
  };
  return (
    <>
      {!data ? (
        <View style={styles.main}>
          <View style={styles.infoCont}>
            <Text style={styles.label}>EMAIL</Text>
            <TextInput
              onChangeText={emailChangeHandler}
              style={styles.input}
              placeholder="Enter your email"
            />
          </View>
          <View style={styles.infoCont}>
            <Text style={styles.label}>PASSWORD</Text>
            <TextInput
              onChangeText={passwordTextHanlder}
              style={styles.input}
              placeholder="Enter your password"
            />
          </View>
          <TouchableOpacity style={styles.btnCont} onPress={callnativefunction}>
            <Text style={styles.btnText}>LOGIN</Text>
          </TouchableOpacity>
        </View>
      ) : (
        <View style={{flex: 1, alignItems: 'center', justifyContent: 'center'}}>
          <Text>{data}</Text>
        </View>
      )}
    </>
  );
};

export default App;
