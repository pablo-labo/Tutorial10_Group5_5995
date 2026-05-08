package com.reactcommunity.rndatetimepicker;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.domain.event.RumEventDeserializer;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import defpackage.lhc;
import defpackage.lr5;
import defpackage.mc2;
import defpackage.nmc;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = "RNCTimePicker")
public class TimePickerModule extends NativeModuleTimePickerSpec {
    public static final String NAME = "RNCTimePicker";

    public class a implements TimePickerDialog.OnTimeSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
        public final Promise a;
        public final Bundle b;
        public boolean c = false;

        public a(Promise promise, Bundle bundle) {
            this.a = promise;
            this.b = bundle;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(RumEventDeserializer.EVENT_TYPE_ACTION, "neutralButtonAction");
            this.a.resolve(writableNativeMap);
            this.c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(RumEventDeserializer.EVENT_TYPE_ACTION, "dismissedAction");
            this.a.resolve(writableNativeMap);
            this.c = true;
        }

        @Override // android.app.TimePickerDialog.OnTimeSetListener
        public final void onTimeSet(TimePicker timePicker, int i, int i2) {
            if (this.c || !TimePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            Calendar calendar = Calendar.getInstance();
            Bundle bundle = this.b;
            if (bundle != null && bundle.containsKey("value")) {
                calendar.setTimeInMillis(bundle.getLong("value"));
            }
            calendar.setTimeZone(mc2.c(bundle));
            Calendar calendar2 = Calendar.getInstance(mc2.c(bundle));
            calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), i, i2, 0);
            calendar2.set(14, 0);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(RumEventDeserializer.EVENT_TYPE_ACTION, "timeSetAction");
            writableNativeMap.putDouble(NdkCrashLog.TIMESTAMP_KEY_NAME, calendar2.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (calendar2.getTimeZone().getOffset(calendar2.getTimeInMillis()) / 1000) / 60);
            this.a.resolve(writableNativeMap);
            this.c = true;
        }
    }

    public TimePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundleA = mc2.a(readableMap);
        if (readableMap.hasKey("is24Hour") && !readableMap.isNull("is24Hour")) {
            bundleA.putBoolean("is24Hour", readableMap.getBoolean("is24Hour"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundleA.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            bundleA.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("minuteInterval") && !readableMap.isNull("minuteInterval")) {
            bundleA.putInt("minuteInterval", readableMap.getInt("minuteInterval"));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            bundleA.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        return bundleA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$open$0(FragmentManager fragmentManager, ReadableMap readableMap, Promise promise) {
        lhc lhcVar = (lhc) fragmentManager.D("RNCTimePicker");
        Bundle bundleCreateFragmentArguments = createFragmentArguments(readableMap);
        if (lhcVar != null) {
            Calendar calendar = Calendar.getInstance();
            if (bundleCreateFragmentArguments != null && bundleCreateFragmentArguments.containsKey("value")) {
                calendar.setTimeInMillis(bundleCreateFragmentArguments.getLong("value"));
            }
            calendar.setTimeZone(mc2.c(bundleCreateFragmentArguments));
            lhcVar.f0.updateTime(calendar.get(11), calendar.get(12));
            return;
        }
        lhc lhcVar2 = new lhc();
        lhcVar2.setArguments(bundleCreateFragmentArguments);
        a aVar = new a(promise, bundleCreateFragmentArguments);
        lhcVar2.h0 = aVar;
        lhcVar2.g0 = aVar;
        lhcVar2.i0 = aVar;
        lhcVar2.L(fragmentManager, "RNCTimePicker");
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec
    @ReactMethod
    public void dismiss(Promise promise) {
        mc2.b((g) getCurrentActivity(), "RNCTimePicker", promise);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCTimePicker";
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleTimePickerSpec
    @ReactMethod
    public void open(final ReadableMap readableMap, final Promise promise) {
        g gVar = (g) getCurrentActivity();
        if (gVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a TimePicker dialog while not attached to an Activity");
        } else {
            final lr5 lr5VarU = gVar.u();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: vlf
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$open$0(lr5VarU, readableMap, promise);
                }
            });
        }
    }
}
