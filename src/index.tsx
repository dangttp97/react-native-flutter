import { NativeModules, Platform } from 'react-native';

const LINKING_ERROR =
  `The package 'react-native-flutter' doesn't seem to be linked. Make sure: \n\n` +
  Platform.select({ ios: "- You have run 'pod install'\n", default: '' }) +
  '- You rebuilt the app after installing the package\n' +
  '- You are not using Expo Go\n';

const Flutter = NativeModules.Flutter
  ? NativeModules.Flutter
  : new Proxy(
      {},
      {
        get() {
          throw new Error(LINKING_ERROR);
        },
      }
    );

export function multiply(a: number, b: number): Promise<number> {
  return Flutter.multiply(a, b);
}
