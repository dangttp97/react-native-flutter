
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNFlutterSpec.h"

@interface Flutter : NSObject <NativeFlutterSpec>
#else
#import <React/RCTBridgeModule.h>

@interface Flutter : NSObject <RCTBridgeModule>
#endif

@end
