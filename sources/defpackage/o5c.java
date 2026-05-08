package defpackage;

import defpackage.h3;
import defpackage.pi7;
import defpackage.rp9;
import defpackage.rw5;
import defpackage.ur1;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class o5c extends rw5 implements tp9 {
    public static final o5c a;
    public static final a b = new a();
    private int bitField0_;
    private int errorCode_;
    private c level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int message_;
    private final ur1 unknownFields;
    private int versionFull_;
    private d versionKind_;
    private int version_;

    public static class a extends p3<o5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new o5c(e92Var);
        }
    }

    public static final class b extends rw5.a<o5c, b> implements tp9 {
        public int V;
        public int b;
        public int c;
        public int d;
        public int f;
        public c e = c.ERROR;
        public d W = d.LANGUAGE_VERSION;

        @Override // rp9.a
        public final rp9 build() {
            o5c o5cVarL = l();
            if (o5cVarL.d()) {
                return o5cVarL;
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
            m((o5c) rw5Var);
            return this;
        }

        public final o5c l() {
            o5c o5cVar = new o5c(this);
            int i = this.b;
            int i2 = (i & 1) != 1 ? 0 : 1;
            o5cVar.version_ = this.c;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            o5cVar.versionFull_ = this.d;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            o5cVar.level_ = this.e;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            o5cVar.errorCode_ = this.f;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            o5cVar.message_ = this.V;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            o5cVar.versionKind_ = this.W;
            o5cVar.bitField0_ = i2;
            return o5cVar;
        }

        public final void m(o5c o5cVar) {
            if (o5cVar == o5c.a) {
                return;
            }
            if (o5cVar.z()) {
                int iT = o5cVar.t();
                this.b |= 1;
                this.c = iT;
            }
            if (o5cVar.A()) {
                int iU = o5cVar.u();
                this.b |= 2;
                this.d = iU;
            }
            if (o5cVar.x()) {
                c cVarR = o5cVar.r();
                cVarR.getClass();
                this.b |= 4;
                this.e = cVarR;
            }
            if (o5cVar.w()) {
                int iQ = o5cVar.q();
                this.b |= 8;
                this.f = iQ;
            }
            if (o5cVar.y()) {
                int iS = o5cVar.s();
                this.b |= 16;
                this.V = iS;
            }
            if (o5cVar.B()) {
                d dVarV = o5cVar.v();
                dVarV.getClass();
                this.b |= 32;
                this.W = dVarV;
            }
            this.a = this.a.b(o5cVar.unknownFields);
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
                o5c$a r0 = defpackage.o5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                o5c r0 = new o5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.m(r0)
                return
            Lf:
                r2 = move-exception
                goto L1b
            L11:
                r2 = move-exception
                rp9 r0 = r2.a()     // Catch: java.lang.Throwable -> Lf
                o5c r0 = (defpackage.o5c) r0     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: o5c.b.n(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }
    }

    public enum c implements pi7.a {
        WARNING(0),
        ERROR(1),
        HIDDEN(2);

        private final int value;

        c(int i) {
            this.value = i;
        }

        @Override // pi7.a
        public final int getNumber() {
            return this.value;
        }
    }

    public enum d implements pi7.a {
        LANGUAGE_VERSION(0),
        COMPILER_VERSION(1),
        API_VERSION(2);

        private final int value;

        d(int i) {
            this.value = i;
        }

        @Override // pi7.a
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        o5c o5cVar = new o5c();
        a = o5cVar;
        o5cVar.version_ = 0;
        o5cVar.versionFull_ = 0;
        o5cVar.level_ = c.ERROR;
        o5cVar.errorCode_ = 0;
        o5cVar.message_ = 0;
        o5cVar.versionKind_ = d.LANGUAGE_VERSION;
    }

    public o5c(e92 e92Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.version_ = 0;
        this.versionFull_ = 0;
        c cVar = c.ERROR;
        this.level_ = cVar;
        this.errorCode_ = 0;
        this.message_ = 0;
        d dVar = d.LANGUAGE_VERSION;
        this.versionKind_ = dVar;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        while (!z) {
            try {
                try {
                    int iN = e92Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.version_ = e92Var.k();
                        } else if (iN != 16) {
                            d dVar2 = null;
                            c cVar2 = null;
                            if (iN == 24) {
                                int iK = e92Var.k();
                                if (iK == 0) {
                                    cVar2 = c.WARNING;
                                } else if (iK == 1) {
                                    cVar2 = cVar;
                                } else if (iK == 2) {
                                    cVar2 = c.HIDDEN;
                                }
                                if (cVar2 == null) {
                                    f92VarJ.v(iN);
                                    f92VarJ.v(iK);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.level_ = cVar2;
                                }
                            } else if (iN == 32) {
                                this.bitField0_ |= 8;
                                this.errorCode_ = e92Var.k();
                            } else if (iN == 40) {
                                this.bitField0_ |= 16;
                                this.message_ = e92Var.k();
                            } else if (iN == 48) {
                                int iK2 = e92Var.k();
                                if (iK2 == 0) {
                                    dVar2 = dVar;
                                } else if (iK2 == 1) {
                                    dVar2 = d.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    dVar2 = d.API_VERSION;
                                }
                                if (dVar2 == null) {
                                    f92VarJ.v(iN);
                                    f92VarJ.v(iK2);
                                } else {
                                    this.bitField0_ |= 32;
                                    this.versionKind_ = dVar2;
                                }
                            } else if (!e92Var.q(iN, f92VarJ)) {
                            }
                        } else {
                            this.bitField0_ |= 2;
                            this.versionFull_ = e92Var.k();
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

    public final boolean A() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean B() {
        return (this.bitField0_ & 32) == 32;
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
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // defpackage.rp9
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.version_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iB += f92.b(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iB += f92.a(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            iB += f92.b(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iB += f92.b(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iB += f92.a(6, this.versionKind_.getNumber());
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
            f92Var.m(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            f92Var.m(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            f92Var.l(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            f92Var.m(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            f92Var.m(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            f92Var.l(6, this.versionKind_.getNumber());
        }
        f92Var.r(this.unknownFields);
    }

    public final int q() {
        return this.errorCode_;
    }

    public final c r() {
        return this.level_;
    }

    public final int s() {
        return this.message_;
    }

    public final int t() {
        return this.version_;
    }

    public final int u() {
        return this.versionFull_;
    }

    public final d v() {
        return this.versionKind_;
    }

    public final boolean w() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean x() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean y() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean z() {
        return (this.bitField0_ & 1) == 1;
    }

    public o5c() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }

    public o5c(b bVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }
}
