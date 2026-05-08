package com.datadog.android.rum.internal.domain.scope;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum.internal.RumErrorSourceType;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.model.ViewEvent;
import defpackage.gu5;
import defpackage.l;
import defpackage.l5;
import defpackage.mj8;
import defpackage.u63;
import defpackage.zr4;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0000\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0004H\u0000\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0004H\u0000\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0004H\u0000\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0000\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u00020\u0004H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\rH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0014H\u0000\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0017H\u0000\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\rH\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0000\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\u0014H\u0000\u001a\f\u0010\u001f\u001a\u00020 *\u00020\u0017H\u0000\u001a\f\u0010!\u001a\u00020\"*\u00020\rH\u0000\u001a\f\u0010#\u001a\u00020$*\u00020\u0014H\u0000\u001a\f\u0010%\u001a\u00020&*\u00020\u0017H\u0000\u001a\u0016\u0010'\u001a\u0004\u0018\u00010(*\u00020\u00012\u0006\u0010)\u001a\u00020*H\u0000\u001a\f\u0010+\u001a\u00020,*\u00020\rH\u0000\u001a\f\u0010-\u001a\u00020.*\u00020\u001cH\u0000\u001a\f\u0010/\u001a\u000200*\u00020\u0014H\u0000\u001a\f\u00101\u001a\u000202*\u00020\u0017H\u0000\u001a\f\u00103\u001a\u000204*\u000205H\u0000\u001a\f\u00106\u001a\u000207*\u000208H\u0000\u001a\f\u00109\u001a\u00020:*\u00020;H\u0000\u001a\f\u00109\u001a\u00020<*\u00020=H\u0000\u001a\f\u0010>\u001a\u00020?*\u00020\rH\u0000\u001a\f\u0010@\u001a\u00020A*\u00020\u0014H\u0000\u001a\f\u0010B\u001a\u00020C*\u00020\u0017H\u0000\u001a\u001e\u0010D\u001a\u0004\u0018\u00010E*\u00020F2\u0006\u0010G\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*H\u0000\u001a\u001e\u0010D\u001a\u0004\u0018\u00010H*\u00020I2\u0006\u0010G\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*H\u0000\u001a\u001e\u0010D\u001a\u0004\u0018\u00010J*\u00020K2\u0006\u0010G\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*H\u0000\u001a\u001e\u0010D\u001a\u0004\u0018\u00010L*\u00020M2\u0006\u0010G\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*H\u0000\u001a\u001e\u0010D\u001a\u0004\u0018\u00010N*\u00020O2\u0006\u0010G\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"UNKNOWN_SOURCE_WARNING_MESSAGE_FORMAT", "", "connect", "Lcom/datadog/android/rum/model/ResourceEvent$Connect;", "Lcom/datadog/android/rum/internal/domain/event/ResourceTiming;", "dns", "Lcom/datadog/android/rum/model/ResourceEvent$Dns;", "download", "Lcom/datadog/android/rum/model/ResourceEvent$Download;", "firstByte", "Lcom/datadog/android/rum/model/ResourceEvent$FirstByte;", "isConnected", "", "Lcom/datadog/android/api/context/NetworkInfo;", "ssl", "Lcom/datadog/android/rum/model/ResourceEvent$Ssl;", "toActionConnectivity", "Lcom/datadog/android/rum/model/ActionEvent$Connectivity;", "toActionSchemaType", "Lcom/datadog/android/rum/model/ActionEvent$DeviceType;", "Lcom/datadog/android/api/context/DeviceType;", "toActionSessionPrecondition", "Lcom/datadog/android/rum/model/ActionEvent$SessionPrecondition;", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "toErrorConnectivity", "Lcom/datadog/android/rum/model/ErrorEvent$Connectivity;", "toErrorMethod", "Lcom/datadog/android/rum/model/ErrorEvent$Method;", "Lcom/datadog/android/rum/RumResourceMethod;", "toErrorSchemaType", "Lcom/datadog/android/rum/model/ErrorEvent$DeviceType;", "toErrorSessionPrecondition", "Lcom/datadog/android/rum/model/ErrorEvent$SessionPrecondition;", "toLongTaskConnectivity", "Lcom/datadog/android/rum/model/LongTaskEvent$Connectivity;", "toLongTaskSchemaType", "Lcom/datadog/android/rum/model/LongTaskEvent$DeviceType;", "toLongTaskSessionPrecondition", "Lcom/datadog/android/rum/model/LongTaskEvent$SessionPrecondition;", "toOperationType", "Lcom/datadog/android/rum/model/ResourceEvent$OperationType;", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "toResourceConnectivity", "Lcom/datadog/android/rum/model/ResourceEvent$Connectivity;", "toResourceMethod", "Lcom/datadog/android/rum/model/ResourceEvent$Method;", "toResourceSchemaType", "Lcom/datadog/android/rum/model/ResourceEvent$DeviceType;", "toResourceSessionPrecondition", "Lcom/datadog/android/rum/model/ResourceEvent$SessionPrecondition;", "toSchemaSource", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorSource;", "Lcom/datadog/android/rum/RumErrorSource;", "toSchemaSourceType", "Lcom/datadog/android/rum/model/ErrorEvent$SourceType;", "Lcom/datadog/android/rum/internal/RumErrorSourceType;", "toSchemaType", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "Lcom/datadog/android/rum/RumActionType;", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceType;", "Lcom/datadog/android/rum/RumResourceKind;", "toViewConnectivity", "Lcom/datadog/android/rum/model/ViewEvent$Connectivity;", "toViewSchemaType", "Lcom/datadog/android/rum/model/ViewEvent$DeviceType;", "toViewSessionPrecondition", "Lcom/datadog/android/rum/model/ViewEvent$SessionPrecondition;", "tryFromSource", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource;", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventSource$Companion;", "source", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource;", "Lcom/datadog/android/rum/model/ErrorEvent$ErrorEventSource$Companion;", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource;", "Lcom/datadog/android/rum/model/LongTaskEvent$LongTaskEventSource$Companion;", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource;", "Lcom/datadog/android/rum/model/ResourceEvent$ResourceEventSource$Companion;", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource;", "Lcom/datadog/android/rum/model/ViewEvent$ViewEventSource$Companion;", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class RumEventExtKt {
    public static final String UNKNOWN_SOURCE_WARNING_MESSAGE_FORMAT = "You are using an unknown source %s for your events";

    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[RumResourceMethod.values().length];
            try {
                iArr[RumResourceMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RumResourceMethod.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RumResourceMethod.HEAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RumResourceMethod.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RumResourceMethod.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RumResourceMethod.PATCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RumResourceMethod.TRACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RumResourceMethod.OPTIONS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RumResourceMethod.CONNECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RumResourceKind.values().length];
            try {
                iArr2[RumResourceKind.BEACON.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[RumResourceKind.FETCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[RumResourceKind.XHR.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[RumResourceKind.DOCUMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[RumResourceKind.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[RumResourceKind.JS.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[RumResourceKind.FONT.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[RumResourceKind.CSS.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[RumResourceKind.MEDIA.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[RumResourceKind.NATIVE.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[RumResourceKind.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[RumResourceKind.OTHER.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[RumErrorSource.values().length];
            try {
                iArr3[RumErrorSource.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[RumErrorSource.SOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[RumErrorSource.CONSOLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[RumErrorSource.LOGGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[RumErrorSource.AGENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[RumErrorSource.WEBVIEW.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr3[RumErrorSource.CUSTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[RumErrorSource.REPORT.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[RumErrorSourceType.values().length];
            try {
                iArr4[RumErrorSourceType.ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[RumErrorSourceType.BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[RumErrorSourceType.REACT_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[RumErrorSourceType.FLUTTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[RumErrorSourceType.NDK.ordinal()] = 5;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr4[RumErrorSourceType.NDK_IL2CPP.ordinal()] = 6;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[RumActionType.values().length];
            try {
                iArr5[RumActionType.TAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr5[RumActionType.SCROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr5[RumActionType.SWIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr5[RumActionType.CLICK.ordinal()] = 4;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr5[RumActionType.BACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr5[RumActionType.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused41) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[NetworkInfo.Connectivity.values().length];
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_ETHERNET.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_WIMAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_2G.ordinal()] = 5;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_3G.ordinal()] = 6;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_4G.ordinal()] = 7;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_5G.ordinal()] = 8;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_MOBILE_OTHER.ordinal()] = 9;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_CELLULAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_OTHER.ordinal()] = 11;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr6[NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused53) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[DeviceType.values().length];
            try {
                iArr7[DeviceType.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr7[DeviceType.TABLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr7[DeviceType.TV.ordinal()] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr7[DeviceType.DESKTOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr7[DeviceType.GAMING_CONSOLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr7[DeviceType.BOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr7[DeviceType.OTHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused60) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[RumSessionScope.StartReason.values().length];
            try {
                iArr8[RumSessionScope.StartReason.USER_APP_LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr8[RumSessionScope.StartReason.INACTIVITY_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr8[RumSessionScope.StartReason.MAX_DURATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr8[RumSessionScope.StartReason.EXPLICIT_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr8[RumSessionScope.StartReason.BACKGROUND_LAUNCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr8[RumSessionScope.StartReason.PREWARM.ordinal()] = 6;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr8[RumSessionScope.StartReason.FROM_NON_INTERACTIVE_SESSION.ordinal()] = 7;
            } catch (NoSuchFieldError unused67) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$toOperationType$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        final /* synthetic */ String $this_toOperationType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$this_toOperationType = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return l5.m("Unable to convert [", this.$this_toOperationType, "] to a valid graphql operation type");
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05871 extends mj8 implements gu5<String> {
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05871(String str) {
            super(0);
            this.$source = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{this.$source}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str) {
            super(0);
            this.$source = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{this.$source}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements gu5<String> {
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(0);
            this.$source = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{this.$source}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass4 extends mj8 implements gu5<String> {
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str) {
            super(0);
            this.$source = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{this.$source}, 1));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.domain.scope.RumEventExtKt$tryFromSource$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass5 extends mj8 implements gu5<String> {
        final /* synthetic */ String $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str) {
            super(0);
            this.$source = str;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{this.$source}, 1));
        }
    }

    public static final ResourceEvent.Connect connect(ResourceTiming resourceTiming) {
        resourceTiming.getClass();
        if (resourceTiming.getConnectStart() > 0) {
            return new ResourceEvent.Connect(resourceTiming.getConnectDuration(), resourceTiming.getConnectStart());
        }
        return null;
    }

    public static final ResourceEvent.Dns dns(ResourceTiming resourceTiming) {
        resourceTiming.getClass();
        if (resourceTiming.getDnsStart() > 0) {
            return new ResourceEvent.Dns(resourceTiming.getDnsDuration(), resourceTiming.getDnsStart());
        }
        return null;
    }

    public static final ResourceEvent.Download download(ResourceTiming resourceTiming) {
        resourceTiming.getClass();
        if (resourceTiming.getDownloadStart() > 0) {
            return new ResourceEvent.Download(resourceTiming.getDownloadDuration(), resourceTiming.getDownloadStart());
        }
        return null;
    }

    public static final ResourceEvent.FirstByte firstByte(ResourceTiming resourceTiming) {
        resourceTiming.getClass();
        if (resourceTiming.getFirstByteStart() < 0 || resourceTiming.getFirstByteDuration() <= 0) {
            return null;
        }
        return new ResourceEvent.FirstByte(resourceTiming.getFirstByteDuration(), resourceTiming.getFirstByteStart());
    }

    public static final boolean isConnected(NetworkInfo networkInfo) {
        networkInfo.getClass();
        return networkInfo.getConnectivity() != NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED;
    }

    public static final ResourceEvent.Ssl ssl(ResourceTiming resourceTiming) {
        resourceTiming.getClass();
        if (resourceTiming.getSslStart() > 0) {
            return new ResourceEvent.Ssl(resourceTiming.getSslDuration(), resourceTiming.getSslStart());
        }
        return null;
    }

    public static final ActionEvent.Connectivity toActionConnectivity(NetworkInfo networkInfo) {
        List listZ;
        networkInfo.getClass();
        ActionEvent.Status status = isConnected(networkInfo) ? ActionEvent.Status.CONNECTED : ActionEvent.Status.NOT_CONNECTED;
        switch (WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listZ = u63.Z(ActionEvent.Interface.ETHERNET);
                break;
            case 2:
                listZ = u63.Z(ActionEvent.Interface.WIFI);
                break;
            case 3:
                listZ = u63.Z(ActionEvent.Interface.WIMAX);
                break;
            case 4:
                listZ = u63.Z(ActionEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
                listZ = u63.Z(ActionEvent.Interface.CELLULAR);
                break;
            case 11:
                listZ = u63.Z(ActionEvent.Interface.OTHER);
                break;
            case 12:
                listZ = zr4.a;
                break;
            default:
                l.g();
                return null;
        }
        return new ActionEvent.Connectivity(status, listZ, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new ActionEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final ActionEvent.DeviceType toActionSchemaType(DeviceType deviceType) {
        deviceType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return ActionEvent.DeviceType.MOBILE;
            case 2:
                return ActionEvent.DeviceType.TABLET;
            case 3:
                return ActionEvent.DeviceType.TV;
            case 4:
                return ActionEvent.DeviceType.DESKTOP;
            case 5:
                return ActionEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return ActionEvent.DeviceType.BOT;
            case 7:
                return ActionEvent.DeviceType.OTHER;
            default:
                l.g();
                return null;
        }
    }

    public static final ActionEvent.SessionPrecondition toActionSessionPrecondition(RumSessionScope.StartReason startReason) {
        startReason.getClass();
        switch (WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return ActionEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return ActionEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return ActionEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return ActionEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return ActionEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return ActionEvent.SessionPrecondition.PREWARM;
            case 7:
                return ActionEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                l.g();
                return null;
        }
    }

    public static final ErrorEvent.Connectivity toErrorConnectivity(NetworkInfo networkInfo) {
        List listZ;
        networkInfo.getClass();
        ErrorEvent.Status status = isConnected(networkInfo) ? ErrorEvent.Status.CONNECTED : ErrorEvent.Status.NOT_CONNECTED;
        switch (WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listZ = u63.Z(ErrorEvent.Interface.ETHERNET);
                break;
            case 2:
                listZ = u63.Z(ErrorEvent.Interface.WIFI);
                break;
            case 3:
                listZ = u63.Z(ErrorEvent.Interface.WIMAX);
                break;
            case 4:
                listZ = u63.Z(ErrorEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
                listZ = u63.Z(ErrorEvent.Interface.CELLULAR);
                break;
            case 11:
                listZ = u63.Z(ErrorEvent.Interface.OTHER);
                break;
            case 12:
                listZ = zr4.a;
                break;
            default:
                l.g();
                return null;
        }
        return new ErrorEvent.Connectivity(status, listZ, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new ErrorEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final ErrorEvent.Method toErrorMethod(RumResourceMethod rumResourceMethod) {
        rumResourceMethod.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[rumResourceMethod.ordinal()]) {
            case 1:
                return ErrorEvent.Method.GET;
            case 2:
                return ErrorEvent.Method.POST;
            case 3:
                return ErrorEvent.Method.HEAD;
            case 4:
                return ErrorEvent.Method.PUT;
            case 5:
                return ErrorEvent.Method.DELETE;
            case 6:
                return ErrorEvent.Method.PATCH;
            case 7:
                return ErrorEvent.Method.TRACE;
            case 8:
                return ErrorEvent.Method.OPTIONS;
            case DatadogLogGenerator.CRASH /* 9 */:
                return ErrorEvent.Method.CONNECT;
            default:
                l.g();
                return null;
        }
    }

    public static final ErrorEvent.DeviceType toErrorSchemaType(DeviceType deviceType) {
        deviceType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return ErrorEvent.DeviceType.MOBILE;
            case 2:
                return ErrorEvent.DeviceType.TABLET;
            case 3:
                return ErrorEvent.DeviceType.TV;
            case 4:
                return ErrorEvent.DeviceType.DESKTOP;
            case 5:
                return ErrorEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return ErrorEvent.DeviceType.BOT;
            case 7:
                return ErrorEvent.DeviceType.OTHER;
            default:
                l.g();
                return null;
        }
    }

    public static final ErrorEvent.SessionPrecondition toErrorSessionPrecondition(RumSessionScope.StartReason startReason) {
        startReason.getClass();
        switch (WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return ErrorEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return ErrorEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return ErrorEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return ErrorEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return ErrorEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return ErrorEvent.SessionPrecondition.PREWARM;
            case 7:
                return ErrorEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                l.g();
                return null;
        }
    }

    public static final LongTaskEvent.Connectivity toLongTaskConnectivity(NetworkInfo networkInfo) {
        List listZ;
        networkInfo.getClass();
        LongTaskEvent.Status status = isConnected(networkInfo) ? LongTaskEvent.Status.CONNECTED : LongTaskEvent.Status.NOT_CONNECTED;
        switch (WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listZ = u63.Z(LongTaskEvent.Interface.ETHERNET);
                break;
            case 2:
                listZ = u63.Z(LongTaskEvent.Interface.WIFI);
                break;
            case 3:
                listZ = u63.Z(LongTaskEvent.Interface.WIMAX);
                break;
            case 4:
                listZ = u63.Z(LongTaskEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
                listZ = u63.Z(LongTaskEvent.Interface.CELLULAR);
                break;
            case 11:
                listZ = u63.Z(LongTaskEvent.Interface.OTHER);
                break;
            case 12:
                listZ = zr4.a;
                break;
            default:
                l.g();
                return null;
        }
        return new LongTaskEvent.Connectivity(status, listZ, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new LongTaskEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final LongTaskEvent.DeviceType toLongTaskSchemaType(DeviceType deviceType) {
        deviceType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return LongTaskEvent.DeviceType.MOBILE;
            case 2:
                return LongTaskEvent.DeviceType.TABLET;
            case 3:
                return LongTaskEvent.DeviceType.TV;
            case 4:
                return LongTaskEvent.DeviceType.DESKTOP;
            case 5:
                return LongTaskEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return LongTaskEvent.DeviceType.BOT;
            case 7:
                return LongTaskEvent.DeviceType.OTHER;
            default:
                l.g();
                return null;
        }
    }

    public static final LongTaskEvent.SessionPrecondition toLongTaskSessionPrecondition(RumSessionScope.StartReason startReason) {
        startReason.getClass();
        switch (WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return LongTaskEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return LongTaskEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return LongTaskEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return LongTaskEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return LongTaskEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return LongTaskEvent.SessionPrecondition.PREWARM;
            case 7:
                return LongTaskEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                l.g();
                return null;
        }
    }

    public static final ResourceEvent.OperationType toOperationType(String str, InternalLogger internalLogger) {
        str.getClass();
        internalLogger.getClass();
        try {
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            return ResourceEvent.OperationType.valueOf(upperCase);
        } catch (IllegalArgumentException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) new AnonymousClass1(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    public static final ResourceEvent.Connectivity toResourceConnectivity(NetworkInfo networkInfo) {
        List listZ;
        networkInfo.getClass();
        ResourceEvent.Status status = isConnected(networkInfo) ? ResourceEvent.Status.CONNECTED : ResourceEvent.Status.NOT_CONNECTED;
        switch (WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listZ = u63.Z(ResourceEvent.Interface.ETHERNET);
                break;
            case 2:
                listZ = u63.Z(ResourceEvent.Interface.WIFI);
                break;
            case 3:
                listZ = u63.Z(ResourceEvent.Interface.WIMAX);
                break;
            case 4:
                listZ = u63.Z(ResourceEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
                listZ = u63.Z(ResourceEvent.Interface.CELLULAR);
                break;
            case 11:
                listZ = u63.Z(ResourceEvent.Interface.OTHER);
                break;
            case 12:
                listZ = zr4.a;
                break;
            default:
                l.g();
                return null;
        }
        return new ResourceEvent.Connectivity(status, listZ, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new ResourceEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final ResourceEvent.Method toResourceMethod(RumResourceMethod rumResourceMethod) {
        rumResourceMethod.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[rumResourceMethod.ordinal()]) {
            case 1:
                return ResourceEvent.Method.GET;
            case 2:
                return ResourceEvent.Method.POST;
            case 3:
                return ResourceEvent.Method.HEAD;
            case 4:
                return ResourceEvent.Method.PUT;
            case 5:
                return ResourceEvent.Method.DELETE;
            case 6:
                return ResourceEvent.Method.PATCH;
            case 7:
                return ResourceEvent.Method.TRACE;
            case 8:
                return ResourceEvent.Method.OPTIONS;
            case DatadogLogGenerator.CRASH /* 9 */:
                return ResourceEvent.Method.CONNECT;
            default:
                l.g();
                return null;
        }
    }

    public static final ResourceEvent.DeviceType toResourceSchemaType(DeviceType deviceType) {
        deviceType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return ResourceEvent.DeviceType.MOBILE;
            case 2:
                return ResourceEvent.DeviceType.TABLET;
            case 3:
                return ResourceEvent.DeviceType.TV;
            case 4:
                return ResourceEvent.DeviceType.DESKTOP;
            case 5:
                return ResourceEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return ResourceEvent.DeviceType.BOT;
            case 7:
                return ResourceEvent.DeviceType.OTHER;
            default:
                l.g();
                return null;
        }
    }

    public static final ResourceEvent.SessionPrecondition toResourceSessionPrecondition(RumSessionScope.StartReason startReason) {
        startReason.getClass();
        switch (WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return ResourceEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return ResourceEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return ResourceEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return ResourceEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return ResourceEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return ResourceEvent.SessionPrecondition.PREWARM;
            case 7:
                return ResourceEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                l.g();
                return null;
        }
    }

    public static final ErrorEvent.ErrorSource toSchemaSource(RumErrorSource rumErrorSource) {
        rumErrorSource.getClass();
        switch (WhenMappings.$EnumSwitchMapping$2[rumErrorSource.ordinal()]) {
            case 1:
                return ErrorEvent.ErrorSource.NETWORK;
            case 2:
                return ErrorEvent.ErrorSource.SOURCE;
            case 3:
                return ErrorEvent.ErrorSource.CONSOLE;
            case 4:
                return ErrorEvent.ErrorSource.LOGGER;
            case 5:
                return ErrorEvent.ErrorSource.AGENT;
            case 6:
                return ErrorEvent.ErrorSource.WEBVIEW;
            case 7:
                return ErrorEvent.ErrorSource.CUSTOM;
            case 8:
                return ErrorEvent.ErrorSource.REPORT;
            default:
                l.g();
                return null;
        }
    }

    public static final ErrorEvent.SourceType toSchemaSourceType(RumErrorSourceType rumErrorSourceType) {
        rumErrorSourceType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$3[rumErrorSourceType.ordinal()]) {
            case 1:
                return ErrorEvent.SourceType.ANDROID;
            case 2:
                return ErrorEvent.SourceType.BROWSER;
            case 3:
                return ErrorEvent.SourceType.REACT_NATIVE;
            case 4:
                return ErrorEvent.SourceType.FLUTTER;
            case 5:
                return ErrorEvent.SourceType.NDK;
            case 6:
                return ErrorEvent.SourceType.NDK_IL2CPP;
            default:
                l.g();
                return null;
        }
    }

    public static final ResourceEvent.ResourceType toSchemaType(RumResourceKind rumResourceKind) {
        rumResourceKind.getClass();
        switch (WhenMappings.$EnumSwitchMapping$1[rumResourceKind.ordinal()]) {
            case 1:
                return ResourceEvent.ResourceType.BEACON;
            case 2:
                return ResourceEvent.ResourceType.FETCH;
            case 3:
                return ResourceEvent.ResourceType.XHR;
            case 4:
                return ResourceEvent.ResourceType.DOCUMENT;
            case 5:
                return ResourceEvent.ResourceType.IMAGE;
            case 6:
                return ResourceEvent.ResourceType.JS;
            case 7:
                return ResourceEvent.ResourceType.FONT;
            case 8:
                return ResourceEvent.ResourceType.CSS;
            case DatadogLogGenerator.CRASH /* 9 */:
                return ResourceEvent.ResourceType.MEDIA;
            case 10:
                return ResourceEvent.ResourceType.NATIVE;
            case 11:
            case 12:
                return ResourceEvent.ResourceType.OTHER;
            default:
                l.g();
                return null;
        }
    }

    public static final ViewEvent.Connectivity toViewConnectivity(NetworkInfo networkInfo) {
        List listZ;
        networkInfo.getClass();
        ViewEvent.Status status = isConnected(networkInfo) ? ViewEvent.Status.CONNECTED : ViewEvent.Status.NOT_CONNECTED;
        switch (WhenMappings.$EnumSwitchMapping$5[networkInfo.getConnectivity().ordinal()]) {
            case 1:
                listZ = u63.Z(ViewEvent.Interface.ETHERNET);
                break;
            case 2:
                listZ = u63.Z(ViewEvent.Interface.WIFI);
                break;
            case 3:
                listZ = u63.Z(ViewEvent.Interface.WIMAX);
                break;
            case 4:
                listZ = u63.Z(ViewEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case DatadogLogGenerator.CRASH /* 9 */:
            case 10:
                listZ = u63.Z(ViewEvent.Interface.CELLULAR);
                break;
            case 11:
                listZ = u63.Z(ViewEvent.Interface.OTHER);
                break;
            case 12:
                listZ = zr4.a;
                break;
            default:
                l.g();
                return null;
        }
        return new ViewEvent.Connectivity(status, listZ, null, (networkInfo.getCellularTechnology() == null && networkInfo.getCarrierName() == null) ? null : new ViewEvent.Cellular(networkInfo.getCellularTechnology(), networkInfo.getCarrierName()), 4, null);
    }

    public static final ViewEvent.DeviceType toViewSchemaType(DeviceType deviceType) {
        deviceType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$6[deviceType.ordinal()]) {
            case 1:
                return ViewEvent.DeviceType.MOBILE;
            case 2:
                return ViewEvent.DeviceType.TABLET;
            case 3:
                return ViewEvent.DeviceType.TV;
            case 4:
                return ViewEvent.DeviceType.DESKTOP;
            case 5:
                return ViewEvent.DeviceType.GAMING_CONSOLE;
            case 6:
                return ViewEvent.DeviceType.BOT;
            case 7:
                return ViewEvent.DeviceType.OTHER;
            default:
                l.g();
                return null;
        }
    }

    public static final ViewEvent.SessionPrecondition toViewSessionPrecondition(RumSessionScope.StartReason startReason) {
        startReason.getClass();
        switch (WhenMappings.$EnumSwitchMapping$7[startReason.ordinal()]) {
            case 1:
                return ViewEvent.SessionPrecondition.USER_APP_LAUNCH;
            case 2:
                return ViewEvent.SessionPrecondition.INACTIVITY_TIMEOUT;
            case 3:
                return ViewEvent.SessionPrecondition.MAX_DURATION;
            case 4:
                return ViewEvent.SessionPrecondition.EXPLICIT_STOP;
            case 5:
                return ViewEvent.SessionPrecondition.BACKGROUND_LAUNCH;
            case 6:
                return ViewEvent.SessionPrecondition.PREWARM;
            case 7:
                return ViewEvent.SessionPrecondition.FROM_NON_INTERACTIVE_SESSION;
            default:
                l.g();
                return null;
        }
    }

    public static final ViewEvent.ViewEventSource tryFromSource(ViewEvent.ViewEventSource.Companion companion, String str, InternalLogger internalLogger) {
        companion.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            return companion.fromJson(str);
        } catch (NoSuchElementException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new C05871(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    public static final LongTaskEvent.LongTaskEventSource tryFromSource(LongTaskEvent.LongTaskEventSource.Companion companion, String str, InternalLogger internalLogger) {
        companion.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            return companion.fromJson(str);
        } catch (NoSuchElementException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new AnonymousClass2(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    public static final ErrorEvent.ErrorEventSource tryFromSource(ErrorEvent.ErrorEventSource.Companion companion, String str, InternalLogger internalLogger) {
        companion.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            return companion.fromJson(str);
        } catch (NoSuchElementException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new AnonymousClass3(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    public static final ActionEvent.ActionEventSource tryFromSource(ActionEvent.ActionEventSource.Companion companion, String str, InternalLogger internalLogger) {
        companion.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            return companion.fromJson(str);
        } catch (NoSuchElementException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new AnonymousClass4(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    public static final ResourceEvent.ResourceEventSource tryFromSource(ResourceEvent.ResourceEventSource.Companion companion, String str, InternalLogger internalLogger) {
        companion.getClass();
        str.getClass();
        internalLogger.getClass();
        try {
            return companion.fromJson(str);
        } catch (NoSuchElementException e) {
            InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new AnonymousClass5(str), (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    public static final ActionEvent.ActionEventActionType toSchemaType(RumActionType rumActionType) {
        rumActionType.getClass();
        switch (WhenMappings.$EnumSwitchMapping$4[rumActionType.ordinal()]) {
            case 1:
                return ActionEvent.ActionEventActionType.TAP;
            case 2:
                return ActionEvent.ActionEventActionType.SCROLL;
            case 3:
                return ActionEvent.ActionEventActionType.SWIPE;
            case 4:
                return ActionEvent.ActionEventActionType.CLICK;
            case 5:
                return ActionEvent.ActionEventActionType.BACK;
            case 6:
                return ActionEvent.ActionEventActionType.CUSTOM;
            default:
                l.g();
                return null;
        }
    }
}
