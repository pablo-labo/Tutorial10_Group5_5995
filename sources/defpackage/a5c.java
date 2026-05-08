package defpackage;

import defpackage.h3;
import defpackage.j5c;
import defpackage.pi7;
import defpackage.rp9;
import defpackage.rw5;
import defpackage.ur1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class a5c extends rw5 implements tp9 {
    public static final a5c a;
    public static final a b = new a();
    private List<a5c> andArgument_;
    private int bitField0_;
    private c constantValue_;
    private int flags_;
    private int isInstanceTypeId_;
    private j5c isInstanceType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<a5c> orArgument_;
    private final ur1 unknownFields;
    private int valueParameterReference_;

    public static class a extends p3<a5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new a5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.a<a5c, b> implements tp9 {
        public int V;
        public List<a5c> W;
        public List<a5c> X;
        public int b;
        public int c;
        public int d;
        public c e = c.TRUE;
        public j5c f = j5c.a;

        public b() {
            List<a5c> list = Collections.EMPTY_LIST;
            this.W = list;
            this.X = list;
        }

        @Override // rp9.a
        public final rp9 build() {
            a5c a5cVarL = l();
            if (a5cVarL.d()) {
                return a5cVarL;
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
            m((a5c) rw5Var);
            return this;
        }

        public final a5c l() {
            a5c a5cVar = new a5c(this);
            int i = this.b;
            int i2 = (i & 1) != 1 ? 0 : 1;
            a5cVar.flags_ = this.c;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            a5cVar.valueParameterReference_ = this.d;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            a5cVar.constantValue_ = this.e;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            a5cVar.isInstanceType_ = this.f;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            a5cVar.isInstanceTypeId_ = this.V;
            if ((this.b & 32) == 32) {
                this.W = Collections.unmodifiableList(this.W);
                this.b &= -33;
            }
            a5cVar.andArgument_ = this.W;
            if ((this.b & 64) == 64) {
                this.X = Collections.unmodifiableList(this.X);
                this.b &= -65;
            }
            a5cVar.orArgument_ = this.X;
            a5cVar.bitField0_ = i2;
            return a5cVar;
        }

        public final void m(a5c a5cVar) {
            j5c j5cVar;
            if (a5cVar == a5c.a) {
                return;
            }
            if (a5cVar.z()) {
                int iU = a5cVar.u();
                this.b |= 1;
                this.c = iU;
            }
            if (a5cVar.C()) {
                int iX = a5cVar.x();
                this.b |= 2;
                this.d = iX;
            }
            if (a5cVar.y()) {
                c cVarT = a5cVar.t();
                cVarT.getClass();
                this.b |= 4;
                this.e = cVarT;
            }
            if (a5cVar.A()) {
                j5c j5cVarV = a5cVar.v();
                if ((this.b & 8) != 8 || (j5cVar = this.f) == j5c.a) {
                    this.f = j5cVarV;
                } else {
                    j5c.c cVarM0 = j5c.m0(j5cVar);
                    cVarM0.n(j5cVarV);
                    this.f = cVarM0.m();
                }
                this.b |= 8;
            }
            if (a5cVar.B()) {
                int iW = a5cVar.w();
                this.b |= 16;
                this.V = iW;
            }
            if (!a5cVar.andArgument_.isEmpty()) {
                if (this.W.isEmpty()) {
                    this.W = a5cVar.andArgument_;
                    this.b &= -33;
                } else {
                    if ((this.b & 32) != 32) {
                        this.W = new ArrayList(this.W);
                        this.b |= 32;
                    }
                    this.W.addAll(a5cVar.andArgument_);
                }
            }
            if (!a5cVar.orArgument_.isEmpty()) {
                if (this.X.isEmpty()) {
                    this.X = a5cVar.orArgument_;
                    this.b &= -65;
                } else {
                    if ((this.b & 64) != 64) {
                        this.X = new ArrayList(this.X);
                        this.b |= 64;
                    }
                    this.X.addAll(a5cVar.orArgument_);
                }
            }
            this.a = this.a.b(a5cVar.unknownFields);
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
                a5c$a r1 = defpackage.a5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                a5c r1 = new a5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.m(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                a5c r4 = (defpackage.a5c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: a5c.b.n(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }
    }

    public enum c implements pi7.a {
        TRUE(0),
        FALSE(1),
        NULL(2);

        private final int value;

        c(int i) {
            this.value = i;
        }

        @Override // pi7.a
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        a5c a5cVar = new a5c();
        a = a5cVar;
        a5cVar.flags_ = 0;
        a5cVar.valueParameterReference_ = 0;
        a5cVar.constantValue_ = c.TRUE;
        a5cVar.isInstanceType_ = j5c.a;
        a5cVar.isInstanceTypeId_ = 0;
        List<a5c> list = Collections.EMPTY_LIST;
        a5cVar.andArgument_ = list;
        a5cVar.orArgument_ = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public a5c(e92 e92Var, s45 s45Var) {
        c cVar;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.flags_ = 0;
        this.valueParameterReference_ = 0;
        c cVar2 = c.TRUE;
        this.constantValue_ = cVar2;
        this.isInstanceType_ = j5c.a;
        this.isInstanceTypeId_ = 0;
        List<a5c> list = Collections.EMPTY_LIST;
        this.andArgument_ = list;
        this.orArgument_ = list;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iN = e92Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.bitField0_ |= 1;
                                this.flags_ = e92Var.k();
                            } else if (iN != 16) {
                                Object objM0 = null;
                                if (iN == 24) {
                                    int iK = e92Var.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objM0 = c.FALSE;
                                        } else if (iK == 2) {
                                            objM0 = c.NULL;
                                        }
                                        cVar = objM0;
                                    } else {
                                        cVar = cVar2;
                                    }
                                    if (cVar == 0) {
                                        f92VarJ.v(iN);
                                        f92VarJ.v(iK);
                                    } else {
                                        this.bitField0_ |= 4;
                                        this.constantValue_ = cVar;
                                    }
                                } else if (iN == 34) {
                                    if ((this.bitField0_ & 8) == 8) {
                                        j5c j5cVar = this.isInstanceType_;
                                        j5cVar.getClass();
                                        objM0 = j5c.m0(j5cVar);
                                    }
                                    j5c.c cVar3 = objM0;
                                    j5c j5cVar2 = (j5c) e92Var.g(j5c.b, s45Var);
                                    this.isInstanceType_ = j5cVar2;
                                    if (cVar3 != 0) {
                                        cVar3.n(j5cVar2);
                                        this.isInstanceType_ = cVar3.m();
                                    }
                                    this.bitField0_ |= 8;
                                } else if (iN != 40) {
                                    a aVar = b;
                                    if (iN == 50) {
                                        if ((i & 32) != 32) {
                                            this.andArgument_ = new ArrayList();
                                            i |= 32;
                                        }
                                        this.andArgument_.add((a5c) e92Var.g(aVar, s45Var));
                                    } else if (iN == 58) {
                                        if ((i & 64) != 64) {
                                            this.orArgument_ = new ArrayList();
                                            i |= 64;
                                        }
                                        this.orArgument_.add((a5c) e92Var.g(aVar, s45Var));
                                    } else if (!e92Var.q(iN, f92VarJ)) {
                                    }
                                } else {
                                    this.bitField0_ |= 16;
                                    this.isInstanceTypeId_ = e92Var.k();
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.valueParameterReference_ = e92Var.k();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.b(this);
                        throw e;
                    }
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.b(this);
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if ((i & 32) == 32) {
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                }
                if ((i & 64) == 64) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
                }
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
        if ((i & 32) == 32) {
            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
        }
        if ((i & 64) == 64) {
            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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

    public final boolean A() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean B() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean C() {
        return (this.bitField0_ & 2) == 2;
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
        if (A() && !this.isInstanceType_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            if (!this.andArgument_.get(i).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            if (!this.orArgument_.get(i2).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.rp9
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iB += f92.b(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iB += f92.a(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iB += f92.d(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iB += f92.b(5, this.isInstanceTypeId_);
        }
        for (int i2 = 0; i2 < this.andArgument_.size(); i2++) {
            iB += f92.d(6, this.andArgument_.get(i2));
        }
        for (int i3 = 0; i3 < this.orArgument_.size(); i3++) {
            iB += f92.d(7, this.orArgument_.get(i3));
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
            f92Var.m(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            f92Var.m(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            f92Var.l(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            f92Var.o(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            f92Var.m(5, this.isInstanceTypeId_);
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            f92Var.o(6, this.andArgument_.get(i));
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            f92Var.o(7, this.orArgument_.get(i2));
        }
        f92Var.r(this.unknownFields);
    }

    public final c t() {
        return this.constantValue_;
    }

    public final int u() {
        return this.flags_;
    }

    public final j5c v() {
        return this.isInstanceType_;
    }

    public final int w() {
        return this.isInstanceTypeId_;
    }

    public final int x() {
        return this.valueParameterReference_;
    }

    public final boolean y() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean z() {
        return (this.bitField0_ & 1) == 1;
    }

    public a5c() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }

    public a5c(b bVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }
}
