package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes3.dex */
public final class sg3 extends ge4<LocalDate> {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Override // defpackage.kka, defpackage.owf
    public final boolean b() {
        return false;
    }

    @Override // defpackage.owf
    public final ExpectedType c() {
        return new ExpectedType(new SingleType(s23.b, null), new SingleType(s23.f, null));
    }

    @Override // defpackage.ge4
    public final LocalDate e(Object obj, gk0 gk0Var, boolean z) throws UnexpectedException {
        if (obj instanceof String) {
            LocalDate localDate = LocalDate.parse((CharSequence) obj, DateTimeFormatter.ISO_DATE_TIME);
            localDate.getClass();
            return localDate;
        }
        if (obj instanceof Long) {
            LocalDate localDate2 = Instant.ofEpochMilli(((Number) obj).longValue()).atZone(ZoneId.systemDefault()).toLocalDate();
            localDate2.getClass();
            return localDate2;
        }
        throw new UnexpectedException("Unknown argument type: " + fwc.a.b(obj.getClass()), null);
    }

    @Override // defpackage.ge4
    public final LocalDate f(Dynamic dynamic, gk0 gk0Var, boolean z) throws UnexpectedException {
        int i = a.a[dynamic.getType().ordinal()];
        if (i == 1) {
            LocalDate localDate = LocalDate.parse(dynamic.asString(), DateTimeFormatter.ISO_DATE_TIME);
            localDate.getClass();
            return localDate;
        }
        if (i == 2) {
            LocalDate localDate2 = Instant.ofEpochMilli((long) dynamic.asDouble()).atZone(ZoneId.systemDefault()).toLocalDate();
            localDate2.getClass();
            return localDate2;
        }
        throw new UnexpectedException("Unknown argument type: " + dynamic.getType(), null);
    }
}
