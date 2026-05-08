package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zle implements Iterable<Long>, ze8 {
    public static final zle e = new zle(0, 0, 0, null);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    @uh3(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 263}, m = "invokeSuspend")
    public static final class a extends n7d implements Function2<t6e<? super Long>, lu2<? super j6g>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = zle.this.new a(lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(t6e<? super Long> t6eVar, lu2<? super j6g> lu2Var) {
            return ((a) create(t6eVar, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0086 -> B:26:0x009d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d0 -> B:37:0x00d1). Please report as a decompilation issue!!! */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 215
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: zle.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public zle(long j, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public final zle a(zle zleVar) {
        long[] jArr;
        zle zleVarB = this;
        zle zleVar2 = e;
        if (zleVar == zleVar2) {
            return zleVarB;
        }
        if (zleVarB == zleVar2) {
            return zleVar2;
        }
        long j = zleVar.c;
        long j2 = zleVar.c;
        long[] jArr2 = zleVar.d;
        long j3 = zleVar.b;
        long j4 = zleVar.a;
        long j5 = zleVarB.c;
        if (j == j5 && jArr2 == (jArr = zleVarB.d)) {
            return new zle(zleVarB.a & (~j4), zleVarB.b & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                zleVarB = zleVarB.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    zleVarB = zleVarB.b(((long) i) + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    zleVarB = zleVarB.b(((long) i2) + j2 + 64);
                }
            }
        }
        return zleVarB;
    }

    public final zle b(long j) {
        long[] jArr;
        int iA;
        long[] jArr2;
        long j2 = j - this.c;
        if (wl7.d(j2, 0L) >= 0 && wl7.d(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.b;
            if ((j4 & j3) != 0) {
                return new zle(this.a, j4 & (~j3), this.c, this.d);
            }
        } else if (wl7.d(j2, 64L) >= 0 && wl7.d(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.a;
            if ((j6 & j5) != 0) {
                return new zle(j6 & (~j5), this.b, this.c, this.d);
            }
        } else if (wl7.d(j2, 0L) < 0 && (jArr = this.d) != null && (iA = yid.a(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iA > 0) {
                    pyd.i(0, 0, iA, jArr, jArr3);
                }
                if (iA < i) {
                    pyd.i(iA, iA + 1, length, jArr, jArr3);
                }
                jArr2 = jArr3;
            }
            return new zle(this.a, this.b, this.c, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.c;
        return (wl7.d(j2, 0L) < 0 || wl7.d(j2, 64L) >= 0) ? (wl7.d(j2, 64L) < 0 || wl7.d(j2, 128L) >= 0) ? wl7.d(j2, 0L) <= 0 && (jArr = this.d) != null && yid.a(jArr, j) >= 0 : ((1 << (((int) j2) + (-64))) & this.a) != 0 : ((1 << ((int) j2)) & this.b) != 0;
    }

    public final zle f(zle zleVar) {
        zle zleVarG;
        long[] jArr;
        zle zleVarG2 = this;
        zle zleVar2 = e;
        if (zleVar == zleVar2) {
            return zleVarG2;
        }
        if (zleVarG2 == zleVar2) {
            return zleVar;
        }
        long j = zleVar.c;
        long j2 = zleVar.c;
        long[] jArr2 = zleVar.d;
        long j3 = zleVar.b;
        long j4 = zleVar.a;
        long j5 = zleVarG2.c;
        long j6 = zleVarG2.b;
        long j7 = zleVarG2.a;
        if (j == j5 && jArr2 == (jArr = zleVarG2.d)) {
            return new zle(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = zleVarG2.d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j8 : jArr2) {
                    zleVarG2 = zleVarG2.g(j8);
                }
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        zleVarG2 = zleVarG2.g(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        zleVarG2 = zleVarG2.g(((long) i) + j2 + 64);
                    }
                    i++;
                }
            }
            return zleVarG2;
        }
        if (jArr3 != null) {
            zleVarG = zleVar;
            for (long j9 : jArr3) {
                zleVarG = zleVarG.g(j9);
            }
        } else {
            zleVarG = zleVar;
        }
        long j10 = zleVarG2.c;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    zleVarG = zleVarG.g(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    zleVarG = zleVarG.g(((long) i) + j10 + 64);
                }
                i++;
            }
        }
        return zleVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zle g(long r30) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zle.g(long):zle");
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return q92.w(new a(null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(t92.r0(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
