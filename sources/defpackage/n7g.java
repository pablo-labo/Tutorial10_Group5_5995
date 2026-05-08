package defpackage;

import android.view.View;
import com.google.android.gms.internal.firebase_remote_config.zzhq;
import com.indeed.android.jobsearch.R;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n7g implements tme {
    public static final String a(String str, String str2) {
        str.getClass();
        String str3 = str2 == null ? "" : str2;
        try {
            URI uri = new URI(str);
            String query = uri.getQuery();
            ArrayList arrayList = query != null ? new ArrayList(zve.k0(query, new String[]{"&"})) : new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    arrayList.add("from=" + str3);
                    break;
                }
                if (wve.K((String) arrayList.get(i), "from=", false)) {
                    arrayList.set(i, "from=" + str3);
                    break;
                }
                i++;
            }
            String string = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), z92.W0(arrayList, "&", null, null, null, 62), uri.getFragment()).toString();
            string.getClass();
            return string;
        } catch (URISyntaxException e) {
            ArrayList arrayList2 = lz2.a;
            lz2.c("Failed to append 'from' parameter. Invalid URL: ".concat(str), e.toString(), false, null, 12);
            return str;
        }
    }

    public static final jrg b(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            jrg jrgVar = tag instanceof jrg ? (jrg) tag : null;
            if (jrgVar != null) {
                return jrgVar;
            }
            Object objL = u63.L(view);
            view = objL instanceof View ? (View) objL : null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix c(android.graphics.RectF r20, android.graphics.RectF r21, java.lang.String r22, int r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            float r4 = r0.left
            double r4 = (double) r4
            float r6 = r0.top
            double r6 = (double) r6
            float r8 = r0.width()
            double r8 = (double) r8
            float r0 = r0.height()
            double r10 = (double) r0
            float r0 = r1.left
            double r12 = (double) r0
            float r0 = r1.top
            double r14 = (double) r0
            float r0 = r1.width()
            double r0 = (double) r0
            r16 = r0
            float r0 = r21.height()
            double r0 = (double) r0
            r20 = r0
            double r0 = r16 / r8
            r18 = r4
            double r4 = r20 / r10
            double r18 = r18 * r0
            double r12 = r12 - r18
            double r6 = r6 * r4
            double r14 = r14 - r6
            r6 = 2
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r3 != r6) goto L60
            double r0 = java.lang.Math.min(r0, r4)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L54
            double r2 = r16 / r0
            double r2 = r2 - r8
            double r2 = r2 / r18
            double r12 = r12 - r2
            double r2 = r20 / r0
            double r2 = r2 - r10
        L50:
            double r2 = r2 / r18
            double r14 = r14 - r2
            goto L5e
        L54:
            double r8 = r8 * r0
            double r2 = r16 - r8
            double r2 = r2 / r18
            double r12 = r12 - r2
            double r10 = r10 * r0
            double r2 = r20 - r10
            goto L50
        L5e:
            r4 = r0
            goto Lb5
        L60:
            java.lang.String r6 = "none"
            boolean r7 = r2.equals(r6)
            if (r7 != 0) goto L70
            if (r3 != 0) goto L70
            double r0 = java.lang.Math.min(r0, r4)
        L6e:
            r4 = r0
            goto L7e
        L70:
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L7e
            r6 = 1
            if (r3 != r6) goto L7e
            double r0 = java.lang.Math.max(r0, r4)
            goto L6e
        L7e:
            java.lang.String r3 = "xMid"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L8d
            double r6 = r8 * r0
            double r6 = r16 - r6
            double r6 = r6 / r18
            double r12 = r12 + r6
        L8d:
            java.lang.String r3 = "xMax"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L9a
            double r8 = r8 * r0
            double r6 = r16 - r8
            double r6 = r6 + r12
            r12 = r6
        L9a:
            java.lang.String r3 = "YMid"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto La9
            double r6 = r10 * r4
            double r6 = r20 - r6
            double r6 = r6 / r18
            double r14 = r14 + r6
        La9:
            java.lang.String r3 = "YMax"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto Lb5
            double r10 = r10 * r4
            double r2 = r20 - r10
            double r14 = r14 + r2
        Lb5:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>()
            float r3 = (float) r12
            float r6 = (float) r14
            r2.postTranslate(r3, r6)
            float r0 = (float) r0
            float r1 = (float) r4
            r2.preScale(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n7g.c(android.graphics.RectF, android.graphics.RectF, java.lang.String, int):android.graphics.Matrix");
    }

    public static void d(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzhq {
        if (!g(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !g(b3) && !g(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw zzhq.h();
    }

    public static void e(byte b, byte b2, byte b3, char[] cArr, int i) throws zzhq {
        if (g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || g(b3)))) {
            throw zzhq.h();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    public static void f(byte b, byte b2, char[] cArr, int i) throws zzhq {
        if (b < -62 || g(b2)) {
            throw zzhq.h();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static boolean g(byte b) {
        return b > -65;
    }
}
