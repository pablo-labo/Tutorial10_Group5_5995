package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import defpackage.h3;
import defpackage.j5c;
import defpackage.rp9;
import defpackage.rw5;
import defpackage.ur1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class n5c extends rw5.c<n5c> {
    public static final n5c a;
    public static final a b = new a();
    private int bitField0_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int typeId_;
    private j5c type_;
    private final ur1 unknownFields;
    private int varargElementTypeId_;
    private j5c varargElementType_;

    public static class a extends p3<n5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new n5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.b<n5c, b> {
        public j5c V;
        public int W;
        public j5c X;
        public int Y;
        public int d;
        public int e;
        public int f;

        public b() {
            j5c j5cVar = j5c.a;
            this.V = j5cVar;
            this.X = j5cVar;
        }

        @Override // rp9.a
        public final rp9 build() {
            n5c n5cVarM = m();
            if (n5cVarM.d()) {
                return n5cVarM;
            }
            throw new UninitializedMessageException();
        }

        @Override // rw5.a
        public final Object clone() {
            b bVar = new b();
            bVar.n(m());
            return bVar;
        }

        @Override // h3.a
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ h3.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }

        @Override // rw5.a
        /* JADX INFO: renamed from: j */
        public final rw5.a clone() {
            b bVar = new b();
            bVar.n(m());
            return bVar;
        }

        @Override // rw5.a
        public final /* bridge */ /* synthetic */ rw5.a k(rw5 rw5Var) {
            n((n5c) rw5Var);
            return this;
        }

        public final n5c m() {
            n5c n5cVar = new n5c(this);
            int i = this.d;
            int i2 = (i & 1) != 1 ? 0 : 1;
            n5cVar.flags_ = this.e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            n5cVar.name_ = this.f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            n5cVar.type_ = this.V;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            n5cVar.typeId_ = this.W;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            n5cVar.varargElementType_ = this.X;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            n5cVar.varargElementTypeId_ = this.Y;
            n5cVar.bitField0_ = i2;
            return n5cVar;
        }

        public final void n(n5c n5cVar) {
            j5c j5cVar;
            j5c j5cVar2;
            if (n5cVar == n5c.a) {
                return;
            }
            if (n5cVar.G()) {
                int iA = n5cVar.A();
                this.d |= 1;
                this.e = iA;
            }
            if (n5cVar.H()) {
                int iB = n5cVar.B();
                this.d |= 2;
                this.f = iB;
            }
            if (n5cVar.I()) {
                j5c j5cVarC = n5cVar.C();
                if ((this.d & 4) != 4 || (j5cVar2 = this.V) == j5c.a) {
                    this.V = j5cVarC;
                } else {
                    j5c.c cVarM0 = j5c.m0(j5cVar2);
                    cVarM0.n(j5cVarC);
                    this.V = cVarM0.m();
                }
                this.d |= 4;
            }
            if (n5cVar.J()) {
                int iD = n5cVar.D();
                this.d |= 8;
                this.W = iD;
            }
            if (n5cVar.K()) {
                j5c j5cVarE = n5cVar.E();
                if ((this.d & 16) != 16 || (j5cVar = this.X) == j5c.a) {
                    this.X = j5cVarE;
                } else {
                    j5c.c cVarM02 = j5c.m0(j5cVar);
                    cVarM02.n(j5cVarE);
                    this.X = cVarM02.m();
                }
                this.d |= 16;
            }
            if (n5cVar.L()) {
                int iF = n5cVar.F();
                this.d |= 32;
                this.Y = iF;
            }
            l(n5cVar);
            this.a = this.a.b(n5cVar.unknownFields);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void o(defpackage.e92 r3, defpackage.s45 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                n5c$a r1 = defpackage.n5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                n5c r1 = new n5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.n(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                n5c r4 = (defpackage.n5c) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.n(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: n5c.b.o(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }
    }

    static {
        n5c n5cVar = new n5c(0);
        a = n5cVar;
        n5cVar.flags_ = 0;
        n5cVar.name_ = 0;
        j5c j5cVar = j5c.a;
        n5cVar.type_ = j5cVar;
        n5cVar.typeId_ = 0;
        n5cVar.varargElementType_ = j5cVar;
        n5cVar.varargElementTypeId_ = 0;
    }

    public n5c() {
        throw null;
    }

    public n5c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.flags_ = 0;
        this.name_ = 0;
        j5c j5cVar = j5c.a;
        this.type_ = j5cVar;
        this.typeId_ = 0;
        this.varargElementType_ = j5cVar;
        this.varargElementTypeId_ = 0;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        while (!z) {
            try {
                try {
                    int iN = e92Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = e92Var.k();
                        } else if (iN != 16) {
                            j5c.c cVarM0 = null;
                            if (iN == 26) {
                                if ((this.bitField0_ & 4) == 4) {
                                    j5c j5cVar2 = this.type_;
                                    j5cVar2.getClass();
                                    cVarM0 = j5c.m0(j5cVar2);
                                }
                                j5c j5cVar3 = (j5c) e92Var.g(j5c.b, s45Var);
                                this.type_ = j5cVar3;
                                if (cVarM0 != null) {
                                    cVarM0.n(j5cVar3);
                                    this.type_ = cVarM0.m();
                                }
                                this.bitField0_ |= 4;
                            } else if (iN == 34) {
                                if ((this.bitField0_ & 16) == 16) {
                                    j5c j5cVar4 = this.varargElementType_;
                                    j5cVar4.getClass();
                                    cVarM0 = j5c.m0(j5cVar4);
                                }
                                j5c j5cVar5 = (j5c) e92Var.g(j5c.b, s45Var);
                                this.varargElementType_ = j5cVar5;
                                if (cVarM0 != null) {
                                    cVarM0.n(j5cVar5);
                                    this.varargElementType_ = cVarM0.m();
                                }
                                this.bitField0_ |= 16;
                            } else if (iN == 40) {
                                this.bitField0_ |= 8;
                                this.typeId_ = e92Var.k();
                            } else if (iN == 48) {
                                this.bitField0_ |= 32;
                                this.varargElementTypeId_ = e92Var.k();
                            } else if (!q(e92Var, f92VarJ, s45Var, iN)) {
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.name_ = e92Var.k();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.b(this);
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.b(this);
                    throw invalidProtocolBufferException;
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

    public final int A() {
        return this.flags_;
    }

    public final int B() {
        return this.name_;
    }

    public final j5c C() {
        return this.type_;
    }

    public final int D() {
        return this.typeId_;
    }

    public final j5c E() {
        return this.varargElementType_;
    }

    public final int F() {
        return this.varargElementTypeId_;
    }

    public final boolean G() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean H() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean I() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean J() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean K() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean L() {
        return (this.bitField0_ & 32) == 32;
    }

    @Override // defpackage.rp9
    public final rp9.a c() {
        b bVar = new b();
        bVar.n(this);
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
        if (!H()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (I() && !this.type_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (K() && !this.varargElementType_.d()) {
            this.memoizedIsInitialized = (byte) 0;
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
        int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iB += f92.b(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iB += f92.d(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iB += f92.d(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iB += f92.b(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iB += f92.b(6, this.varargElementTypeId_);
        }
        int size = this.unknownFields.size() + k() + iB;
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
            f92Var.m(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            f92Var.m(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            f92Var.o(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            f92Var.o(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            f92Var.m(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            f92Var.m(6, this.varargElementTypeId_);
        }
        aVar.a(UiRumDebugListener.DEFAULT_ALPHA, f92Var);
        f92Var.r(this.unknownFields);
    }

    public n5c(b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public n5c(int i) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
