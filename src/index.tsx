import { NativeModules, Platform } from 'react-native';

type FlutterModuleType = {
  showFlutter: () => void;
};

const { FlutterModule } = NativeModules;

const FlutterLibrary: FlutterModuleType = Platform.select({
  ios: {
    showFlutter: () => FlutterModule.present(),
  },
  android: {
    showFlutter: () => FlutterModule.startActivity(),
  },
  default: {
    showFlutter: () => {
      throw new Error('Not implemented');
    },
  },
});

export default FlutterLibrary;
