package defpackage;

import defpackage.h3;
import defpackage.rp9;
import defpackage.rw5;
import defpackage.ur1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class v4c extends rw5 implements tp9 {
    public static final v4c a;
    public static final a b = new a();
    private int bitField0_;
    private ur1 data_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int pluginId_;
    private final ur1 unknownFields;

    public static class a extends p3<v4c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new v4c(e92Var);
        }
    }

    public static final class b extends rw5.a<v4c, b> implements tp9 {
        public int b;
        public int c;
        public ur1 d = ur1.a;

        @Override // rp9.a
        public final rp9 build() {
            v4c v4cVarL = l();
            if (v4cVarL.d()) {
                return v4cVarL;
            }
            throw new UninitializedMessageException();
        }

        @Override // rw5.a
        public final Object clone() {
            b bVar = new b();
            bVar.m(l());
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
            bVar.m(l());
            return bVar;
        }

        @Override // rw5.a
        public final /* bridge */ /* synthetic */ rw5.a k(rw5 rw5Var) {
            m((v4c) rw5Var);
            return this;
        }

        public final v4c l() {
            v4c v4cVar = new v4c(this);
            int i = this.b;
            int i2 = (i & 1) != 1 ? 0 : 1;
            v4cVar.pluginId_ = this.c;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            v4cVar.data_ = this.d;
            v4cVar.bitField0_ = i2;
            return v4cVar;
        }

        public final void m(v4c v4cVar) {
            if (v4cVar == v4c.a) {
                return;
            }
            if (v4cVar.p()) {
                int iN = v4cVar.n();
                this.b |= 1;
                this.c = iN;
            }
            if (v4cVar.o()) {
                ur1 ur1VarM = v4cVar.m();
                ur1VarM.getClass();
                this.b |= 2;
                this.d = ur1VarM;
            }
            this.a = this.a.b(v4cVar.unknownFields);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void n(defpackage.e92 r2, defpackage.s45 r3) throws java.lang.Throwable {
            /*
                r1 = this;
                r3 = 0
                v4c$a r0 = defpackage.v4c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                v4c r0 = new v4c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.m(r0)
                return
            Lf:
                r2 = move-exception
                goto L1b
            L11:
                r2 = move-exception
                rp9 r0 = r2.a()     // Catch: java.lang.Throwable -> Lf
                v4c r0 = (defpackage.v4c) r0     // Catch: java.lang.Throwable -> Lf
                throw r2     // Catch: java.lang.Throwable -> L19
            L19:
                r2 = move-exception
                r3 = r0
            L1b:
                if (r3 == 0) goto L20
                r1.m(r3)
            L20:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: v4c.b.n(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }
    }

    static {
        v4c v4cVar = new v4c();
        a = v4cVar;
        v4cVar.pluginId_ = 0;
        v4cVar.data_ = ur1.a;
    }

    public v4c(e92 e92Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.pluginId_ = 0;
        this.data_ = ur1.a;
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
                                this.pluginId_ = e92Var.k();
                            } else if (iN == 18) {
                                this.bitField0_ |= 2;
                                this.data_ = e92Var.e();
                            } else if (!e92Var.q(iN, f92VarJ)) {
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
        if (!p()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (o()) {
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
        int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.pluginId_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            ur1 ur1Var = this.data_;
            iB += ur1Var.size() + f92.f(ur1Var.size()) + f92.h(2);
        }
        int size = this.unknownFields.size() + iB;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.rp9
    public final rp9.a f() {
        return new b();
    }

    @Override // defpackage.rp9
    public final void h(f92 f92Var) {
        e();
        if ((this.bitField0_ & 1) == 1) {
            f92Var.m(1, this.pluginId_);
        }
        if ((this.bitField0_ & 2) == 2) {
            ur1 ur1Var = this.data_;
            f92Var.x(2, 2);
            f92Var.v(ur1Var.size());
            f92Var.r(ur1Var);
        }
        f92Var.r(this.unknownFields);
    }

    public final ur1 m() {
        return this.data_;
    }

    public final int n() {
        return this.pluginId_;
    }

    public final boolean o() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) == 1;
    }

    public v4c() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }

    public v4c(b bVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }
}
