package defpackage;

import defpackage.h3;
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
public final class h5c extends rw5 implements tp9 {
    public static final h5c a;
    public static final a b = new a();
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<c> qualifiedName_;
    private final ur1 unknownFields;

    public static class a extends p3<h5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new h5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.a<h5c, b> implements tp9 {
        public int b;
        public List<c> c = Collections.EMPTY_LIST;

        @Override // rp9.a
        public final rp9 build() {
            h5c h5cVarL = l();
            if (h5cVarL.d()) {
                return h5cVarL;
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
            m((h5c) rw5Var);
            return this;
        }

        public final h5c l() {
            h5c h5cVar = new h5c(this);
            if ((this.b & 1) == 1) {
                this.c = Collections.unmodifiableList(this.c);
                this.b &= -2;
            }
            h5cVar.qualifiedName_ = this.c;
            return h5cVar;
        }

        public final void m(h5c h5cVar) {
            if (h5cVar == h5c.a) {
                return;
            }
            if (!h5cVar.qualifiedName_.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = h5cVar.qualifiedName_;
                    this.b &= -2;
                } else {
                    if ((this.b & 1) != 1) {
                        this.c = new ArrayList(this.c);
                        this.b |= 1;
                    }
                    this.c.addAll(h5cVar.qualifiedName_);
                }
            }
            this.a = this.a.b(h5cVar.unknownFields);
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
                h5c$a r1 = defpackage.h5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                h5c r1 = new h5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.m(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                h5c r4 = (defpackage.h5c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: h5c.b.n(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }
    }

    static {
        h5c h5cVar = new h5c();
        a = h5cVar;
        h5cVar.qualifiedName_ = Collections.EMPTY_LIST;
    }

    public h5c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.qualifiedName_ = Collections.EMPTY_LIST;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = e92Var.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if (!z2) {
                                this.qualifiedName_ = new ArrayList();
                                z2 = true;
                            }
                            this.qualifiedName_.add((c) e92Var.g(c.b, s45Var));
                        } else if (!e92Var.q(iN, f92VarJ)) {
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
                if (z2) {
                    this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
        if (z2) {
            this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
        for (int i = 0; i < this.qualifiedName_.size(); i++) {
            if (!l(i).d()) {
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
        int iD = 0;
        for (int i2 = 0; i2 < this.qualifiedName_.size(); i2++) {
            iD += f92.d(1, this.qualifiedName_.get(i2));
        }
        int size = this.unknownFields.size() + iD;
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
        for (int i = 0; i < this.qualifiedName_.size(); i++) {
            f92Var.o(1, this.qualifiedName_.get(i));
        }
        f92Var.r(this.unknownFields);
    }

    public final c l(int i) {
        return this.qualifiedName_.get(i);
    }

    public h5c() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }

    public h5c(b bVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public static final class c extends rw5 implements tp9 {
        public static final c a;
        public static final a b = new a();
        private int bitField0_;
        private EnumC0254c kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int parentQualifiedName_;
        private int shortName_;
        private final ur1 unknownFields;

        public static class a extends p3<c> {
            @Override // defpackage.n4b
            public final Object a(e92 e92Var, s45 s45Var) {
                return new c(e92Var);
            }
        }

        public static final class b extends rw5.a<c, b> implements tp9 {
            public int b;
            public int d;
            public int c = -1;
            public EnumC0254c e = EnumC0254c.PACKAGE;

            @Override // rp9.a
            public final rp9 build() {
                c cVarL = l();
                if (cVarL.d()) {
                    return cVarL;
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
                m((c) rw5Var);
                return this;
            }

            public final c l() {
                c cVar = new c(this);
                int i = this.b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                cVar.parentQualifiedName_ = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.shortName_ = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                cVar.kind_ = this.e;
                cVar.bitField0_ = i2;
                return cVar;
            }

            public final void m(c cVar) {
                if (cVar == c.a) {
                    return;
                }
                if (cVar.r()) {
                    int iO = cVar.o();
                    this.b |= 1;
                    this.c = iO;
                }
                if (cVar.s()) {
                    int iP = cVar.p();
                    this.b |= 2;
                    this.d = iP;
                }
                if (cVar.q()) {
                    EnumC0254c enumC0254cN = cVar.n();
                    enumC0254cN.getClass();
                    this.b |= 4;
                    this.e = enumC0254cN;
                }
                this.a = this.a.b(cVar.unknownFields);
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
                    h5c$c$a r0 = h5c.c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    h5c$c r0 = new h5c$c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.m(r0)
                    return
                Lf:
                    r2 = move-exception
                    goto L1b
                L11:
                    r2 = move-exception
                    rp9 r0 = r2.a()     // Catch: java.lang.Throwable -> Lf
                    h5c$c r0 = (h5c.c) r0     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: h5c.c.b.n(e92, s45):void");
            }

            @Override // h3.a, rp9.a
            public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
                n(e92Var, s45Var);
                return this;
            }
        }

        /* JADX INFO: renamed from: h5c$c$c, reason: collision with other inner class name */
        public enum EnumC0254c implements pi7.a {
            CLASS(0),
            PACKAGE(1),
            LOCAL(2);

            private final int value;

            EnumC0254c(int i) {
                this.value = i;
            }

            @Override // pi7.a
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            c cVar = new c();
            a = cVar;
            cVar.parentQualifiedName_ = -1;
            cVar.shortName_ = 0;
            cVar.kind_ = EnumC0254c.PACKAGE;
        }

        public c(e92 e92Var) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.parentQualifiedName_ = -1;
            boolean z = false;
            this.shortName_ = 0;
            EnumC0254c enumC0254c = EnumC0254c.PACKAGE;
            this.kind_ = enumC0254c;
            ur1.b bVar = new ur1.b();
            f92 f92VarJ = f92.j(bVar, 1);
            while (!z) {
                try {
                    try {
                        int iN = e92Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.bitField0_ |= 1;
                                this.parentQualifiedName_ = e92Var.k();
                            } else if (iN == 16) {
                                this.bitField0_ |= 2;
                                this.shortName_ = e92Var.k();
                            } else if (iN == 24) {
                                int iK = e92Var.k();
                                EnumC0254c enumC0254c2 = iK != 0 ? iK != 1 ? iK != 2 ? null : EnumC0254c.LOCAL : enumC0254c : EnumC0254c.CLASS;
                                if (enumC0254c2 == null) {
                                    f92VarJ.v(iN);
                                    f92VarJ.v(iK);
                                } else {
                                    this.bitField0_ |= 4;
                                    this.kind_ = enumC0254c2;
                                }
                            } else if (!e92Var.q(iN, f92VarJ)) {
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
            if (s()) {
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
            int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.parentQualifiedName_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iB += f92.b(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iB += f92.a(3, this.kind_.getNumber());
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
                f92Var.m(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                f92Var.m(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                f92Var.l(3, this.kind_.getNumber());
            }
            f92Var.r(this.unknownFields);
        }

        public final EnumC0254c n() {
            return this.kind_;
        }

        public final int o() {
            return this.parentQualifiedName_;
        }

        public final int p() {
            return this.shortName_;
        }

        public final boolean q() {
            return (this.bitField0_ & 4) == 4;
        }

        public final boolean r() {
            return (this.bitField0_ & 1) == 1;
        }

        public final boolean s() {
            return (this.bitField0_ & 2) == 2;
        }

        public c() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ur1.a;
        }

        public c(b bVar) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.a;
        }
    }
}
