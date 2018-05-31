Mobile Appium Tests
===================

Following may be useful:

- Appium Desktop - https://github.com/appium/appium-desktop/releases/latest 
- Android Studio (Allows you to install SDK and Emulators) - https://developer.android.com/studio/index.html
- XCode - https://developer.apple.com/xcode/

## Android emulator ID

    cd ~/Library/Android/sdk/tools
    emulator -avd <emulatorName>
    adb devices

## IOS simulator ID

    iOS simulators --> ("iPhoneSim" InteliJ IDEA configuration Run)
    --------------------------------------------
    simulator UDIDs:
    xcrun simctl list | egrep '(Booted)'
 
## For real devices follow the instructions in HowTo.txt file

### How do I run tests?
        
- If you want to specify a specific Appium server you can use:

        mvn clean test -P appiumAlreadyRunning -Dtest=<testClassName> -Ddevice=androidsim -Ddevice.id=emulator-5554 -DpathToAppFile=<pathToAppFile> -DappiumServerURL=http://127.0.0.1:4723/wd/hub     

You can specify which device type to use by using one of the following switches:

- `-Ddevice=android`
- `-Ddevice=androidsim`
- `-Ddevice=iphone`
- `-Ddevice=iphonesim`
- `-Ddevice=ipad`
- `-Ddevice=windows`

If the tests fail screenshots will be saved in ${project.basedir}/target/screenshots

# Selenium Grid support

- `remoteDriver` - Connect to a selenium Grid (e.g. Sauce Labs).
- `gridURL` - URL for the selenium grid you want to connect to.
- `appiumVersion` - The version of Appium required to run the tests

# Additional information for setting up iOS Devices

Read https://github.com/appium/appium-xcuitest-driver for XCUITest support, the brew commands below have been taken from their README.md.

    brew install libimobiledevice --HEAD
    brew install carthage

If things don't work, check https://github.com/appium/appium-xcuitest-driver to see if anything has changed

You will need to place a appium.xcconfig in the `${project.basedir}/src/test/resources` directory.

Devices used for performing tests need to be added to https://developer.apple.com/account/ios/device/
Machines running tests will need to download a test certificate from https://developer.apple.com/account/ios/certificate/development (Do this via Xcode)

In iOS8, devices each have their own setting which enables or disables UIAutomation, It lives in the “Developer” view in the Settings app. You need to verify that UIAutomation is enabled in this view before the simulator or device can be used.
