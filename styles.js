import {StyleSheet} from 'react-native';

export default StyleSheet.create({
  main: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  infoCont: {
    width: '90%',
    paddingVertical: 10,
  },
  label: {
    paddingVertical: 10,
    fontWeight: '700',
    fontSize: 20,
  },
  input: {
    borderColor: 'grey',
    borderWidth: 1,
    borderRadius: 5,
    paddingLeft: 5,
  },
  passCont: {},
  passText: {},
  btnCont: {
    width: '70%',
    marginVertical: 20,
    backgroundColor: 'grey',
    borderRadius: 5,
  },
  btnText: {
    fontSize: 18,
    color: 'white',
    fontWeight: '600',
    textAlign: 'center',
    marginVertical: 10,
  },
});
