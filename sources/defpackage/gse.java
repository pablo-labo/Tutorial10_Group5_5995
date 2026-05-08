package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class gse<T> extends g4<hse> implements h4a<T>, rw1<T>, xv5<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(gse.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    @uh3(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, DataOkHttpUploader.HTTP_UNAUTHORIZED, 406}, m = "collect")
    public static final class a extends pu2 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ gse<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gse<T> gseVar, lu2<? super a> lu2Var) {
            super(lu2Var);
            this.this$0 = gseVar;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            this.this$0.e(null, this);
            return g13.a;
        }
    }

    public gse(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.c4a, defpackage.wi5
    public final Object a(T t, lu2<? super j6g> lu2Var) {
        setValue(t);
        return j6g.a;
    }

    @Override // defpackage.c4a
    public final boolean b(T t) {
        setValue(t);
        return true;
    }

    @Override // defpackage.mde
    public final List<T> c() {
        return u63.Z(getValue());
    }

    @Override // defpackage.xv5
    public final vi5<T> d(v03 v03Var, int i, eo1 eo1Var) {
        return (((i < 0 || i >= 2) && i != -2) || eo1Var != eo1.b) ? wg2.G(this, v03Var, i, eo1Var) : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8 A[Catch: all -> 0x009c, TryCatch #2 {all -> 0x009c, blocks: (B:37:0x00b0, B:39:0x00b8, B:42:0x00bf, B:43:0x00c3, B:45:0x00c6, B:56:0x00eb, B:59:0x00fb, B:60:0x0115, B:66:0x0127, B:69:0x012e, B:63:0x011c, B:65:0x0122, B:47:0x00cc, B:51:0x00d3, B:36:0x00a1, B:29:0x0085, B:31:0x0089), top: B:77:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6 A[Catch: all -> 0x009c, TryCatch #2 {all -> 0x009c, blocks: (B:37:0x00b0, B:39:0x00b8, B:42:0x00bf, B:43:0x00c3, B:45:0x00c6, B:56:0x00eb, B:59:0x00fb, B:60:0x0115, B:66:0x0127, B:69:0x012e, B:63:0x011c, B:65:0x0122, B:47:0x00cc, B:51:0x00d3, B:36:0x00a1, B:29:0x0085, B:31:0x0089), top: B:77:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb A[Catch: all -> 0x009c, TryCatch #2 {all -> 0x009c, blocks: (B:37:0x00b0, B:39:0x00b8, B:42:0x00bf, B:43:0x00c3, B:45:0x00c6, B:56:0x00eb, B:59:0x00fb, B:60:0x0115, B:66:0x0127, B:69:0x012e, B:63:0x011c, B:65:0x0122, B:47:0x00cc, B:51:0x00d3, B:36:0x00a1, B:29:0x0085, B:31:0x0089), top: B:77:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [hse] */
    /* JADX WARN: Type inference failed for: r1v14, types: [hse] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [hse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [hse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [i4] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, wi5] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v8, types: [wi5] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00fa -> B:37:0x00b0). Please report as a decompilation issue!!! */
    @Override // defpackage.vi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.wi5<? super T> r14, defpackage.lu2<?> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gse.e(wi5, lu2):java.lang.Object");
    }

    @Override // defpackage.h4a, defpackage.fse
    public final T getValue() {
        ux0 ux0Var = ewa.W;
        T t = (T) f.get(this);
        if (t == ux0Var) {
            return null;
        }
        return t;
    }

    @Override // defpackage.h4a
    public final boolean h(T t, T t2) {
        ux0 ux0Var = ewa.W;
        if (t == null) {
            t = (T) ux0Var;
        }
        if (t2 == null) {
            t2 = (T) ux0Var;
        }
        return m(t, t2);
    }

    @Override // defpackage.c4a
    public final void i() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.g4
    public final i4 j() {
        return new hse();
    }

    @Override // defpackage.g4
    public final i4[] k() {
        return new hse[2];
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        Object obj3;
        ux0 ux0Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !wl7.b(obj4, obj)) {
                return false;
            }
            if (wl7.b(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            Object obj5 = this.a;
            j6g j6gVar = j6g.a;
            while (true) {
                hse[] hseVarArr = (hse[]) obj5;
                if (hseVarArr != null) {
                    for (hse hseVar : hseVarArr) {
                        if (hseVar != null) {
                            AtomicReference<Object> atomicReference = hseVar.a;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 != null && obj6 != (ux0Var = hh2.Z)) {
                                    ux0 ux0Var2 = hh2.Y;
                                    if (obj6 != ux0Var2) {
                                        while (!atomicReference.compareAndSet(obj6, ux0Var2)) {
                                            if (atomicReference.get() != obj6) {
                                                break;
                                            }
                                        }
                                        ((qw1) obj6).resumeWith(j6g.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj6, ux0Var)) {
                                        if (atomicReference.get() != obj6) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    obj3 = this.a;
                    j6g j6gVar2 = j6g.a;
                }
                obj5 = obj3;
                i3 = i;
            }
        }
    }

    @Override // defpackage.h4a
    public final void setValue(T t) {
        if (t == null) {
            t = (T) ewa.W;
        }
        m(null, t);
    }
}
