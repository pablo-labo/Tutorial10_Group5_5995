package defpackage;

import android.database.Cursor;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class yze implements iid {
    public final sze a;
    public final String b;
    public boolean c;

    public static final class a extends yze {
        public String[] V;
        public byte[][] W;
        public Cursor X;
        public int[] d;
        public long[] e;
        public double[] f;

        /* JADX INFO: renamed from: yze$a$a, reason: collision with other inner class name */
        public static final class C0486a implements xze {
            public C0486a() {
            }

            @Override // defpackage.xze
            public final int a() {
                return a.this.d.length;
            }

            @Override // defpackage.xze
            public final String h() {
                return a.this.b;
            }

            @Override // defpackage.xze
            public final void p(wze wzeVar) {
                a aVar = a.this;
                int length = aVar.d.length;
                for (int i = 1; i < length; i++) {
                    int i2 = aVar.d[i];
                    if (i2 == 1) {
                        wzeVar.q(i, aVar.e[i]);
                    } else if (i2 == 2) {
                        wzeVar.e(i, aVar.f[i]);
                    } else if (i2 == 3) {
                        String str = aVar.V[i];
                        str.getClass();
                        wzeVar.n(i, str);
                    } else if (i2 == 4) {
                        byte[] bArr = aVar.W[i];
                        bArr.getClass();
                        wzeVar.r(i, bArr);
                    } else if (i2 == 5) {
                        wzeVar.u(i);
                    }
                }
            }
        }

        public static void s(Cursor cursor, int i) {
            if (i < 0 || i >= cursor.getColumnCount()) {
                zkd.O(25, "column index out of range");
                throw null;
            }
        }

        @Override // defpackage.iid
        public final boolean M1() {
            a();
            p();
            Cursor cursor = this.X;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            r6.g("Required value was null.");
            return false;
        }

        @Override // defpackage.iid
        public final void R(int i, String str) {
            str.getClass();
            a();
            h(3, i);
            this.d[i] = 3;
            this.V[i] = str;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (!this.c) {
                a();
                this.d = new int[0];
                this.e = new long[0];
                this.f = new double[0];
                this.V = new String[0];
                this.W = new byte[0][];
                reset();
            }
            this.c = true;
        }

        @Override // defpackage.iid
        public final void e(int i, double d) {
            a();
            h(2, i);
            this.d[i] = 2;
            this.f[i] = d;
        }

        @Override // defpackage.iid
        public final int getColumnCount() {
            a();
            p();
            Cursor cursor = this.X;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // defpackage.iid
        public final String getColumnName(int i) {
            a();
            p();
            Cursor cursor = this.X;
            if (cursor == null) {
                r6.g("Required value was null.");
                return null;
            }
            s(cursor, i);
            String columnName = cursor.getColumnName(i);
            columnName.getClass();
            return columnName;
        }

        @Override // defpackage.iid
        public final double getDouble(int i) {
            a();
            Cursor cursorV = v();
            s(cursorV, i);
            return cursorV.getDouble(i);
        }

        @Override // defpackage.iid
        public final long getLong(int i) {
            a();
            Cursor cursorV = v();
            s(cursorV, i);
            return cursorV.getLong(i);
        }

        public final void h(int i, int i2) {
            int i3 = i2 + 1;
            int[] iArr = this.d;
            if (iArr.length < i3) {
                this.d = Arrays.copyOf(iArr, i3);
            }
            if (i == 1) {
                long[] jArr = this.e;
                if (jArr.length < i3) {
                    this.e = Arrays.copyOf(jArr, i3);
                    return;
                }
                return;
            }
            if (i == 2) {
                double[] dArr = this.f;
                if (dArr.length < i3) {
                    this.f = Arrays.copyOf(dArr, i3);
                    return;
                }
                return;
            }
            if (i == 3) {
                String[] strArr = this.V;
                if (strArr.length < i3) {
                    this.V = (String[]) Arrays.copyOf(strArr, i3);
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            byte[][] bArr = this.W;
            if (bArr.length < i3) {
                this.W = (byte[][]) Arrays.copyOf(bArr, i3);
            }
        }

        @Override // defpackage.iid
        public final boolean isNull(int i) {
            a();
            Cursor cursorV = v();
            s(cursorV, i);
            return cursorV.isNull(i);
        }

        public final void p() {
            if (this.X == null) {
                this.X = this.a.z(new C0486a());
            }
        }

        @Override // defpackage.iid
        public final void q(int i, long j) {
            a();
            h(1, i);
            this.d[i] = 1;
            this.e[i] = j;
        }

        @Override // defpackage.iid
        public final void r(int i, byte[] bArr) {
            a();
            h(4, i);
            this.d[i] = 4;
            this.W[i] = bArr;
        }

        @Override // defpackage.iid
        public final String r1(int i) {
            a();
            Cursor cursorV = v();
            s(cursorV, i);
            String string = cursorV.getString(i);
            string.getClass();
            return string;
        }

        @Override // defpackage.iid
        public final void reset() {
            a();
            Cursor cursor = this.X;
            if (cursor != null) {
                cursor.close();
            }
            this.X = null;
        }

        @Override // defpackage.iid
        public final void u(int i) {
            a();
            h(5, i);
            this.d[i] = 5;
        }

        public final Cursor v() {
            Cursor cursor = this.X;
            if (cursor != null) {
                return cursor;
            }
            zkd.O(21, "no row");
            throw null;
        }
    }

    public static final class b extends yze {
        public final zze d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(sze szeVar, String str) {
            super(szeVar, str);
            szeVar.getClass();
            str.getClass();
            this.d = szeVar.O0(str);
        }

        @Override // defpackage.iid
        public final boolean M1() {
            a();
            this.d.b();
            return false;
        }

        @Override // defpackage.iid
        public final void R(int i, String str) {
            str.getClass();
            a();
            this.d.n(i, str);
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws IOException {
            this.d.close();
            this.c = true;
        }

        @Override // defpackage.iid
        public final void e(int i, double d) {
            a();
            this.d.e(i, d);
        }

        @Override // defpackage.iid
        public final int getColumnCount() {
            a();
            return 0;
        }

        @Override // defpackage.iid
        public final String getColumnName(int i) {
            a();
            zkd.O(21, "no row");
            throw null;
        }

        @Override // defpackage.iid
        public final double getDouble(int i) {
            a();
            zkd.O(21, "no row");
            throw null;
        }

        @Override // defpackage.iid
        public final long getLong(int i) {
            a();
            zkd.O(21, "no row");
            throw null;
        }

        @Override // defpackage.iid
        public final boolean isNull(int i) {
            a();
            zkd.O(21, "no row");
            throw null;
        }

        @Override // defpackage.iid
        public final void q(int i, long j) {
            a();
            this.d.q(i, j);
        }

        @Override // defpackage.iid
        public final void r(int i, byte[] bArr) {
            a();
            this.d.r(i, bArr);
        }

        @Override // defpackage.iid
        public final String r1(int i) {
            a();
            zkd.O(21, "no row");
            throw null;
        }

        @Override // defpackage.iid
        public final void reset() {
        }

        @Override // defpackage.iid
        public final void u(int i) {
            a();
            this.d.u(i);
        }
    }

    public yze(sze szeVar, String str) {
        this.a = szeVar;
        this.b = str;
    }

    public final void a() {
        if (this.c) {
            zkd.O(21, "statement is closed");
            throw null;
        }
    }
}
