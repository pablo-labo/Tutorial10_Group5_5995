package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import defpackage.h3;
import defpackage.rp9;
import defpackage.rw5;
import defpackage.ur1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class z4c extends rw5.c<z4c> {
    public static final z4c a;
    public static final a b = new a();
    private int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private final ur1 unknownFields;

    public static class a extends p3<z4c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new z4c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.b<z4c, b> {
        public int d;
        public int e;

        @Override // rp9.a
        public final rp9 build() {
            z4c z4cVar = new z4c(this);
            int i = (this.d & 1) != 1 ? 0 : 1;
            z4cVar.name_ = this.e;
            z4cVar.bitField0_ = i;
            if (z4cVar.d()) {
                return z4cVar;
            }
            throw new UninitializedMessageException();
        }

        @Override // rw5.a
        public final Object clone() {
            b bVar = new b();
            z4c z4cVar = new z4c(this);
            int i = (this.d & 1) != 1 ? 0 : 1;
            z4cVar.name_ = this.e;
            z4cVar.bitField0_ = i;
            bVar.m(z4cVar);
            return bVar;
        }

        @Override // h3.a
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ h3.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }

        @Override // rw5.a
        /* JADX INFO: renamed from: j */
        public final rw5.a clone() {
            b bVar = new b();
            z4c z4cVar = new z4c(this);
            int i = (this.d & 1) != 1 ? 0 : 1;
            z4cVar.name_ = this.e;
            z4cVar.bitField0_ = i;
            bVar.m(z4cVar);
            return bVar;
        }

        @Override // rw5.a
        public final /* bridge */ /* synthetic */ rw5.a k(rw5 rw5Var) {
            m((z4c) rw5Var);
            return this;
        }

        public final void m(z4c z4cVar) {
            if (z4cVar == z4c.a) {
                return;
            }
            if (z4cVar.w()) {
                int iV = z4cVar.v();
                this.d |= 1;
                this.e = iV;
            }
            l(z4cVar);
            this.a = this.a.b(z4cVar.unknownFields);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void n(defpackage.e92 r3, defpackage.s45 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                z4c$a r1 = defpackage.z4c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                z4c r1 = new z4c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.m(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                z4c r4 = (defpackage.z4c) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: z4c.b.n(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }
    }

    static {
        z4c z4cVar = new z4c(0);
        a = z4cVar;
        z4cVar.name_ = 0;
    }

    public z4c() {
        throw null;
    }

    public z4c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.name_ = 0;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iN = e92Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = e92Var.k();
                            } else if (!q(e92Var, f92VarJ, s45Var, iN)) {
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                        invalidProtocolBufferException.b(this);
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.b(this);
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    f92VarJ.k();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = bVar.p();
                    throw th2;
                }
                this.unknownFields = bVar.p();
                p();
                throw th;
            }
        }
        try {
            f92VarJ.k();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = bVar.p();
            throw th3;
        }
        this.unknownFields = bVar.p();
        p();
    }

    @Override // defpackage.rp9
    public final rp9.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    @Override // defpackage.tp9
    public final boolean d() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (j()) {
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }
        this.memoizedIsInitialized = (byte) 0;
        return false;
    }

    @Override // defpackage.rp9
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int size = this.unknownFields.size() + k() + ((this.bitField0_ & 1) == 1 ? f92.b(1, this.name_) : 0);
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.rp9
    public final rp9.a f() {
        return new b();
    }

    @Override // defpackage.tp9
    public final rp9 g() {
        return a;
    }

    @Override // defpackage.rp9
    public final void h(f92 f92Var) {
        e();
        rw5.c.a aVar = new rw5.c.a(this);
        if ((this.bitField0_ & 1) == 1) {
            f92Var.m(1, this.name_);
        }
        aVar.a(UiRumDebugListener.DEFAULT_ALPHA, f92Var);
        f92Var.r(this.unknownFields);
    }

    public final int v() {
        return this.name_;
    }

    public final boolean w() {
        return (this.bitField0_ & 1) == 1;
    }

    public z4c(b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public z4c(int i) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
