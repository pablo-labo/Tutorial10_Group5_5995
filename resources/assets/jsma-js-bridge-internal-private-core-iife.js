(function (exports) {
    'use strict';

    var JsmaBridgeCallsV10 = {};

    var dist = {};

    var AvroOptional = {};

    var hasRequiredAvroOptional;

    function requireAvroOptional () {
    	if (hasRequiredAvroOptional) return AvroOptional;
    	hasRequiredAvroOptional = 1;
    	Object.defineProperty(AvroOptional, "__esModule", { value: true });
    	AvroOptional.AvroOptional = void 0;
    	function asOptional(avroType, value) {
    	    return value == null
    	        ? null
    	        : { [avroType]: value };
    	}
    	AvroOptional.AvroOptional = {
    	    boolean(value) {
    	        return asOptional('boolean', value);
    	    },
    	    int(value) {
    	        return asOptional('int', value);
    	    },
    	    long(value) {
    	        return asOptional('long', value);
    	    },
    	    float(value) {
    	        return asOptional('float', value);
    	    },
    	    double(value) {
    	        return asOptional('double', value);
    	    },
    	    bytes(value) {
    	        return asOptional('bytes', value);
    	    },
    	    string(value) {
    	        return asOptional('string', value);
    	    },
    	    array(value) {
    	        return asOptional('array', value);
    	    },
    	    map(value) {
    	        return asOptional('map', value);
    	    },
    	    record(typeName, value) {
    	        return asOptional(typeName, value);
    	    }
    	};
    	return AvroOptional;
    }

    var hasRequiredDist;

    function requireDist () {
    	if (hasRequiredDist) return dist;
    	hasRequiredDist = 1;
    	(function (exports$1) {
    		Object.defineProperty(exports$1, "__esModule", { value: true });
    		exports$1.AvroOptional = void 0;
    		exports$1.log = log;
    		exports$1.disconnect = disconnect;
    		exports$1.configure = configure;
    		var AvroOptional_1 = requireAvroOptional();
    		Object.defineProperty(exports$1, "AvroOptional", { enumerable: true, get: function () { return AvroOptional_1.AvroOptional; } });
    		/**
    		 * Shims calls to the logger library to pass through to
    		 * a globally-provided instance of the browser transport
    		 */
    		const isBrowser = typeof window !== 'undefined' && typeof window.document !== 'undefined';
    		let transportConfiguration;
    		function log(schemaFingerprint, message) {
    		    if (!isBrowser) {
    		        throw new Error('Attempted to log from browser logger in a Node environment');
    		    }
    		    const fingerprintedMessage = { [schemaFingerprint]: message };
    		    if (window.signals_transport) {
    		        window.signals_transport.emitSignal(fingerprintedMessage);
    		    }
    		    else {
    		        console.log(`emitting message for \`${transportConfiguration?.endpoint ?? '(no endpoint configured)'}\` to console:`);
    		        console.log('(this means the signals browser transport is not present -- is this a development environment?)');
    		        console.log(JSON.stringify(fingerprintedMessage, null, 2));
    		    }
    		}
    		function disconnect() {
    		    if (isBrowser && window.signals_transport) {
    		        window.signals_transport.disconnect();
    		    }
    		}
    		function configure(configuration) {
    		    transportConfiguration = configuration;
    		    if (isBrowser && window.signals_transport) {
    		        window.signals_transport.configure(configuration);
    		    }
    		} 
    	} (dist));
    	return dist;
    }

    var PlatformsV10 = {};

    var hasRequiredPlatformsV10;

    function requirePlatformsV10 () {
    	if (hasRequiredPlatformsV10) return PlatformsV10;
    	hasRequiredPlatformsV10 = 1;
    	Object.defineProperty(PlatformsV10, "__esModule", { value: true });
    	PlatformsV10.PlatformsV10 = void 0;
    	var PlatformsV10$1;
    	(function (PlatformsV10) {
    	    PlatformsV10["IOS"] = "IOS";
    	    PlatformsV10["ANDROID"] = "ANDROID";
    	})(PlatformsV10$1 || (PlatformsV10.PlatformsV10 = PlatformsV10$1 = {}));
    	return PlatformsV10;
    }

    var hasRequiredJsmaBridgeCallsV10;

    function requireJsmaBridgeCallsV10 () {
    	if (hasRequiredJsmaBridgeCallsV10) return JsmaBridgeCallsV10;
    	hasRequiredJsmaBridgeCallsV10 = 1;
    	(function (exports$1) {
    		Object.defineProperty(exports$1, "__esModule", { value: true });
    		exports$1.FINGERPRINT = exports$1.PlatformsV10 = exports$1.AvroOptional = void 0;
    		exports$1.log = log;
    		const signals_logger_1 = requireDist();
    		const PlatformsV10_1 = requirePlatformsV10();
    		Object.defineProperty(exports$1, "PlatformsV10", { enumerable: true, get: function () { return PlatformsV10_1.PlatformsV10; } });
    		var signals_logger_2 = requireDist();
    		Object.defineProperty(exports$1, "AvroOptional", { enumerable: true, get: function () { return signals_logger_2.AvroOptional; } });
    		exports$1.FINGERPRINT = "7ea23e3bbfb2d05d";
    		function log(message) {
    		    (0, signals_logger_1.log)(exports$1.FINGERPRINT, message);
    		} 
    	} (JsmaBridgeCallsV10));
    	return JsmaBridgeCallsV10;
    }

    var JsmaBridgeCallsV10Exports = requireJsmaBridgeCallsV10();

    // Hook function.  Defaults to an empty stub function
    let consoleHook = (_s) => { };
    // Internal util method to print any interesting data/comms to the console hook
    function printToHook(s) {
        try {
            consoleHook(s);
        }
        catch (e) {
            console.error('Error in setConsoleHook:', e);
        }
    }
    /** @hidden */
    function setConsoleHook(hookFunc) {
        // send a quick output line and trap. That way if hook is broken we won't install a broken handler
        try {
            hookFunc('Hook Installed');
            consoleHook = hookFunc;
        }
        catch (e) {
            console.error('Error in setConsoleHook:', e);
        }
    }

    class CommandFailedError extends Error {
        constructor(message) {
            super(message);
            this.name = 'CommandFailedError';
        }
    }

    class CommandNotAvailableError extends Error {
        constructor(message) {
            super(message);
            this.name = 'CommandNotAvailableError';
        }
    }

    class DispatchFailedError extends Error {
        constructor(message) {
            super(message);
            this.name = 'DispatchFailedError';
        }
    }

    var Errors = { CommandFailedError, CommandNotAvailableError, DispatchFailedError };

    var _a;
    const globalWithCounter = globalThis;
    // Here we initialize the counter value with a random int to deal with potential rare edge case (see JSMABRIDGE-225)
    (_a = globalWithCounter.__INDEED_JSMA_BRIDGE_INTERNAL_ID_COUNTER) !== null && _a !== void 0 ? _a : (globalWithCounter.__INDEED_JSMA_BRIDGE_INTERNAL_ID_COUNTER = Math.floor(Math.random() * 10000000));
    globalWithCounter.__INDEED_JSMA_BRIDGE_INTERNAL_ID_COUNTER++;
    const bridgeInstanceId = globalWithCounter.__INDEED_JSMA_BRIDGE_INTERNAL_ID_COUNTER.toString();
    // Incrementing unique id used as key to store response callbacks
    let uid = 1000;
    // Map of response callbacks
    let responseCallbacks = {};
    // Available method map
    let availableMethodsMap = null;
    /**
     * Sends string to the native app console log where it can be viewed in the native app
     *  console log viewer. All messages sent here will *always* be printed to window.console.log
     *  as well.
     * All failures are suppressed.
     */
    function appConsoleLog(s) {
        try {
            const commandJson = makeCallbackCommand('appConsoleLog', { logStr: s }, null);
            dispatchCommand(commandJson);
        }
        catch (_a) {
            // Swallow do nothing
        }
        window.console.log(s);
    }
    const getErrorMessage = (e) => {
        return typeof e === 'string' ? e : e instanceof Error ? e.message : 'Unknown error';
    };
    // Messages come in as a json string. See the type "WrappedAppResult"
    function delegateAppResult(json) {
        var _a;
        printToHook(`Delegating: ${json}`);
        try {
            const resultWrapper = JSON.parse(json);
            const result = resultWrapper.resultObj;
            const callbackId = result.callbackId;
            if (!callbackId) {
                // If no callback, do nothing
                return;
            }
            const match = callbackId.match(/__instanceid__(\S+)$/);
            const instanceId = match && match[1];
            if (!instanceId) {
                printToHook(`Instance ID missing ${callbackId} - skipping`);
                return;
            }
            const handler = (_a = window.JSMABridgeInstances) === null || _a === void 0 ? void 0 : _a[instanceId];
            if (!handler) {
                printToHook(`Bridge receiver for ID missing ${callbackId} - skipping`);
                return;
            }
            // Forward the payload to the appropriate instance
            handler.receiveAppResult(json);
        }
        catch (e) {
            appConsoleLog(`BridgeHelper Error: ${getErrorMessage(e)}`);
        }
    }
    // Messages come in as a json string. See the type "WrappedAppResult"
    function receiveAppResult(json) {
        printToHook(`Received: ${json}`);
        try {
            const resultWrapper = JSON.parse(json);
            const result = resultWrapper.resultObj;
            if (!result.callbackId) {
                // If no callback, do nothing
                return;
            }
            const callbackMethod = responseCallbacks[result.callbackId];
            if (!callbackMethod) {
                // This can happen if native calls receiveAppResult multiple times
                // For example, if an interaction is not properly debounced
                return;
            }
            if (result.error) {
                let errorInstance;
                if (typeof result.error === 'string') {
                    // Assume result.error is the message for legacy handling
                    errorInstance = new Errors.CommandFailedError(result.error);
                }
                else {
                    const { errorType, message } = result.error;
                    const ErrorClass = isKnownErrorType(errorType)
                        ? Errors[errorType]
                        : Errors.CommandFailedError;
                    errorInstance = new ErrorClass(message);
                }
                callbackMethod({ success: false, err: errorInstance });
            }
            else {
                callbackMethod({
                    success: true,
                    data: result.result,
                });
            }
            // remove the callback from dict
            Reflect.deleteProperty(responseCallbacks, result.callbackId);
        }
        catch (e) {
            appConsoleLog(`BridgeHelper Error: ${getErrorMessage(e)}`);
        }
    }
    function isKnownErrorType(key) {
        return key in Errors;
    }
    // Creates a "command" json envelope on which to serialize requests to underlying native bridge.
    function makeCallbackCommand(command, data, callbackId) {
        return {
            command,
            callbackId,
            data: data || {},
        };
    }
    // Underlying helper method that marshalls the command to the native interface
    function sendCommandToNative(commandName, inputData, callback) {
        let callbackId;
        try {
            // if we have a callback then store it in our response callbacks
            if (callback) {
                callbackId = `__callbackid__${uid.toString()}__instanceid__${bridgeInstanceId}`;
                responseCallbacks[callbackId] = callback;
                uid += 1;
            }
            // Make a command envelope
            const command = makeCallbackCommand(commandName, inputData, callbackId || null);
            // Print to console hook if exists
            printToHook(`Dispatch: ${JSON.stringify(command)}`);
            // Dispatch
            dispatchCommand(command);
        }
        catch (e) {
            const errorMessage = getErrorMessage(e);
            if (callbackId) {
                const callbackMethod = responseCallbacks[callbackId];
                Reflect.deleteProperty(responseCallbacks, callbackId);
                if (callbackMethod) {
                    const err = e instanceof Error ? e : new Error(errorMessage);
                    callbackMethod({ success: false, err });
                }
            }
            else {
                appConsoleLog(`BridgeHelper Error: ${errorMessage}`);
            }
        }
    }
    /**
     * Dispatch the command to native. Internally detects and sends the command to either the Android or iOS platform.
     */
    function dispatchCommand(command) {
        const androidInterface = getAndroidNativeInterface();
        const iosInterface = getIosNativeInterface();
        if (androidInterface) {
            androidInterface.dispatchCommand(JSON.stringify(command));
            return;
        }
        else if (iosInterface) {
            iosInterface.postMessage(command);
            return;
        }
        throw new Errors.DispatchFailedError('Could not find compatible native interface');
    }
    function getAndroidNativeInterface() {
        return window.jsmNativeInterfaceV2;
    }
    function getIosNativeInterface() {
        return (window.webkit &&
            window.webkit.messageHandlers &&
            window.webkit.messageHandlers.JSMWebKitBridgeDispatchV2);
    }
    function isMethodAvailable(commandName, callback) {
        const lookUpInCachedMapAndCallback = () => {
            if (availableMethodsMap && availableMethodsMap[commandName]) {
                callback({
                    success: true,
                    data: { commandName, isMethodAvailable: true },
                });
            }
            else {
                callback({
                    success: false,
                    err: new Errors.CommandNotAvailableError(`method ${commandName} not in available command map`),
                });
            }
        };
        if (availableMethodsMap) {
            lookUpInCachedMapAndCallback();
            return;
        }
        sendCommandToNative('getAvailableMethods', {}, (res) => {
            if (!res.success) {
                callback(res);
                return;
            }
            // Map availableMethods to a map that looks like { MethodName: true, ... }
            availableMethodsMap = {};
            const availableMethodsList = res.data.availableMethods;
            for (const availableMethod of availableMethodsList) {
                availableMethodsMap[availableMethod] = true;
            }
            lookUpInCachedMapAndCallback();
        });
    }
    /**
     * Allow list of synthetic events
     */
    const ALL_SYNTHETIC_EVENTS = ['nativeWebViewAppear'];
    /**
     * Dispatches synthetic events to the window
     */
    function dispatchWindowEvent(eventJSON) {
        printToHook(`Dispatching synthetic window event: ${eventJSON}`);
        try {
            // parse the event envelope
            const synthEventEnvelope = JSON.parse(eventJSON);
            const eventName = synthEventEnvelope.event;
            // Ensure that eventName is valid in our SyntheticEvent enums
            if (!ALL_SYNTHETIC_EVENTS.includes(eventName)) {
                appConsoleLog(`Invalid synthetic eventName: ${eventName}`);
                return;
            }
            // build event and dispatch
            const customEvent = new CustomEvent(eventName, {});
            window.dispatchEvent(customEvent);
            appConsoleLog(`Synthetic event dispatched: ${eventName}`);
        }
        catch (e) {
            appConsoleLog(`BridgeHelper Error in dispatchWindowEvent: ${getErrorMessage(e)}`);
        }
    }

    /**
     * Check whether the bridge is available
     *
     * @platform iOS, Android
     */
    function isAvailable() {
        return !!(getAndroidNativeInterface() || getIosNativeInterface());
    }
    /**
     * Gets a cached value from JSTCache by key
     *
     * @platform iOS, Android
     */
    async function getCachedValue(params) {
        // This method is called intensively by job cards: https://indeed.sourcegraph.com/code.corp.indeed.com/jobsearch/mosaic-provider-jobcards@cbd835981fa5276ade67a6de2fd595dae56162bf/-/blob/src/api/save/getJobSaveStatesFromCache.ts?L10
        // So here we disable its logging to avoid abusing signals.
        return sendCommand('getCachedValue', params, false);
    }
    /**
     * Sets a cached value in JSTCache by key
     *
     * @platform iOS, Android
     */
    async function setCachedValue(params) {
        return sendCommand('setCachedValue', params);
    }
    /**
     * Sets the app badge count to the given value.
     *
     * @platform iOS
     */
    function setAppBadgeCount(params) {
        return sendOneWayCommand('setAppBadgeCount', params);
    }
    /**
     * Clears the current badge count
     *
     * @platform iOS
     */
    function clearAppBadgeCount() {
        return sendOneWayCommand('setAppBadgeCount', { badgeCount: 0 });
    }
    /**
     * Share natively a content from the app.
     *
     * @platform iOS, Android
     */
    function shareContent(params) {
        var _a;
        return sendOneWayCommand('shareContent', {
            url: params.url,
            title: (_a = params.title) !== null && _a !== void 0 ? _a : null,
        });
    }
    /**
     * Opens a modal screen with webview
     *
     * @platform iOS, Android
     */
    async function showModalWithWebView(params) {
        var _a, _b, _c;
        // TODO: Remove <null> fallback for params after confimation on native-side compatibility
        return sendCommand('showModalWithWebView', {
            url: params.url,
            title: (_a = params.title) !== null && _a !== void 0 ? _a : null,
            presentationMode: (_b = params.presentationMode) !== null && _b !== void 0 ? _b : null,
            height: (_c = params.height) !== null && _c !== void 0 ? _c : null,
        });
    }
    /**
     * Opens a modal screen with webview and wait for result when modal is dimissed
     *
     * @platform iOS, Android
     */
    async function showModalWithWebViewAndWaitForResult(params) {
        return sendCommand('showModalWithWebViewAndWaitForResult', params);
    }
    /**
     * Closes the modal programmatically
     *
     * @platform iOS, Android
     */
    async function dismissModalWithWebView(params) {
        return sendCommand('dismissModalWithWebView', params);
    }
    /**
     * Opens a dialog in the app to prompt the user to send an error or usage report with diagnostics info.
     * The contents of the report is determined by the application.
     *
     * @platform Android
     */
    async function openShareDiagnosticsInfoDialog(params) {
        var _a;
        return sendOneWayCommand('openShareDiagnosticsInfoDialog', { from: (_a = params.from) !== null && _a !== void 0 ? _a : null });
    }
    /**
     * Opens an action overflow menu with the requested items and heading.
     * This is an asynchronous method and will return the result of the user selection or cancellation
     * in the result when the menu is dimissed.
     *
     * @platform iOS, Android
     * @returns Promise resolves on menu close to return result of selection, rejects if the menu cannot be opened due to invalid arguments (iOS only)
     */
    async function showActionOverflowMenu(params) {
        var _a, _b, _c, _d;
        return sendCommand('showActionOverflowMenu', {
            items: params.items,
            heading: (_a = params.heading) !== null && _a !== void 0 ? _a : null,
            subheading: (_b = params.subheading) !== null && _b !== void 0 ? _b : null,
            subheadingIcon: (_c = params.subheadingIcon) !== null && _c !== void 0 ? _c : null,
            currentSelectedIndex: (_d = params.currentSelectedIndex) !== null && _d !== void 0 ? _d : null,
        });
    }
    /**
     * Returns version and platform information about the native host app if any.
     *
     * @platform iOS, Android
     * @returns Returns nil result and error if method not available or is code is not hosted in JSMA.
     *          Returns appSessionId and sessionId for app version greater than or equal to v207.0 (iOS) and v179.0 (Android)
     */
    async function getNativeAppInfo() {
        return sendCommand('getNativeAppInfo', {});
    }
    /**
     * Initiate a phone call without going through the Dialer user interface for the user to confirm the call.
     * If needed, user's permission will be asked first. This method is only operable on Android.
     *
     * @platform Android
     * @returns returns CallPhoneNumberResult if successful.
     */
    async function callPhoneNumber(params) {
        return sendCommand('callPhoneNumber', params);
    }
    /**
     * Notifies app that indeed apply completed and should return to page that opened viewjob.
     * If postApplyUrl is non-null then the postApplyUrl should be opened as a forward navigation from the page that opened viewjob.
     * If the postApplyConfirmMessage is non-null then a confirmation toast should appear that displays the postApplyMessage string.  If the confirmation toast is shown, then the postApplyConfirmUrl will indicate (if present) - the link that should be navigated to on user tap.
     * The postApplyConfirmMessage should support simple HTML span based styling, including: font color, underline, bold, italic.
     *
     * @platform iOS, Android
     */
    async function indeedApplyDidComplete(params) {
        var _a, _b, _c;
        return sendCommand('indeedApplyDidComplete', {
            postApplyUrl: (_a = params.postApplyUrl) !== null && _a !== void 0 ? _a : null,
            postApplyConfirmMessage: (_b = params.postApplyConfirmMessage) !== null && _b !== void 0 ? _b : null,
            postApplyConfirmUrl: (_c = params.postApplyConfirmUrl) !== null && _c !== void 0 ? _c : null,
        });
    }
    /**
     * Initiates an Indeed Apply - potentially in a new webview screen/layer as a modal process.
     *  Note: An Indeed Apply started by this function will not implement applyDidComplete behavior on completion.
     *
     * @platform iOS, Android
     * @returns Promise resolves when apply is complete.
     */
    async function startIndeedApply(params) {
        return sendCommand('startIndeedApply', params);
    }
    /**
     * Notifies app to display a toast with the given texts and specified duration/theme/style/position.
     *
     * @platform iOS
     */
    async function displayToast(params) {
        var _a, _b, _c;
        return sendCommand('displayToast', {
            message: params.message,
            durationSeconds: params.durationSeconds,
            title: (_a = params.title) !== null && _a !== void 0 ? _a : null,
            icon: (_b = params.icon) !== null && _b !== void 0 ? _b : null,
            theme: (_c = params.theme) !== null && _c !== void 0 ? _c : null,
            style: params.style || 'generic',
            position: params.position || 'bottom',
        });
    }
    /**
     * Ask the app to show an error alert.
     *
     * @platform iOS
     */
    async function displayErrorAlert(params) {
        var _a;
        return sendCommand('displayErrorAlert', {
            message: params.message,
            title: (_a = params.title) !== null && _a !== void 0 ? _a : null,
        });
    }
    /**
     * @platform iOS, Android
     */
    async function sendPageInfo(params) {
        return sendCommand('sendPageInfo', params);
    }
    /**
     * Tells the app what current step and total steps are there in VIP onboarding
     *
     * @platform iOS, Android
     */
    function sendVIPStepInfo(params) {
        return sendCommand('sendVIPStepInfo', params);
    }
    /**
     * Tells the app to open the Push Notification Preferences Settings panel
     *
     * @platform iOS, Android
     */
    async function showOpenPushPrefsPanel() {
        return sendCommand('showOpenPushPrefsPanel', {});
    }
    /**
     * Opens a native search overlay for "What" or "Where" search
     *
     * @platform iOS, Android
     * @returns Promise resolves when native search overlay is rendered, or rejects if an error occurs.
     */
    async function showSearchOverlay(params) {
        var _a, _b, _c;
        return sendCommand('showSearchOverlay', {
            searchType: params.searchType,
            whatInput: (_a = params.whatInput) !== null && _a !== void 0 ? _a : null,
            whereInput: (_b = params.whereInput) !== null && _b !== void 0 ? _b : null,
            origin: (_c = params.origin) !== null && _c !== void 0 ? _c : null,
        });
    }
    /**
     * Check the state of the native geolocation permission.
     *
     * @platform Android
     */
    async function isGeolocationGranted() {
        return sendCommand('isGeolocationGranted', {});
    }
    /**
     * Opens app info page on Android.
     *
     * @platform Android
     */
    async function openAndroidAppInfo() {
        return sendCommand('openAndroidAppInfo', {});
    }
    /**
     * Register click handler for the save button on native navigation bar
     *
     * @platform iOS, Android
     */
    async function registerViewJobNavBarSaveButtonClickHandler(params) {
        if (window.JSMABridgeRegistry) {
            window.JSMABridgeRegistry[params.handlerIdentifier] = params.handler;
        }
        return sendCommand('registerViewJobNavBarSaveButtonClickHandler', {
            handlerIdentifier: params.handlerIdentifier,
        });
    }
    /**
     * Override text and action of the cancel button on native navigation bar in the apply webview
     *
     * @platform iOS, Android
     */
    async function overrideApplyNavbarCancelButton(params) {
        const onCancelHandlerIdentifier = 'overrideApplyNavbarCancelButtonOnCancelHandler';
        if (window.JSMABridgeRegistry) {
            window.JSMABridgeRegistry[onCancelHandlerIdentifier] = params.onCancelHandler;
        }
        return sendCommand('overrideApplyNavbarCancelButton', {
            handlerIdentifier: onCancelHandlerIdentifier,
            buttonText: params.buttonText,
        });
    }
    /**
     * Reset style of the cancel button on native navigation bar in the apply webview to default
     *
     * @platform iOS, Android
     */
    async function resetApplyNavbarCancelButton() {
        return sendCommand('resetApplyNavbarCancelButton', {});
    }
    /**
     * Opens a native onboarding modal with the specified configuration.
     *
     * This method triggers a React Native onboarding flow from the WebView,
     * passing configuration data and returning the result when onboarding completes.
     *
     * @platform iOS, Android
     * @param params Onboarding configuration
     * @param params.experienceKey Unique identifier for the onboarding experience
     * @param params.experienceData Experience-specific configuration data
     * @param params.skipExempt When true, forces onboarding to show even if user has completed it recently (defaults to false)
     * @param params.from Optional source identifier for analytics tracking
     * @returns Promise that resolves with the result when onboarding completes or is dismissed
     *
     * @example
     * ```typescript
     * const result = await openOnboardingModal({
     *   experienceKey: 'crowtaxo-start',
     *   experienceData: {
     *     occupationSuid: 'P95X0'
     *   },
     *   skipExempt: true,
     *   from: 'serp-what'
     * });
     *
     * if (result.completed) {
     *   window.location.reload();
     * }
     * ```
     */
    async function openOnboardingModal(params) {
        return sendCommand('openOnboardingModal', params);
    }
    /**
     * Set job save states for the save button on native navigation bar
     *
     * @platform iOS, Android
     */
    async function setViewJobNavBarSaveButtonState(params) {
        return sendCommand('setViewJobNavBarSaveButtonState', params);
    }
    /**
     * Navigate to profile home page
     *
     * @platform iOS
     * @retruns Promise resolves when navigation is finished, or rejects when error occurs.
     */
    async function navigateToProfileHomePage() {
        return sendCommand('navigateToProfileHomePage', {});
    }
    /**
     * Navigate to interview preparation page
     *
     * @platform iOS, Android
     */
    async function navigateToInterviewPrep(params) {
        return sendCommand('navigateToInterviewPrep', params);
    }
    /**
     * Navigate to ACE new conversation page
     *
     * @platform iOS, Android
     */
    function aceNewConversation(params) {
        return sendCommand('aceNewConversation', params);
    }
    /**
     * Navigate to existing conversation in Ace, and use optional `content` and `agentType` to send a message
     *  on entry if specified
     *
     * @platform iOS, Android
     */
    function aceOpenConversationWithId(params) {
        return sendCommand('aceOpenConversationWithId', params);
    }
    /**
     * Navigate to login modal
     *
     * @platform iOS
     */
    async function navigateToLogin(params) {
        return sendCommand('navigateToLogin', params);
    }
    /**
     * Ask the app to set custom heading title text
     *
     * @platform iOS, Android
     */
    async function setNavigationTitle(params) {
        return sendCommand('setNavigationTitle', params);
    }
    /**
     * Opens a modal screen to show the paywall.
     *
     * @platform iOS
     */
    async function displayPaywall(params) {
        return sendCommand('displayPaywall', params);
    }
    /**
     * Opens a modal screen to show the subscription management.
     *
     * @platform iOS
     */
    async function displaySubscriptionManagement() {
        return sendCommand('displaySubscriptionManagement', {});
    }
    /**
     * Dismiss the apply WebView
     *
     * @platform iOS, Android
     */
    async function dismissApplyWebView() {
        return sendOneWayCommand('dismissApplyWebView', {});
    }
    /**
     * Notify app onboarding that the user has completed all web onboarding questions
     *
     * @platform iOS, Android
     */
    async function webOnboardingOnComplete(params) {
        return sendOneWayCommand('webOnboardingOnComplete', params);
    }
    /**
     * Display the JS Premium/Pro WVMP (Who viewed my profile, aka. profile insights) details screen
     *
     * @platform iOS, Android
     */
    async function displayWVMPDetails() {
        return sendCommand('displayWVMPDetails', {});
    }
    /**
     * Mark the home page as ready
     *
     * @platform iOS, Android
     */
    async function markHomePageReady() {
        return sendOneWayCommand('markHomePageReady', {});
    }
    //////////////////////////////////////////////////////
    // Push Authorization
    //////////////////////////////////////////////////////
    /**
     * Checks whether a push prompt (primer or re-engagement modal) can be shown
     * based on rules and cooldown criteria, and returns the current authorization status.
     *
     * @platform iOS, Android
     * @returns Promise resolving to result with canShowPushPrompt flag and current auth status.
     *          Rejects if the underlying native function callback contains an error.
     */
    async function canShowPushPrompt() {
        return sendCommand('canShowPushPrompt', {});
    }
    /**
     * Requests system push authorization, possibly gated by a push primer modal.
     * Use this for programmatic (non user-driven) push authorization requests.
     *
     * Behavior:
     * (1) If the current push authorization status is .authorized, .denied, or .ephemeral, then this method will return the current status in the result callback without presenting or showing any UI to the user.
     * (2) If the current push authorization status is .notDetermined or .provisional AND the user has not met the rules required to be registered or is within a cooldown period (aka "canShowPushPrompt() == false"), this method will return the current status (.notDetermined or .provisional).
     * (3) If the current push authorization status is .notDetermined or .provisional AND the user meets requirements to show the push primer ("canShowPushPrompt() == true"), then the user will be shown the modal push primer.
     *    (3a) If the user snoozes the push primer, this method will return the current push authorization status in the callback result.
     *    (3b) If the user proceeds to the system push authorization alert, then this method will return their current push authorization status in the callback result *after* closing the system alert.
     *
     * @platform iOS, Android
     * @param params.presentationType - How to present the modal ('alertDialog' or 'bottomSheet')
     * @param params.from - Optional string for logging the referrer
     * @param params.customModalConfig - Optional configuration to customize the primer modal
     * @returns Promise resolving to the authorization status after the flow completes.
     *          Rejects if the underlying native function callback contains an error.
     */
    async function requestSystemPushAuthWithPrimer(params) {
        var _a, _b;
        return sendCommand('requestSystemPushAuthWithPrimer', {
            presentationType: params.presentationType,
            from: (_a = params.from) !== null && _a !== void 0 ? _a : null,
            customModalConfig: (_b = params.customModalConfig) !== null && _b !== void 0 ? _b : null,
        });
    }
    /**
     * Triggers a push re-engagement popup modal if the current authorization status is 'denied'
     * and the user meets push prompt criteria (cooldown, etc).
     *
     * Behavior:
     * (1) If the current push authorization status is NOT .denied, then the .canceledAuthState result is returned in the result callback without presenting or showing any UI to the user.
     * (2) If the current push authorization status is .denied AND the user DOES NOT meet requirements to show the re-engagement modal ("canShowPushPrompt() == false"),  then the .canceledRules result is returned in the result callback without presenting or showing any UI to the user.
     * (3) If the current push authorization status is .denied AND the user meets requirements to show the re-engagement modal ("canShowPushPrompt() == true"), then the user will be shown the re-engagement modal.
     *    (3a) If the user snoozes the re-engagement modal, this method will return .snooze in the callback result.
     *    (3b) If the user taps "Allow Push" on the re-engagement modal, then this method will open the system push settings and return .allowNotifications in the callback result.
     *
     * @platform iOS, Android
     * @param params.presentationType - How to present the modal ('alertDialog' or 'bottomSheet')
     * @param params.from - Optional string for logging the referrer
     * @param params.customModalConfig - Optional configuration to customize the re-engagement modal
     * @returns Promise resolving to the result of the re-engagement flow
     */
    async function requestPushReengagementModal(params) {
        var _a, _b;
        return sendCommand('requestPushReengagementModal', {
            presentationType: params.presentationType,
            from: (_a = params.from) !== null && _a !== void 0 ? _a : null,
            customModalConfig: (_b = params.customModalConfig) !== null && _b !== void 0 ? _b : null,
        });
    }
    /**
     * Immediately requests push authorization from the OS. This may trigger the system authorization alert.
     * This method first checks current push authorization status. If the status is NOT one of 'notDetermined'
     * or 'provisional', the current status will be returned without triggering the system authorization alert.
     * Otherwise, the result of the system authorization alert ('authorized' or 'denied') will be returned.
     *
     * WARNING: Because the system authorization alert can only be shown once on iOS, you should only call
     * this function from inline UI such as a banner - never from intrusive modal UI.
     *
     * @platform iOS, Android
     * @param params.from - Optional string for logging the referrer
     * @returns Promise resolving to the authorization status.
     *          Rejects if the underlying native function callback contains an error.
     */
    async function requestImmediateSystemPushAuthorization(params) {
        var _a;
        return sendCommand('requestImmediateSystemPushAuthorization', {
            from: (_a = params.from) !== null && _a !== void 0 ? _a : null,
        });
    }
    /**
     * Retrieves the current push authorization status.
     *
     * @platform iOS, Android
     * @returns Promise resolving to the current authorization status.
     *          Rejects if the underlying native function callback contains an error.
     */
    async function getPushAuthorizationStatus() {
        return sendCommand('getPushAuthorizationStatus', {});
    }
    /**
     * Opens the app push notification settings in system UI.
     *
     * @platform iOS, Android
     * @returns Promise that resolves when the settings have been opened.
     */
    async function openPushNotificationAuthorizationSettings() {
        return sendCommand('openPushNotificationAuthorizationSettings', {});
    }
    /**
     * Sets the push primer cooldown timeout to "now" + timeout.
     * Note that timeouts for push primer modal and re-engagement modals all use a single prompt cooldown period.
     *
     * @platform iOS, Android
     * @returns Promise that resolves when the cooldown has been reset.
     */
    async function resetPushPromptCooldownTimeout() {
        return sendCommand('resetPushPromptCooldownTimeout', {});
    }
    /**
     * Signifies to push auth tracker that a significant event has occurred.
     * This is used by the native app to determine when to show push prompts based on user engagement.
     *
     * @platform iOS, Android
     * @returns Promise that resolves when the event has been recorded.
     */
    async function incrementPushSignificantEvent() {
        return sendCommand('incrementPushSignificantEvent', {});
    }
    //////////////////////////////////////////////////////
    // Execute registered callback
    //////////////////////////////////////////////////////
    /**
     * Check whether a callback is registered and execute if found
     *
     * @platform iOS, Android
     * @hidden
     */
    function executeCallback(handlerIdentifier) {
        const handler = window.JSMABridgeRegistry && window.JSMABridgeRegistry[handlerIdentifier];
        if (!handler) {
            appConsoleLog(`Handler not found for identifier: ${handlerIdentifier}`);
            return;
        }
        try {
            handler();
        }
        catch (e) {
            appConsoleLog(`Handler ${handlerIdentifier} error: ${getErrorMessage(e)}`);
        }
    }
    //////////////////////////////////////////////////////
    // Utilities
    //////////////////////////////////////////////////////
    // Utility function to check if bridge method is avaialble, throw err when not
    async function throwIfMethodNotAvailable(commandName) {
        return new Promise((resolve, reject) => {
            isMethodAvailable(commandName, (res) => {
                if (!res.success) {
                    reject(res.err);
                    return;
                }
                if (!res.data.isMethodAvailable) {
                    reject(new CommandNotAvailableError('Command not available'));
                    return;
                }
                resolve();
            });
        });
    }
    function getGnavApplicationId() {
        var _a, _b, _c, _d, _e;
        return ((_c = (_b = (_a = window._INDEED_GNAV) === null || _a === void 0 ? void 0 : _a.headerConfig) === null || _b === void 0 ? void 0 : _b.applicationId) !== null && _c !== void 0 ? _c : (_e = (_d = window._INDEED_GNAV) === null || _d === void 0 ? void 0 : _d.footerConfig) === null || _e === void 0 ? void 0 : _e.applicationId);
    }
    // Send one-way command, doesn't wait for the callback from native side
    async function sendOneWayCommand(commandName, inputData, logging = true) {
        await throwIfMethodNotAvailable(commandName);
        sendCommandToNative(commandName, inputData);
        if (logging) {
            sendCommand('getNativeAppInfo', {}, false)
                .then((appInfo) => {
                try {
                    if (appInfo.platform === 'MACOS')
                        return;
                    const gnavApplicationId = getGnavApplicationId();
                    JsmaBridgeCallsV10Exports.log({
                        appPlatform: appInfo.platform,
                        appVersion: appInfo.appVersion,
                        gnavApplicationId: gnavApplicationId ? { string: gnavApplicationId } : null,
                        method: commandName,
                        success: true,
                        errMessage: null,
                    });
                }
                catch (error) {
                    console.error('JSMA Bridge logging unexpected error:', error);
                }
            })
                .catch((error) => {
                console.error('JSMA Bridge logging unexpected error:', error);
            });
        }
    }
    // Send two-way command, wait for the callback from native side
    async function sendCommand(commandName, inputData, logging = true) {
        await throwIfMethodNotAvailable(commandName);
        return new Promise((resolve, reject) => {
            sendCommandToNative(commandName, inputData, (res) => {
                if (res.success) {
                    resolve(res.data);
                }
                else {
                    reject(res.err);
                }
                if (logging) {
                    sendCommand('getNativeAppInfo', {}, false)
                        .then((appInfo) => {
                        try {
                            if (appInfo.platform === 'MACOS')
                                return;
                            const gnavApplicationId = getGnavApplicationId();
                            JsmaBridgeCallsV10Exports.log({
                                appPlatform: appInfo.platform,
                                appVersion: appInfo.appVersion,
                                gnavApplicationId: gnavApplicationId ? { string: gnavApplicationId } : null,
                                method: commandName,
                                success: res.success,
                                errMessage: !res.success ? { string: res.err.message } : null,
                            });
                        }
                        catch (error) {
                            console.error('JSMA Bridge logging unexpected error:', error);
                        }
                    })
                        .catch((error) => {
                        console.error('JSMA Bridge logging unexpected error:', error);
                    });
                }
            });
        });
    }
    // These are exposed for debug usage only. Client apps should not need these.
    /** @hidden */
    const _INTERNAL_ = {
        appConsoleLog,
        sendCommandToNative,
        bridgeTest: (str) => {
            // signal to native
            sendCommandToNative('bridgeTest', { str });
        },
        bridgeTestAsync: (str, callback) => {
            sendCommandToNative('bridgeTestAsync', { str }, callback);
        },
    };

    var JSMABridge = /*#__PURE__*/Object.freeze({
        __proto__: null,
        _INTERNAL_: _INTERNAL_,
        aceNewConversation: aceNewConversation,
        aceOpenConversationWithId: aceOpenConversationWithId,
        callPhoneNumber: callPhoneNumber,
        canShowPushPrompt: canShowPushPrompt,
        clearAppBadgeCount: clearAppBadgeCount,
        dismissApplyWebView: dismissApplyWebView,
        dismissModalWithWebView: dismissModalWithWebView,
        displayErrorAlert: displayErrorAlert,
        displayPaywall: displayPaywall,
        displaySubscriptionManagement: displaySubscriptionManagement,
        displayToast: displayToast,
        displayWVMPDetails: displayWVMPDetails,
        executeCallback: executeCallback,
        getCachedValue: getCachedValue,
        getNativeAppInfo: getNativeAppInfo,
        getPushAuthorizationStatus: getPushAuthorizationStatus,
        incrementPushSignificantEvent: incrementPushSignificantEvent,
        indeedApplyDidComplete: indeedApplyDidComplete,
        isAvailable: isAvailable,
        isGeolocationGranted: isGeolocationGranted,
        markHomePageReady: markHomePageReady,
        navigateToInterviewPrep: navigateToInterviewPrep,
        navigateToLogin: navigateToLogin,
        navigateToProfileHomePage: navigateToProfileHomePage,
        openAndroidAppInfo: openAndroidAppInfo,
        openOnboardingModal: openOnboardingModal,
        openPushNotificationAuthorizationSettings: openPushNotificationAuthorizationSettings,
        openShareDiagnosticsInfoDialog: openShareDiagnosticsInfoDialog,
        overrideApplyNavbarCancelButton: overrideApplyNavbarCancelButton,
        registerViewJobNavBarSaveButtonClickHandler: registerViewJobNavBarSaveButtonClickHandler,
        requestImmediateSystemPushAuthorization: requestImmediateSystemPushAuthorization,
        requestPushReengagementModal: requestPushReengagementModal,
        requestSystemPushAuthWithPrimer: requestSystemPushAuthWithPrimer,
        resetApplyNavbarCancelButton: resetApplyNavbarCancelButton,
        resetPushPromptCooldownTimeout: resetPushPromptCooldownTimeout,
        sendPageInfo: sendPageInfo,
        sendVIPStepInfo: sendVIPStepInfo,
        setAppBadgeCount: setAppBadgeCount,
        setCachedValue: setCachedValue,
        setConsoleHook: setConsoleHook,
        setNavigationTitle: setNavigationTitle,
        setViewJobNavBarSaveButtonState: setViewJobNavBarSaveButtonState,
        shareContent: shareContent,
        showActionOverflowMenu: showActionOverflowMenu,
        showModalWithWebView: showModalWithWebView,
        showModalWithWebViewAndWaitForResult: showModalWithWebViewAndWaitForResult,
        showOpenPushPrefsPanel: showOpenPushPrefsPanel,
        showSearchOverlay: showSearchOverlay,
        startIndeedApply: startIndeedApply,
        webOnboardingOnComplete: webOnboardingOnComplete
    });

    const INDEED_JSMA_BRIDGE_ready = 'INDEED_JSMA_BRIDGE_ready';
    // DROID-1733: adding the condition because window is not available during server side rendering
    if (typeof window !== 'undefined') {
        // The purpose of the JSMABridgeReceiver is to limit exposure of what we
        //  publish to the global 'window' namespace to a single object/function.
        //
        // The receiveAppResult function *must* be exposed on the global namespace
        //  to let native apps execute callbacks on javascript running inside
        //  their webviews.
        window.JSMABridgeReceiver = {
            receiveAppResult: delegateAppResult,
            receiveWindowEvent: dispatchWindowEvent,
        };
        if (!window.JSMABridgeInstances) {
            window.JSMABridgeInstances = {};
        }
        window.JSMABridgeInstances[bridgeInstanceId] = { receiveAppResult };
        if (!window.JSMABridgeRegistry) {
            window.JSMABridgeRegistry = { executeCallback };
        }
        if (true) {
            // Only used when loaded in native
            const typedWindow = window;
            // eslint-disable-next-line @typescript-eslint/no-unnecessary-condition
            if (!typedWindow.INDEED_JSMA_BRIDGE) {
                typedWindow.INDEED_JSMA_BRIDGE = JSMABridge;
                // Dispatch INDEED_JSMA_BRIDGE_ready event only for Android; For iOS, we simply make sure that window.INDEED_JSMA_BRIDGE is available from the start
                if (window.jsmNativeInterfaceV2) {
                    window.dispatchEvent(new Event(INDEED_JSMA_BRIDGE_ready));
                }
            }
        }
    }

    exports.JSMABridge = JSMABridge;
    exports._INTERNAL_ = _INTERNAL_;
    exports.aceNewConversation = aceNewConversation;
    exports.aceOpenConversationWithId = aceOpenConversationWithId;
    exports.callPhoneNumber = callPhoneNumber;
    exports.canShowPushPrompt = canShowPushPrompt;
    exports.clearAppBadgeCount = clearAppBadgeCount;
    exports.dismissApplyWebView = dismissApplyWebView;
    exports.dismissModalWithWebView = dismissModalWithWebView;
    exports.displayErrorAlert = displayErrorAlert;
    exports.displayPaywall = displayPaywall;
    exports.displaySubscriptionManagement = displaySubscriptionManagement;
    exports.displayToast = displayToast;
    exports.displayWVMPDetails = displayWVMPDetails;
    exports.executeCallback = executeCallback;
    exports.getCachedValue = getCachedValue;
    exports.getNativeAppInfo = getNativeAppInfo;
    exports.getPushAuthorizationStatus = getPushAuthorizationStatus;
    exports.incrementPushSignificantEvent = incrementPushSignificantEvent;
    exports.indeedApplyDidComplete = indeedApplyDidComplete;
    exports.isAvailable = isAvailable;
    exports.isGeolocationGranted = isGeolocationGranted;
    exports.markHomePageReady = markHomePageReady;
    exports.navigateToInterviewPrep = navigateToInterviewPrep;
    exports.navigateToLogin = navigateToLogin;
    exports.navigateToProfileHomePage = navigateToProfileHomePage;
    exports.openAndroidAppInfo = openAndroidAppInfo;
    exports.openOnboardingModal = openOnboardingModal;
    exports.openPushNotificationAuthorizationSettings = openPushNotificationAuthorizationSettings;
    exports.openShareDiagnosticsInfoDialog = openShareDiagnosticsInfoDialog;
    exports.overrideApplyNavbarCancelButton = overrideApplyNavbarCancelButton;
    exports.registerViewJobNavBarSaveButtonClickHandler = registerViewJobNavBarSaveButtonClickHandler;
    exports.requestImmediateSystemPushAuthorization = requestImmediateSystemPushAuthorization;
    exports.requestPushReengagementModal = requestPushReengagementModal;
    exports.requestSystemPushAuthWithPrimer = requestSystemPushAuthWithPrimer;
    exports.resetApplyNavbarCancelButton = resetApplyNavbarCancelButton;
    exports.resetPushPromptCooldownTimeout = resetPushPromptCooldownTimeout;
    exports.sendPageInfo = sendPageInfo;
    exports.sendVIPStepInfo = sendVIPStepInfo;
    exports.setAppBadgeCount = setAppBadgeCount;
    exports.setCachedValue = setCachedValue;
    exports.setConsoleHook = setConsoleHook;
    exports.setNavigationTitle = setNavigationTitle;
    exports.setViewJobNavBarSaveButtonState = setViewJobNavBarSaveButtonState;
    exports.shareContent = shareContent;
    exports.showActionOverflowMenu = showActionOverflowMenu;
    exports.showModalWithWebView = showModalWithWebView;
    exports.showModalWithWebViewAndWaitForResult = showModalWithWebViewAndWaitForResult;
    exports.showOpenPushPrefsPanel = showOpenPushPrefsPanel;
    exports.showSearchOverlay = showSearchOverlay;
    exports.startIndeedApply = startIndeedApply;
    exports.webOnboardingOnComplete = webOnboardingOnComplete;

    return exports;

})({});
