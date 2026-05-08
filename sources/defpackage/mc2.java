package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.f;
import androidx.fragment.app.g;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class mc2 {
    public static Bundle a(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey("value") && !readableMap.isNull("value")) {
            bundle.putLong("value", (long) readableMap.getDouble("value"));
        }
        if (readableMap.hasKey("timeZoneName") && !readableMap.isNull("timeZoneName")) {
            bundle.putString("timeZoneName", readableMap.getString("timeZoneName"));
        }
        return bundle;
    }

    public static void b(g gVar, String str, Promise promise) {
        if (gVar == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to close a " + str + " dialog while not attached to an Activity");
            return;
        }
        try {
            f fVar = (f) gVar.u().D(str);
            boolean z = fVar != null;
            if (z) {
                fVar.D();
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    public static TimeZone c(Bundle bundle) {
        if (bundle != null && bundle.containsKey("timeZoneOffsetInMinutes")) {
            return new SimpleTimeZone(((int) bundle.getLong("timeZoneOffsetInMinutes")) * 60000, "GMT");
        }
        if (bundle != null && bundle.containsKey("timeZoneName")) {
            String string = bundle.getString("timeZoneName");
            if ("GMT".equals(string)) {
                return TimeZone.getTimeZone("GMT");
            }
            if (!"GMT".equals(TimeZone.getTimeZone(string).getID())) {
                return TimeZone.getTimeZone(string);
            }
            StringBuilder sbM = akb.m("'", string, "' does not exist in TimeZone.getAvailableIDs(). Falling back to TimeZone.getDefault()=");
            sbM.append(TimeZone.getDefault().getID());
            s55.n("ReactNative", sbM.toString());
        }
        return TimeZone.getDefault();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Bundle bundle, AlertDialog alertDialog, DialogInterface.OnClickListener onClickListener) {
        Bundle bundle2 = bundle.getBundle("dialogButtons");
        if (bundle2 == null) {
            return;
        }
        Bundle bundle3 = bundle2.getBundle("neutral");
        if (bundle3 != null && bundle3.getString("label") != null) {
            alertDialog.setButton(-3, bundle3.getString("label"), onClickListener);
        }
        Bundle bundle4 = bundle2.getBundle("positive");
        DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) alertDialog;
        if (bundle4 != null && bundle4.getString("label") != null) {
            alertDialog.setButton(-1, bundle4.getString("label"), onClickListener2);
        }
        Bundle bundle5 = bundle2.getBundle("negative");
        if (bundle5 == null || bundle5.getString("label") == null) {
            return;
        }
        alertDialog.setButton(-2, bundle5.getString("label"), onClickListener2);
    }

    public static void e(Button button, String str, Bundle bundle, boolean z, int i) {
        Bundle bundle2;
        int i2;
        if (button == null) {
            return;
        }
        Bundle bundle3 = bundle.getBundle("dialogButtons");
        Integer numValueOf = null;
        if (bundle3 != null && (bundle2 = bundle3.getBundle(str)) != null && (i2 = (int) bundle2.getDouble("textColor", 0.0d)) != 0) {
            numValueOf = Integer.valueOf(i2);
        }
        if (z || numValueOf != null) {
            if (numValueOf != null) {
                i = numValueOf.intValue();
            }
            button.setTextColor(i);
        }
    }
}
