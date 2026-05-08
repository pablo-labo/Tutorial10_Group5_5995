package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import defpackage.n83;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class az1 extends ez1 {
    public final int i;
    public final int j;
    public final int k;
    public List<n83> o;
    public List<n83> p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, UiRumDebugListener.DEFAULT_ALPHA, DataOkHttpUploader.HTTP_ACCEPTED, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final g4b h = new g4b();
    public final ArrayList<a> m = new ArrayList<>();
    public a n = new a(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public static final class a {
        public final ArrayList a;
        public final ArrayList b;
        public final StringBuilder c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        /* JADX INFO: renamed from: az1$a$a, reason: collision with other inner class name */
        public static class C0084a {
            public final int a;
            public final boolean b;
            public int c;

            public C0084a(int i, int i2, boolean z) {
                this.a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public a(int i, int i2) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.b = arrayList2;
            StringBuilder sb = new StringBuilder();
            this.c = sb;
            this.g = i;
            arrayList.clear();
            arrayList2.clear();
            sb.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
            this.h = i2;
        }

        public final void a(char c) {
            StringBuilder sb = this.c;
            if (sb.length() < 32) {
                sb.append(c);
            }
        }

        public final void b() {
            StringBuilder sb = this.c;
            int length = sb.length();
            if (length > 0) {
                sb.delete(length - 1, length);
                ArrayList arrayList = this.a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0084a c0084a = (C0084a) arrayList.get(size);
                    int i = c0084a.c;
                    if (i != length) {
                        return;
                    }
                    c0084a.c = i - 1;
                }
            }
        }

        public final n83 c(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i2 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i2));
                spannableStringBuilder.append('\n');
                i2++;
            }
            spannableStringBuilder.append((CharSequence) d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.e + this.f;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.g != 2 || (Math.abs(i4) >= 3 && length >= 0)) ? (this.g != 2 || i4 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.d;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.g == 1) {
                i5 -= this.h - 1;
            }
            n83.a aVar = new n83.a();
            aVar.a = spannableStringBuilder;
            aVar.b = null;
            aVar.c = Layout.Alignment.ALIGN_NORMAL;
            aVar.e = i5;
            aVar.f = 1;
            aVar.h = f;
            aVar.i = i;
            return aVar.a();
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (true) {
                ArrayList arrayList = this.a;
                if (i5 >= arrayList.size()) {
                    break;
                }
                C0084a c0084a = (C0084a) arrayList.get(i5);
                boolean z2 = c0084a.b;
                int i7 = c0084a.a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = az1.B[i7];
                    }
                    z = z3;
                }
                int i8 = c0084a.c;
                i5++;
                if (i8 != (i5 < arrayList.size() ? ((C0084a) arrayList.get(i5)).c : length)) {
                    if (i != -1 && !z2) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        if (i3 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                        }
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (i2 != -1 && i2 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
            }
            if (i6 != length && i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final boolean e() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }
    }

    public az1(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.k = 0;
            this.j = 0;
        } else if (i == 2) {
            this.k = 1;
            this.j = 0;
        } else if (i == 3) {
            this.k = 0;
            this.j = 1;
        } else if (i != 4) {
            zkd.T("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = 0;
            this.j = 0;
        } else {
            this.k = 1;
            this.j = 1;
        }
        m(0);
        l();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.ez1, defpackage.zj3
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        m(0);
        this.r = 4;
        this.n.h = 4;
        l();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // defpackage.ez1
    public final fz1 g() {
        List<n83> list = this.o;
        this.p = list;
        list.getClass();
        return new fz1(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // defpackage.ez1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(ez1.a r15) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az1.h(ez1$a):void");
    }

    @Override // defpackage.ez1, defpackage.zj3
    /* JADX INFO: renamed from: i */
    public final bye b() {
        bye byeVarPollFirst;
        bye byeVarB = super.b();
        if (byeVarB != null) {
            return byeVarB;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (byeVarPollFirst = this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        fz1 fz1VarG = g();
        long j3 = this.e;
        byeVarPollFirst.b = j3;
        byeVarPollFirst.d = fz1VarG;
        byeVarPollFirst.e = j3;
        return byeVarPollFirst;
    }

    @Override // defpackage.ez1
    public final boolean j() {
        return this.o != this.p;
    }

    public final ArrayList k() {
        ArrayList<a> arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            n83 n83VarC = arrayList.get(i).c(Integer.MIN_VALUE);
            arrayList2.add(n83VarC);
            if (n83VarC != null) {
                iMin = Math.min(iMin, n83VarC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            n83 n83VarC2 = (n83) arrayList2.get(i2);
            if (n83VarC2 != null) {
                if (n83VarC2.i != iMin) {
                    n83VarC2 = arrayList.get(i2).c(iMin);
                    n83VarC2.getClass();
                }
                arrayList3.add(n83VarC2);
            }
        }
        return arrayList3;
    }

    public final void l() {
        a aVar = this.n;
        aVar.g = this.q;
        aVar.a.clear();
        aVar.b.clear();
        aVar.c.setLength(0);
        aVar.d = 15;
        aVar.e = 0;
        aVar.f = 0;
        ArrayList<a> arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    public final void m(int i) {
        int i2 = this.q;
        if (i2 == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            l();
            if (i2 == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i3 = 0;
        while (true) {
            ArrayList<a> arrayList = this.m;
            if (i3 >= arrayList.size()) {
                return;
            }
            arrayList.get(i3).g = i;
            i3++;
        }
    }

    @Override // defpackage.ez1, defpackage.zj3
    public final void release() {
    }
}
