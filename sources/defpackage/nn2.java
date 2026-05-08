package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.media3.datasource.a;
import com.indeed.android.jobsearch.R;
import defpackage.ad3;
import defpackage.u44;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class nn2 implements ad3.c, n6d, nvh, eg6 {
    public static boolean a0 = false;
    public static fd0 b0 = null;
    public static int c0 = 1;
    public final /* synthetic */ int a;
    public static final ux0 b = new ux0("CLOSED", 4);
    public static final nn2 c = new nn2(1);
    public static final Object d = new Object();
    public static final nn2 e = new nn2(3);
    public static final nn2 f = new nn2(4);
    public static final nn2 V = new nn2(5);
    public static final nn2 W = new nn2(6);
    public static final nn2 X = new nn2(7);
    public static final tbi Y = new tbi();
    public static final zbi Z = new zbi();

    public /* synthetic */ nn2(int i) {
        this.a = i;
    }

    public static final void A(Context context, String str, String str2, boolean z) {
        context.getClass();
        str.getClass();
        if (str.length() == 0) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.indeed_toast, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.new_view);
        if (str2 != null) {
            str = z ? o6.f(str2, " \n ", str, " \n") : z3.m(str, " ", str2);
        }
        SpannableString spannableString = new SpannableString(str);
        if (str2 != null) {
            int iS = zve.S(str, str2, 0, false, 6);
            int length = str2.length() + iS;
            if (iS >= 0) {
                spannableString.setSpan(new ForegroundColorSpan(-16777216), iS, length, 33);
                spannableString.setSpan(new StyleSpan(1), iS, length, 33);
            }
        }
        textView.setText(spannableString);
        Toast toast = new Toast(context);
        toast.setDuration(1);
        toast.setView(viewInflate);
        toast.setGravity(87, 0, 180);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewInflate, "translationY", 300.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.start();
        toast.show();
    }

    public static void B(long[] jArr, long[] jArr2, int i) {
        long[] jArr3 = new long[13];
        t(jArr, jArr3);
        z(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            t(jArr2, jArr3);
            z(jArr3, jArr2);
        }
    }

    public static final float C(float f2) {
        if (Float.isNaN(f2)) {
            return Float.NaN;
        }
        return f2 / c74.d().density;
    }

    public static ArrayList D(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object objF = jSONArray.get(i);
            if (objF instanceof JSONArray) {
                objF = D((JSONArray) objF);
            } else if (objF instanceof JSONObject) {
                objF = F((JSONObject) objF);
            }
            objF.getClass();
            arrayList.add(objF);
        }
        return arrayList;
    }

    public static final Locale E(h97 h97Var) {
        h97Var.getClass();
        return new Locale(h97Var.b, h97Var.a);
    }

    public static HashMap F(JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objF = jSONObject.get(next);
            if (objF instanceof JSONArray) {
                objF = D((JSONArray) objF);
            } else if (objF instanceof JSONObject) {
                objF = F((JSONObject) objF);
            }
            next.getClass();
            map.put(next, objF);
        }
        return map;
    }

    public static final float G(float f2) {
        if (Float.isNaN(f2)) {
            return Float.NaN;
        }
        return TypedValue.applyDimension(1, f2, c74.d());
    }

    public static final float H(float f2, float f3) {
        if (Float.isNaN(f2)) {
            return Float.NaN;
        }
        DisplayMetrics displayMetricsD = c74.d();
        float fApplyDimension = TypedValue.applyDimension(2, f2, displayMetricsD);
        return f3 >= 1.0f ? Math.min(fApplyDimension, f2 * displayMetricsD.density * f3) : fApplyDimension;
    }

    public static final void c(gu5 gu5Var, gu5 gu5Var2, b bVar, int i) {
        gu5 gu5Var3;
        gu5 gu5Var4;
        c cVarC = ja.c(gu5Var, gu5Var2, bVar, -964308442);
        int i2 = (cVarC.x(gu5Var) ? 4 : 2) | i | (cVarC.x(gu5Var2) ? 32 : 16);
        int i3 = 1;
        if (cVarC.o(i2 & 1, (i2 & 19) != 18)) {
            gu5Var3 = gu5Var;
            gu5Var4 = gu5Var2;
            rm0.a(R.drawable.app_rating_contact, ak2.I(R.string.app_rating_dialog_multi_negative_feedback_title, cVarC), ak2.I(R.string.app_rating_dialog_multi_negative_feedback_subtext, cVarC), ak2.I(R.string.app_rating_dialog_multi_negative_feedback_button_contact_yes, cVarC), ak2.I(R.string.app_rating_dialog_multi_negative_feedback_button_contact_no, cVarC), gu5Var3, gu5Var4, cVarC, (i2 << 15) & 4128768, 0);
        } else {
            gu5Var3 = gu5Var;
            gu5Var4 = gu5Var2;
            cVarC.D();
        }
        i iVarW = cVarC.W();
        if (iVarW != null) {
            iVarW.d = new gh(gu5Var3, i, i3, gu5Var4);
        }
    }

    public static final y40 f(v70 v70Var) {
        Canvas canvas = z40.a;
        y40 y40Var = new y40();
        y40Var.a = new Canvas(w70.a(v70Var));
        return y40Var;
    }

    public static final void g(ah2 ah2Var, b bVar, int i) {
        c cVarH = bVar.h(-1677843913);
        int i2 = 2;
        int i3 = (cVarH.x(ah2Var) ? 4 : 2) | i;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            ah2Var.invoke(cVarH, Integer.valueOf(i3 & 14));
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new xa3(ah2Var, i, i2);
        }
    }

    public static final void h(int i, String str) {
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sbG = o6.g(i, "Expected '-' (hyphen) at index ", ", but was '");
        sbG.append(str.charAt(i));
        sbG.append('\'');
        throw new IllegalArgumentException(sbG.toString().toString());
    }

    public static void i(a aVar) {
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Locale j(String str) {
        if (str == null) {
            return null;
        }
        return new Locale("", str);
    }

    public static final Object k(myd mydVar, long j, Function2 function2) {
        while (true) {
            if (mydVar.c >= j && !mydVar.d()) {
                return mydVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = on2.a;
            Object obj = atomicReferenceFieldUpdater.get(mydVar);
            ux0 ux0Var = b;
            if (obj == ux0Var) {
                return ux0Var;
            }
            myd mydVar2 = (myd) ((on2) obj);
            if (mydVar2 == null) {
                mydVar2 = (myd) function2.invoke(Long.valueOf(mydVar.c + 1), mydVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(mydVar, null, mydVar2)) {
                    if (atomicReferenceFieldUpdater.get(mydVar) != null) {
                        break;
                    }
                }
                if (mydVar.d()) {
                    mydVar.e();
                }
            }
            mydVar = mydVar2;
        }
    }

    public static final void l(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = th6.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final yd8 m(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof pt2) {
            return ((pt2) serialDescriptor).b;
        }
        if (serialDescriptor instanceof e7e) {
            return m(((e7e) serialDescriptor).a);
        }
        return null;
    }

    public static String n(String str) {
        str.getClass();
        List<String> pathSegments = Uri.parse(str).getPathSegments();
        if (pathSegments.size() != 2 || !wl7.b(z92.O0(pathSegments), "conversations")) {
            return null;
        }
        try {
            Object objY0 = z92.Y0(pathSegments);
            objY0.getClass();
            byte[] bArrDecode = Base64.decode((String) objY0, 0);
            bArrDecode.getClass();
            List listK0 = zve.k0(new String(bArrDecode, a32.b), new String[]{"CONVERSATION_SERVICE_ENCRYPTED///"});
            if (listK0.size() == 2) {
                return (String) z92.Y0(listK0);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String o(String str) {
        String queryParameter;
        str.getClass();
        Uri uri = Uri.parse(str);
        String path = uri.getPath();
        if (!wl7.b(path != null ? zve.d0(path, "/") : null, "/conversations/new") || (queryParameter = uri.getQueryParameter("token")) == null || queryParameter.length() == 0) {
            return null;
        }
        return queryParameter;
    }

    public static boolean p(hv1 hv1Var) {
        hv1Var.getClass();
        if (!rp1.d.contains(hv1Var.getName())) {
            return false;
        }
        if (z92.I0(rp1.c, b04.c(hv1Var)) && hv1Var.i().isEmpty()) {
            return true;
        }
        if (!ei8.A(hv1Var)) {
            return false;
        }
        Collection<? extends hv1> collectionM = hv1Var.m();
        collectionM.getClass();
        Collection<? extends hv1> collection = collectionM;
        if (collection.isEmpty()) {
            return false;
        }
        for (hv1 hv1Var2 : collection) {
            hv1Var2.getClass();
            if (p(hv1Var2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '*' || cCharAt == '[' || cCharAt == ']' || cCharAt == ',') {
                return true;
            }
        }
        return false;
    }

    public static void r(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 7;
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        r(jArr, jArr4);
        r(jArr2, jArr5);
        int i2 = 0;
        while (i2 < i) {
            long j = jArr5[i2];
            long[] jArr6 = new long[8];
            jArr6[1] = j;
            long j2 = j << 1;
            jArr6[2] = j2;
            long j3 = j2 ^ j;
            jArr6[3] = j3;
            long j4 = j << 2;
            jArr6[4] = j4;
            jArr6[5] = j4 ^ j;
            long j5 = j3 << 1;
            jArr6[6] = j5;
            jArr6[i] = j5 ^ j;
            int i3 = 0;
            while (i3 < i) {
                int i4 = i;
                long[] jArr7 = jArr4;
                long j6 = jArr7[i3];
                int i5 = (int) j6;
                long j7 = jArr6[i5 & 7] ^ (jArr6[(i5 >>> 3) & 7] << 3);
                int i6 = i2;
                int i7 = 54;
                long j8 = 0;
                do {
                    int i8 = (int) (j6 >>> i7);
                    long j9 = jArr6[i8 & 7] ^ (jArr6[(i8 >>> 3) & 7] << 3);
                    j7 ^= j9 << i7;
                    j8 ^= j9 >>> (-i7);
                    i7 -= 6;
                } while (i7 > 0);
                int i9 = i6 + i3;
                jArr3[i9] = jArr3[i9] ^ (j7 & 576460752303423487L);
                int i10 = i9 + 1;
                jArr3[i10] = jArr3[i10] ^ ((j7 >>> 59) ^ (j8 << 5));
                i3++;
                i2 = i6;
                i = i4;
                jArr4 = jArr7;
            }
            i2++;
        }
        int i11 = i;
        long j10 = jArr3[0];
        long j11 = jArr3[1];
        long j12 = jArr3[2];
        long j13 = jArr3[3];
        long j14 = jArr3[4];
        long j15 = jArr3[5];
        long j16 = jArr3[6];
        long j17 = jArr3[i11];
        long j18 = jArr3[8];
        long j19 = jArr3[9];
        long j20 = jArr3[10];
        long j21 = jArr3[11];
        long j22 = jArr3[12];
        long j23 = jArr3[13];
        jArr3[0] = j10 ^ (j11 << 59);
        jArr3[1] = (j11 >>> 5) ^ (j12 << 54);
        jArr3[2] = (j12 >>> 10) ^ (j13 << 49);
        jArr3[3] = (j13 >>> 15) ^ (j14 << 44);
        jArr3[4] = (j14 >>> 20) ^ (j15 << 39);
        jArr3[5] = (j15 >>> 25) ^ (j16 << 34);
        jArr3[6] = (j16 >>> 30) ^ (j17 << 29);
        jArr3[i11] = (j17 >>> 35) ^ (j18 << 24);
        jArr3[8] = (j18 >>> 40) ^ (j19 << 19);
        jArr3[9] = (j19 >>> 45) ^ (j20 << 14);
        jArr3[10] = (j20 >>> 50) ^ (j21 << 9);
        jArr3[11] = ((j21 >>> 55) ^ (j22 << 4)) ^ (j23 << 63);
        jArr3[12] = (j22 >>> 60) ^ (j23 >>> 1);
        jArr3[13] = 0;
    }

    public static void t(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            wab.j(i << 1, jArr[i], jArr2);
        }
        jArr2[12] = wab.i((int) jArr[6]);
    }

    public static final HashMap u(JSONObject jSONObject) {
        return jSONObject != JSONObject.NULL ? F(jSONObject) : new HashMap();
    }

    public static void v(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        s(jArr, jArr2, jArr4);
        z(jArr4, jArr3);
    }

    public static void w(String str, Object obj, Object obj2) {
        throw new RuntimeException(str + " expected: " + obj + ", but received: " + obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0109, code lost:
    
        r15.substring(r2, r6);
        r0 = java.util.Collections.EMPTY_MAP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
    
        r15.substring(r2, r6);
        r0 = java.util.Collections.EMPTY_MAP;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115 A[PHI: r0 r4
  0x0115: PHI (r0v4 java.util.Map) = (r0v3 java.util.Map), (r0v10 java.util.Map) binds: [B:12:0x0027, B:67:0x0101] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:12:0x0027, B:67:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map x(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn2.x(java.lang.String):java.util.Map");
    }

    public static final String y(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static void z(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j6 ^ (j9 << 39);
        long j11 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j12 = j8 ^ (j9 >>> 2);
        long j13 = jArr[11];
        long j14 = j5 ^ (j13 << 39);
        long j15 = j10 ^ ((j13 >>> 25) ^ (j13 << 62));
        long j16 = j11 ^ (j13 >>> 2);
        long j17 = jArr[10];
        long j18 = j4 ^ (j17 << 39);
        long j19 = j14 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j15 ^ (j17 >>> 2);
        long j21 = jArr[9];
        long j22 = j3 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[8];
        long j26 = j ^ (j12 << 39);
        long j27 = (j2 ^ (j25 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j28 = (j22 ^ ((j25 >>> 25) ^ (j25 << 62))) ^ (j12 >>> 2);
        long j29 = j16 >>> 25;
        jArr2[0] = j26 ^ j29;
        jArr2[1] = (j29 << 23) ^ j27;
        jArr2[2] = j28;
        jArr2[3] = j23 ^ (j25 >>> 2);
        jArr2[4] = j24;
        jArr2[5] = j20;
        jArr2[6] = j16 & 33554431;
    }

    @Override // defpackage.eg6
    public boolean a(iie iieVar) {
        u44 u44Var = iieVar.a;
        if ((u44Var instanceof u44.a ? ((u44.a) u44Var).a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        u44 u44Var2 = iieVar.b;
        return (u44Var2 instanceof u44.a ? ((u44.a) u44Var2).a : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.eg6
    public boolean b() {
        boolean z;
        synchronized (k95.a) {
            try {
                int i = k95.c;
                k95.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > k95.d + 30000) {
                    k95.c = 0;
                    k95.d = SystemClock.uptimeMillis();
                    String[] list = k95.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    k95.e = list.length < 800;
                }
                z = k95.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // ad3.c
    public Iterable d(Object obj) {
        int i = up8.p;
        Collection<ui8> collectionB = ((t52) obj).j().b();
        collectionB.getClass();
        return new y6e(a7e.V(new y92(collectionB), sp8.b));
    }

    @Override // defpackage.n6d
    public Object e(InputStream inputStream) {
        return d;
    }

    @Override // defpackage.nvh
    public Object zza() {
        switch (this.a) {
            case 4:
                List<svh<?>> list = djh.a;
                return Long.valueOf(((ubi) vbi.b.zza()).zza());
            case 5:
                List<svh<?>> list2 = djh.a;
                return ((xhi) yhi.b.zza()).zze();
            case 6:
                List<svh<?>> list3 = djh.a;
                return Boolean.valueOf(((dii) eii.b.zza()).zza());
            default:
                List<svh<?>> list4 = djh.a;
                return Boolean.valueOf(((aei) dei.b.zza()).zzb());
        }
    }
}
