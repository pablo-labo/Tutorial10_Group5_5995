package com.reactcommunity.rndatetimepicker;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
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
import defpackage.lr5;
import defpackage.mc2;
import defpackage.ncc;
import defpackage.nmc;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = "RNCDatePicker")
public class DatePickerModule extends NativeModuleDatePickerSpec {
    public static final String NAME = "RNCDatePicker";

    public class a implements DatePickerDialog.OnDateSetListener, DialogInterface.OnDismissListener, DialogInterface.OnClickListener {
        public final Promise a;
        public final Bundle b;
        public boolean c = false;

        public a(Promise promise, Bundle bundle) {
            this.a = promise;
            this.b = bundle;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(RumEventDeserializer.EVENT_TYPE_ACTION, "neutralButtonAction");
            this.a.resolve(writableNativeMap);
            this.c = true;
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
            if (this.c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            Calendar calendar = Calendar.getInstance();
            Bundle bundle = this.b;
            if (bundle != null && bundle.containsKey("value")) {
                calendar.setTimeInMillis(bundle.getLong("value"));
            }
            calendar.setTimeZone(mc2.c(bundle));
            Calendar calendar2 = Calendar.getInstance(mc2.c(bundle));
            calendar2.set(i, i2, i3, calendar.get(11), calendar.get(12), 0);
            calendar2.set(14, 0);
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(RumEventDeserializer.EVENT_TYPE_ACTION, "dateSetAction");
            writableNativeMap.putDouble(NdkCrashLog.TIMESTAMP_KEY_NAME, calendar2.getTimeInMillis());
            writableNativeMap.putDouble("utcOffset", (calendar2.getTimeZone().getOffset(calendar2.getTimeInMillis()) / 1000) / 60);
            this.a.resolve(writableNativeMap);
            this.c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.c || !DatePickerModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString(RumEventDeserializer.EVENT_TYPE_ACTION, "dismissedAction");
            this.a.resolve(writableNativeMap);
            this.c = true;
        }
    }

    public DatePickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private Bundle createFragmentArguments(ReadableMap readableMap) {
        Bundle bundleA = mc2.a(readableMap);
        if (readableMap.hasKey("minimumDate") && !readableMap.isNull("minimumDate")) {
            bundleA.putLong("minimumDate", (long) readableMap.getDouble("minimumDate"));
        }
        if (readableMap.hasKey("maximumDate") && !readableMap.isNull("maximumDate")) {
            bundleA.putLong("maximumDate", (long) readableMap.getDouble("maximumDate"));
        }
        if (readableMap.hasKey("display") && !readableMap.isNull("display")) {
            bundleA.putString("display", readableMap.getString("display"));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            bundleA.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            bundleA.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        if (readableMap.hasKey("testID") && !readableMap.isNull("testID")) {
            bundleA.putString("testID", readableMap.getString("testID"));
        }
        if (readableMap.hasKey("firstDayOfWeek") && !readableMap.isNull("firstDayOfWeek")) {
            bundleA.putInt("firstDayOfWeek", readableMap.getInt("firstDayOfWeek") + 1);
        }
        return bundleA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$open$0(FragmentManager fragmentManager, ReadableMap readableMap, Promise promise) {
        ncc nccVar = (ncc) fragmentManager.D("RNCDatePicker");
        Bundle bundleCreateFragmentArguments = createFragmentArguments(readableMap);
        if (nccVar != null) {
            Calendar calendar = Calendar.getInstance();
            if (bundleCreateFragmentArguments != null && bundleCreateFragmentArguments.containsKey("value")) {
                calendar.setTimeInMillis(bundleCreateFragmentArguments.getLong("value"));
            }
            calendar.setTimeZone(mc2.c(bundleCreateFragmentArguments));
            nccVar.f0.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
            return;
        }
        ncc nccVar2 = new ncc();
        nccVar2.setArguments(bundleCreateFragmentArguments);
        a aVar = new a(promise, bundleCreateFragmentArguments);
        nccVar2.h0 = aVar;
        nccVar2.g0 = aVar;
        nccVar2.i0 = aVar;
        nccVar2.L(fragmentManager, "RNCDatePicker");
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec
    @ReactMethod
    public void dismiss(Promise promise) {
        mc2.b((g) getCurrentActivity(), "RNCDatePicker", promise);
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCDatePicker";
    }

    @Override // com.reactcommunity.rndatetimepicker.NativeModuleDatePickerSpec
    @ReactMethod
    public void open(final ReadableMap readableMap, final Promise promise) {
        g gVar = (g) getCurrentActivity();
        if (gVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to open a DatePicker dialog while not attached to an Activity");
        } else {
            final lr5 lr5VarU = gVar.u();
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: hg3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$open$0(lr5VarU, readableMap, promise);
                }
            });
        }
    }
}
