package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.media3.ui.PlayerView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.v03;
import io.jsonwebtoken.JwtParser;
import java.net.SocketTimeoutException;
import java.text.DateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class ojh implements nvh, oga, rqe {
    public static final ojh b = new ojh(0);
    public static final ojh c = new ojh(1);
    public static final ojh d = new ojh(2);
    public static final ojh e = new ojh(3);
    public final /* synthetic */ int a;

    public /* synthetic */ ojh(int i) {
        this.a = i;
    }

    public static final void b(gu5 gu5Var, gu5 gu5Var2, b bVar, int i) {
        gu5 gu5Var3;
        gu5 gu5Var4;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, 1511478686);
        int i2 = (cVarC.x(gu5Var) ? 4 : 2) | i | (cVarC.x(gu5Var2) ? 32 : 16);
        int i3 = 1;
        if (cVarC.o(i2 & 1, (i2 & 19) != 18)) {
            gu5Var3 = gu5Var;
            gu5Var4 = gu5Var2;
            rm0.a(R.drawable.app_rating_thanks, ak2.I(R.string.app_rating_dialog_multi_rate_us_title, cVarC), ak2.I(R.string.app_rating_dialog_multi_rate_us_subtext, cVarC), ak2.I(R.string.app_rating_dialog_multi_rate_us_yes, cVarC), ak2.I(R.string.app_rating_dialog_multi_rate_us_no, cVarC), gu5Var3, gu5Var4, cVarC, (i2 << 15) & 4128768, 0);
        } else {
            gu5Var3 = gu5Var;
            gu5Var4 = gu5Var2;
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new uc(gu5Var3, i, i3, gu5Var4);
        }
    }

    public static long c(float f) {
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
    }

    public static final float e(float f, float f2) {
        float fPow = (f2 * (f < Math.abs(f2) ? 1.0f + ((float) Math.pow((f / Math.abs(f2)) - 1.0f, 3.0d)) : 1.0f)) + f;
        if (fPow < 0.0f) {
            return 0.0f;
        }
        return fPow;
    }

    public static final void f(PlayerView playerView, boolean z) {
        playerView.getClass();
        playerView.setShowFastForwardButton(!z);
        playerView.setShowRewindButton(!z);
        playerView.setShowPreviousButton(!z);
        playerView.setShowNextButton(!z);
        y(playerView, z);
    }

    public static final qtc g(sl8 sl8Var) {
        sl8 sl8VarU = sl8Var.U();
        return sl8VarU != null ? sl8VarU.J(sl8Var, true) : new qtc(0.0f, 0.0f, (int) (sl8Var.a() >> 32), (int) (sl8Var.a() & 4294967295L));
    }

    public static final qtc h(sl8 sl8Var) {
        sl8 sl8VarM = m(sl8Var);
        float fA = (int) (sl8VarM.a() >> 32);
        float fA2 = (int) (sl8VarM.a() & 4294967295L);
        qtc qtcVarJ = sl8VarM.J(sl8Var, true);
        float f = qtcVarJ.a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > fA) {
            f = fA;
        }
        float f2 = qtcVarJ.b;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > fA2) {
            f2 = fA2;
        }
        float f3 = qtcVarJ.c;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= fA) {
            fA = f3;
        }
        float f4 = qtcVarJ.d;
        float f5 = f4 >= 0.0f ? f4 : 0.0f;
        if (f5 <= fA2) {
            fA2 = f5;
        }
        if (f == fA || f2 == fA2) {
            return qtc.e;
        }
        long jL = sl8VarM.L((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jL2 = sl8VarM.L((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fA)) << 32));
        long jL3 = sl8VarM.L((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L));
        long jL4 = sl8VarM.L((((long) Float.floatToRawIntBits(fA2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jL >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jL2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jL4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jL3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jL & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jL2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jL4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jL3 & 4294967295L));
        return new qtc(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static void i(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static final String j(t52 t52Var, jh2 jh2Var) {
        t52Var.getClass();
        jh2Var.getClass();
        aj3 aj3VarD = t52Var.d();
        aj3VarD.getClass();
        n8a name = t52Var.getName();
        n8a n8aVar = toe.a;
        if (name == null || name.b) {
            name = toe.c;
        }
        String strE = name.e();
        if (!(aj3VarD instanceof lya)) {
            t52 t52Var2 = aj3VarD instanceof t52 ? (t52) aj3VarD : null;
            if (t52Var2 != null) {
                return g7.e('$', j(t52Var2, jh2Var), strE);
            }
            h5.m("Unexpected container: ", aj3VarD, " for ", t52Var);
            return null;
        }
        mq5 mq5VarH = ((lya) aj3VarD).h();
        if (mq5VarH.a.c()) {
            return strE;
        }
        return wve.H(mq5VarH.a.a, JwtParser.SEPARATOR_CHAR, '/') + '/' + strE;
    }

    public static final wv4 k(Enum[] enumArr) {
        enumArr.getClass();
        return new wv4(enumArr);
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final sl8 m(sl8 sl8Var) {
        sl8 sl8Var2;
        sl8 sl8VarU = sl8Var.U();
        while (true) {
            sl8 sl8Var3 = sl8VarU;
            sl8Var2 = sl8Var;
            sl8Var = sl8Var3;
            if (sl8Var == null) {
                break;
            }
            sl8VarU = sl8Var.U();
        }
        tia tiaVar = sl8Var2 instanceof tia ? (tia) sl8Var2 : null;
        if (tiaVar == null) {
            return sl8Var2;
        }
        tia tiaVar2 = tiaVar.i0;
        while (true) {
            tia tiaVar3 = tiaVar2;
            tia tiaVar4 = tiaVar;
            tiaVar = tiaVar3;
            if (tiaVar == null) {
                return tiaVar4;
            }
            tiaVar2 = tiaVar.i0;
        }
    }

    public static String n(long j, boolean z, Context context) {
        context.getClass();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        localDateTimeNow.getClass();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault());
        localDateTimeOfInstant.getClass();
        Duration durationBetween = Duration.between(localDateTimeOfInstant, localDateTimeNow);
        durationBetween.getClass();
        long days = durationBetween.toDays();
        if (wl7.b(localDateTimeNow.toLocalDate(), localDateTimeOfInstant.toLocalDate())) {
            if (z) {
                String string = context.getString(R.string.messaging_today);
                string.getClass();
                return string;
            }
            String str = DateFormat.getTimeInstance(3).format(Date.from(localDateTimeOfInstant.atZone(ZoneId.systemDefault()).toInstant()));
            str.getClass();
            return str;
        }
        if (days < 2 && z) {
            String string2 = context.getString(R.string.messaging_yesterday);
            string2.getClass();
            return string2;
        }
        if (days < 7) {
            String str2 = localDateTimeOfInstant.format(DateTimeFormatter.ofPattern("E"));
            str2.getClass();
            return str2;
        }
        if (localDateTimeNow.getYear() == localDateTimeOfInstant.getYear()) {
            String str3 = localDateTimeOfInstant.format(DateTimeFormatter.ofPattern("MMM d"));
            str3.getClass();
            return str3;
        }
        String str4 = localDateTimeOfInstant.format(DateTimeFormatter.ofPattern("MMM d, yyyy"));
        str4.getClass();
        return str4;
    }

    public static final int o(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                l5.q("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final float p(iy3 iy3Var, boolean z, long j) {
        float fD = ooa.d(wab.c(kie.d(j), kie.b(j))) / 2.0f;
        return z ? iy3Var.t1(10.0f) + fD : fD;
    }

    public static pfe q(Exception exc) {
        pfe pfeVar = new pfe();
        exc.getClass();
        pfeVar.i(exc, null);
        return pfeVar;
    }

    public static boolean r() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ENGLISH;
        return str.toLowerCase(locale).equals("lge") || str.toLowerCase(locale).equals("samsung");
    }

    public static void s(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    public static void t(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            Log.w("InstallReferrerClient", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u(defpackage.ui8 r18, defpackage.qxf r19, defpackage.wu5 r20) {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojh.u(ui8, qxf, wu5):java.lang.Object");
    }

    public static final void v(ReactApplicationContext reactApplicationContext, int i, String str, Throwable th) {
        if (reactApplicationContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.getClass();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(i);
            readableArrayBuilder.add(str);
            if (wl7.b(th != null ? th.getClass() : null, SocketTimeoutException.class)) {
                readableArrayBuilder.add(true);
            }
            j6g j6gVar = j6g.a;
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static final void w(ReactApplicationContext reactApplicationContext, int i) {
        if (reactApplicationContext != null) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            writableArrayCreateArray.getClass();
            ReadableArrayBuilder readableArrayBuilder = new ReadableArrayBuilder(writableArrayCreateArray);
            readableArrayBuilder.add(i);
            readableArrayBuilder.addNull();
            j6g j6gVar = j6g.a;
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static ojb x(String str, okc okcVar) {
        a7b a7bVar = a7b.c;
        eq3 eq3Var = a74.a;
        no3 no3Var = no3.c;
        eze ezeVarA = wea.a();
        no3Var.getClass();
        eu2 eu2VarA = f13.a(v03.a.C0438a.c(no3Var, ezeVarA));
        str.getClass();
        a7bVar.getClass();
        return new ojb(str, okcVar, a7bVar, eu2VarA);
    }

    public static final void y(PlayerView playerView, boolean z) {
        playerView.getClass();
        androidx.media3.ui.b bVar = (androidx.media3.ui.b) playerView.findViewById(R.id.exo_progress);
        if (z) {
            if (bVar != null) {
                bVar.setScrubberColor(0);
            }
            if (bVar != null) {
                bVar.setEnabled(false);
                return;
            }
            return;
        }
        if (bVar != null) {
            bVar.setScrubberColor(-1);
        }
        if (bVar != null) {
            bVar.setEnabled(true);
        }
    }

    public static String z(@NullableDecl String str, @NullableDecl Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            try {
                string = String.valueOf(obj);
            } catch (Exception e2) {
                String name = obj.getClass().getName();
                String hexString = Integer.toHexString(System.identityHashCode(obj));
                StringBuilder sb = new StringBuilder(uz.c(name.length() + 1, hexString));
                sb.append(name);
                sb.append('@');
                sb.append(hexString);
                String string2 = sb.toString();
                Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", string2.length() != 0 ? "Exception during lenientFormat for ".concat(string2) : new String("Exception during lenientFormat for "), (Throwable) e2);
                String name2 = e2.getClass().getName();
                StringBuilder sb2 = new StringBuilder(name2.length() + string2.length() + 9);
                sb2.append("<");
                sb2.append(string2);
                sb2.append(" threw ");
                sb2.append(name2);
                sb2.append(">");
                string = sb2.toString();
            }
            objArr[i2] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb3.append((CharSequence) str, i3, iIndexOf);
            sb3.append(objArr[i]);
            i3 = iIndexOf + 2;
            i++;
        }
        sb3.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb3.append(", ");
                sb3.append(objArr[i4]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    @Override // defpackage.oga
    public boolean a() {
        return true;
    }

    @Override // defpackage.rqe
    public StackTraceElement[] d(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, stackTraceElementArr2, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        return stackTraceElementArr2;
    }

    @Override // defpackage.oga
    public void shutdown() {
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 0:
                List<svh<?>> list = djh.a;
                return Integer.valueOf((int) ((ubi) vbi.b.zza()).e());
            case 1:
                List<svh<?>> list2 = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zze());
            case 2:
                List<svh<?>> list3 = djh.a;
                return Integer.valueOf((int) ((xhi) yhi.b.zza()).zzc());
            default:
                List<svh<?>> list4 = djh.a;
                return Boolean.valueOf(((cgi) zfi.b.zza()).zzb());
        }
    }
}
