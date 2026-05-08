package defpackage;

import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class y22 extends ai7<Character> {
    @Override // defpackage.up2
    public final ui8 a(xx9 xx9Var) {
        xx9Var.getClass();
        ei8 ei8VarL = xx9Var.l();
        ei8VarL.getClass();
        return ei8VarL.t(bnb.CHAR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.up2
    public final String toString() {
        String strValueOf;
        T t = this.a;
        Integer numValueOf = Integer.valueOf(((Character) t).charValue());
        char cCharValue = ((Character) t).charValue();
        switch (cCharValue) {
            case '\b':
                strValueOf = "\\b";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                strValueOf = "\\t";
                break;
            case '\n':
                strValueOf = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(cCharValue);
                strValueOf = (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) ? String.valueOf(cCharValue) : CoreFeature.DEFAULT_APP_VERSION;
                break;
            case '\f':
                strValueOf = "\\f";
                break;
            case '\r':
                strValueOf = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
