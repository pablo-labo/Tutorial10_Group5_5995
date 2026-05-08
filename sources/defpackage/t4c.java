package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
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
public final class t4c extends rw5 implements tp9 {
    public static final t4c a;
    public static final a b = new a();
    private List<b> argument_;
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final ur1 unknownFields;

    public static class a extends p3<t4c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new t4c(e92Var, s45Var);
        }
    }

    public static final class c extends rw5.a<t4c, c> implements tp9 {
        public int b;
        public int c;
        public List<b> d = Collections.EMPTY_LIST;

        @Override // rp9.a
        public final rp9 build() {
            t4c t4cVarL = l();
            if (t4cVarL.d()) {
                return t4cVarL;
            }
            throw new UninitializedMessageException();
        }

        @Override // rw5.a
        public final Object clone() {
            c cVar = new c();
            cVar.m(l());
            return cVar;
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
            c cVar = new c();
            cVar.m(l());
            return cVar;
        }

        @Override // rw5.a
        public final /* bridge */ /* synthetic */ rw5.a k(rw5 rw5Var) {
            m((t4c) rw5Var);
            return this;
        }

        public final t4c l() {
            t4c t4cVar = new t4c(this);
            int i = (this.b & 1) != 1 ? 0 : 1;
            t4cVar.id_ = this.c;
            if ((this.b & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.b &= -3;
            }
            t4cVar.argument_ = this.d;
            t4cVar.bitField0_ = i;
            return t4cVar;
        }

        public final void m(t4c t4cVar) {
            if (t4cVar == t4c.a) {
                return;
            }
            if (t4cVar.q()) {
                int iP = t4cVar.p();
                this.b |= 1;
                this.c = iP;
            }
            if (!t4cVar.argument_.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = t4cVar.argument_;
                    this.b &= -3;
                } else {
                    if ((this.b & 2) != 2) {
                        this.d = new ArrayList(this.d);
                        this.b |= 2;
                    }
                    this.d.addAll(t4cVar.argument_);
                }
            }
            this.a = this.a.b(t4cVar.unknownFields);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void n(defpackage.e92 r3, defpackage.s45 r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                t4c$a r1 = defpackage.t4c.b     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
                java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
                t4c r3 = (defpackage.t4c) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
                r2.m(r3)
                return
            Ld:
                r3 = move-exception
                goto L19
            Lf:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Ld
                t4c r4 = (defpackage.t4c) r4     // Catch: java.lang.Throwable -> Ld
                throw r3     // Catch: java.lang.Throwable -> L17
            L17:
                r3 = move-exception
                r0 = r4
            L19:
                if (r0 == 0) goto L1e
                r2.m(r0)
            L1e:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: t4c.c.n(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }
    }

    static {
        t4c t4cVar = new t4c();
        a = t4cVar;
        t4cVar.id_ = 0;
        t4cVar.argument_ = Collections.EMPTY_LIST;
    }

    public t4c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        boolean z = false;
        this.id_ = 0;
        this.argument_ = Collections.EMPTY_LIST;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        char c2 = 0;
        while (!z) {
            try {
                try {
                    int iN = e92Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.id_ = e92Var.k();
                        } else if (iN == 18) {
                            if ((c2 & 2) != 2) {
                                this.argument_ = new ArrayList();
                                c2 = 2;
                            }
                            this.argument_.add((b) e92Var.g(b.b, s45Var));
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
                if ((c2 & 2) == 2) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
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
        if ((c2 & 2) == 2) {
            this.argument_ = Collections.unmodifiableList(this.argument_);
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
        c cVar = new c();
        cVar.m(this);
        return cVar;
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
        if (!q()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            if (!this.argument_.get(i).d()) {
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
        int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.id_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iB += f92.d(2, this.argument_.get(i2));
        }
        int size = this.unknownFields.size() + iB;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // defpackage.rp9
    public final rp9.a f() {
        return new c();
    }

    @Override // defpackage.rp9
    public final void h(f92 f92Var) {
        e();
        if ((this.bitField0_ & 1) == 1) {
            f92Var.m(1, this.id_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            f92Var.o(2, this.argument_.get(i));
        }
        f92Var.r(this.unknownFields);
    }

    public final int n() {
        return this.argument_.size();
    }

    public final List<b> o() {
        return this.argument_;
    }

    public final int p() {
        return this.id_;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) == 1;
    }

    public static final class b extends rw5 implements tp9 {
        public static final b a;
        public static final a b = new a();
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int nameId_;
        private final ur1 unknownFields;
        private c value_;

        public static class a extends p3<b> {
            @Override // defpackage.n4b
            public final Object a(e92 e92Var, s45 s45Var) {
                return new b(e92Var, s45Var);
            }
        }

        /* JADX INFO: renamed from: t4c$b$b, reason: collision with other inner class name */
        public static final class C0419b extends rw5.a<b, C0419b> implements tp9 {
            public int b;
            public int c;
            public c d = c.a;

            @Override // rp9.a
            public final rp9 build() {
                b bVarL = l();
                if (bVarL.d()) {
                    return bVarL;
                }
                throw new UninitializedMessageException();
            }

            @Override // rw5.a
            public final Object clone() {
                C0419b c0419b = new C0419b();
                c0419b.n(l());
                return c0419b;
            }

            @Override // h3.a
            /* JADX INFO: renamed from: i */
            public final /* bridge */ /* synthetic */ h3.a s0(e92 e92Var, s45 s45Var) throws Throwable {
                m(e92Var, s45Var);
                return this;
            }

            @Override // rw5.a
            /* JADX INFO: renamed from: j */
            public final rw5.a clone() {
                C0419b c0419b = new C0419b();
                c0419b.n(l());
                return c0419b;
            }

            @Override // rw5.a
            public final /* bridge */ /* synthetic */ rw5.a k(rw5 rw5Var) {
                n((b) rw5Var);
                return this;
            }

            public final b l() {
                b bVar = new b(this);
                int i = this.b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                bVar.nameId_ = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.value_ = this.d;
                bVar.bitField0_ = i2;
                return bVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void m(defpackage.e92 r3, defpackage.s45 r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    t4c$b$a r1 = t4c.b.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    t4c$b r1 = new t4c$b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.n(r1)
                    return
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    t4c$b r4 = (t4c.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: t4c.b.C0419b.m(e92, s45):void");
            }

            public final void n(b bVar) {
                c cVar;
                if (bVar == b.a) {
                    return;
                }
                if (bVar.o()) {
                    int iM = bVar.m();
                    this.b |= 1;
                    this.c = iM;
                }
                if (bVar.p()) {
                    c cVarN = bVar.n();
                    if ((this.b & 2) != 2 || (cVar = this.d) == c.a) {
                        this.d = cVarN;
                    } else {
                        c.C0420b c0420b = new c.C0420b();
                        c0420b.m(cVar);
                        c0420b.m(cVarN);
                        this.d = c0420b.l();
                    }
                    this.b |= 2;
                }
                this.a = this.a.b(bVar.unknownFields);
            }

            @Override // h3.a, rp9.a
            public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
                m(e92Var, s45Var);
                return this;
            }
        }

        static {
            b bVar = new b();
            a = bVar;
            bVar.nameId_ = 0;
            bVar.value_ = c.a;
        }

        public b(e92 e92Var, s45 s45Var) {
            c.C0420b c0420b;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.nameId_ = 0;
            this.value_ = c.a;
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
                                    this.nameId_ = e92Var.k();
                                } else if (iN == 18) {
                                    if ((this.bitField0_ & 2) == 2) {
                                        c cVar = this.value_;
                                        cVar.getClass();
                                        c0420b = new c.C0420b();
                                        c0420b.m(cVar);
                                    } else {
                                        c0420b = null;
                                    }
                                    c cVar2 = (c) e92Var.g(c.b, s45Var);
                                    this.value_ = cVar2;
                                    if (c0420b != null) {
                                        c0420b.m(cVar2);
                                        this.value_ = c0420b.l();
                                    }
                                    this.bitField0_ |= 2;
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
            C0419b c0419b = new C0419b();
            c0419b.n(this);
            return c0419b;
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
            if (!o()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!p()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (this.value_.d()) {
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
            int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.nameId_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iB += f92.d(2, this.value_);
            }
            int size = this.unknownFields.size() + iB;
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // defpackage.rp9
        public final rp9.a f() {
            return new C0419b();
        }

        @Override // defpackage.rp9
        public final void h(f92 f92Var) {
            e();
            if ((this.bitField0_ & 1) == 1) {
                f92Var.m(1, this.nameId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                f92Var.o(2, this.value_);
            }
            f92Var.r(this.unknownFields);
        }

        public final int m() {
            return this.nameId_;
        }

        public final c n() {
            return this.value_;
        }

        public final boolean o() {
            return (this.bitField0_ & 1) == 1;
        }

        public final boolean p() {
            return (this.bitField0_ & 2) == 2;
        }

        public b() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ur1.a;
        }

        public b(C0419b c0419b) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = c0419b.a;
        }

        public static final class c extends rw5 implements tp9 {
            public static final c a;
            public static final a b = new a();
            private t4c annotation_;
            private int arrayDimensionCount_;
            private List<c> arrayElement_;
            private int bitField0_;
            private int classId_;
            private double doubleValue_;
            private int enumValueId_;
            private int flags_;
            private float floatValue_;
            private long intValue_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private int stringValue_;
            private EnumC0421c type_;
            private final ur1 unknownFields;

            public static class a extends p3<c> {
                @Override // defpackage.n4b
                public final Object a(e92 e92Var, s45 s45Var) {
                    return new c(e92Var, s45Var);
                }
            }

            /* JADX INFO: renamed from: t4c$b$c$b, reason: collision with other inner class name */
            public static final class C0420b extends rw5.a<c, C0420b> implements tp9 {
                public int V;
                public int W;
                public int X;
                public int a0;
                public int b;
                public int b0;
                public long d;
                public float e;
                public double f;
                public EnumC0421c c = EnumC0421c.BYTE;
                public t4c Y = t4c.a;
                public List<c> Z = Collections.EMPTY_LIST;

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
                    C0420b c0420b = new C0420b();
                    c0420b.m(l());
                    return c0420b;
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
                    C0420b c0420b = new C0420b();
                    c0420b.m(l());
                    return c0420b;
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
                    cVar.type_ = this.c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    cVar.intValue_ = this.d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    cVar.floatValue_ = this.e;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    cVar.doubleValue_ = this.f;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    cVar.stringValue_ = this.V;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    cVar.classId_ = this.W;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    cVar.enumValueId_ = this.X;
                    if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    }
                    cVar.annotation_ = this.Y;
                    if ((this.b & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                        this.Z = Collections.unmodifiableList(this.Z);
                        this.b &= -257;
                    }
                    cVar.arrayElement_ = this.Z;
                    if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    }
                    cVar.arrayDimensionCount_ = this.a0;
                    if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                        i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    }
                    cVar.flags_ = this.b0;
                    cVar.bitField0_ = i2;
                    return cVar;
                }

                public final void m(c cVar) {
                    t4c t4cVar;
                    if (cVar == c.a) {
                        return;
                    }
                    if (cVar.R()) {
                        EnumC0421c enumC0421cH = cVar.H();
                        enumC0421cH.getClass();
                        this.b |= 1;
                        this.c = enumC0421cH;
                    }
                    if (cVar.P()) {
                        long jF = cVar.F();
                        this.b |= 2;
                        this.d = jF;
                    }
                    if (cVar.O()) {
                        float fE = cVar.E();
                        this.b |= 4;
                        this.e = fE;
                    }
                    if (cVar.L()) {
                        double dB = cVar.B();
                        this.b |= 8;
                        this.f = dB;
                    }
                    if (cVar.Q()) {
                        int iG = cVar.G();
                        this.b |= 16;
                        this.V = iG;
                    }
                    if (cVar.K()) {
                        int iA = cVar.A();
                        this.b |= 32;
                        this.W = iA;
                    }
                    if (cVar.M()) {
                        int iC = cVar.C();
                        this.b |= 64;
                        this.X = iC;
                    }
                    if (cVar.I()) {
                        t4c t4cVarW = cVar.w();
                        if ((this.b & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128 || (t4cVar = this.Y) == t4c.a) {
                            this.Y = t4cVarW;
                        } else {
                            c cVar2 = new c();
                            cVar2.m(t4cVar);
                            cVar2.m(t4cVarW);
                            this.Y = cVar2.l();
                        }
                        this.b |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    }
                    if (!cVar.arrayElement_.isEmpty()) {
                        if (this.Z.isEmpty()) {
                            this.Z = cVar.arrayElement_;
                            this.b &= -257;
                        } else {
                            if ((this.b & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                                this.Z = new ArrayList(this.Z);
                                this.b |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            }
                            this.Z.addAll(cVar.arrayElement_);
                        }
                    }
                    if (cVar.J()) {
                        int iX = cVar.x();
                        this.b |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        this.a0 = iX;
                    }
                    if (cVar.N()) {
                        int iD = cVar.D();
                        this.b |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        this.b0 = iD;
                    }
                    this.a = this.a.b(cVar.unknownFields);
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
                        t4c$b$c$a r1 = t4c.b.c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        t4c$b$c r1 = new t4c$b$c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        r2.m(r1)
                        return
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        t4c$b$c r4 = (t4c.b.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: t4c.b.c.C0420b.n(e92, s45):void");
                }

                @Override // h3.a, rp9.a
                public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
                    n(e92Var, s45Var);
                    return this;
                }
            }

            /* JADX INFO: renamed from: t4c$b$c$c, reason: collision with other inner class name */
            public enum EnumC0421c implements pi7.a {
                BYTE(0),
                CHAR(1),
                SHORT(2),
                INT(3),
                LONG(4),
                FLOAT(5),
                DOUBLE(6),
                BOOLEAN(7),
                STRING(8),
                CLASS(9),
                ENUM(10),
                ANNOTATION(11),
                ARRAY(12);

                private final int value;

                EnumC0421c(int i) {
                    this.value = i;
                }

                public static EnumC0421c a(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case DatadogLogGenerator.CRASH /* 9 */:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // pi7.a
                public final int getNumber() {
                    return this.value;
                }
            }

            static {
                c cVar = new c();
                a = cVar;
                cVar.S();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
            public c(e92 e92Var, s45 s45Var) {
                c cVar;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                S();
                ur1.b bVar = new ur1.b();
                f92 f92VarJ = f92.j(bVar, 1);
                boolean z = false;
                char c = 0;
                while (true) {
                    ?? Q = 256;
                    if (z) {
                        if ((c & 256) == 256) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                        }
                        try {
                            f92VarJ.k();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            this.unknownFields = bVar.p();
                            throw th;
                        }
                        this.unknownFields = bVar.p();
                        return;
                    }
                    try {
                        try {
                            int iN = e92Var.n();
                            switch (iN) {
                                case 0:
                                    z = true;
                                    break;
                                case 8:
                                    int iK = e92Var.k();
                                    EnumC0421c enumC0421cA = EnumC0421c.a(iK);
                                    if (enumC0421cA == null) {
                                        f92VarJ.v(iN);
                                        f92VarJ.v(iK);
                                    } else {
                                        this.bitField0_ |= 1;
                                        this.type_ = enumC0421cA;
                                    }
                                    break;
                                case 16:
                                    this.bitField0_ |= 2;
                                    long jL = e92Var.l();
                                    this.intValue_ = (-(jL & 1)) ^ (jL >>> 1);
                                    break;
                                case 29:
                                    this.bitField0_ |= 4;
                                    this.floatValue_ = Float.intBitsToFloat(e92Var.i());
                                    break;
                                case 33:
                                    this.bitField0_ |= 8;
                                    this.doubleValue_ = Double.longBitsToDouble(e92Var.j());
                                    break;
                                case 40:
                                    this.bitField0_ |= 16;
                                    this.stringValue_ = e92Var.k();
                                    break;
                                case 48:
                                    this.bitField0_ |= 32;
                                    this.classId_ = e92Var.k();
                                    break;
                                case 56:
                                    this.bitField0_ |= 64;
                                    this.enumValueId_ = e92Var.k();
                                    break;
                                case 66:
                                    if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                                        t4c t4cVar = this.annotation_;
                                        t4cVar.getClass();
                                        cVar = new c();
                                        cVar.m(t4cVar);
                                    } else {
                                        cVar = null;
                                    }
                                    t4c t4cVar2 = (t4c) e92Var.g(t4c.b, s45Var);
                                    this.annotation_ = t4cVar2;
                                    if (cVar != null) {
                                        cVar.m(t4cVar2);
                                        this.annotation_ = cVar.l();
                                    }
                                    this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                                    break;
                                case 74:
                                    if ((c & 256) != 256) {
                                        this.arrayElement_ = new ArrayList();
                                        c = 256;
                                    }
                                    this.arrayElement_.add((c) e92Var.g(b, s45Var));
                                    break;
                                case 80:
                                    this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                    this.flags_ = e92Var.k();
                                    break;
                                case 88:
                                    this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                    this.arrayDimensionCount_ = e92Var.k();
                                    break;
                                default:
                                    Q = e92Var.q(iN, f92VarJ);
                                    if (Q == 0) {
                                        z = true;
                                    }
                                    break;
                            }
                        } catch (InvalidProtocolBufferException e) {
                            e.b(this);
                            throw e;
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.b(this);
                            throw invalidProtocolBufferException;
                        }
                    } catch (Throwable th2) {
                        if ((c & 256) == Q) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
                        }
                        try {
                            f92VarJ.k();
                        } catch (IOException unused2) {
                        } catch (Throwable th3) {
                            this.unknownFields = bVar.p();
                            throw th3;
                        }
                        this.unknownFields = bVar.p();
                        throw th2;
                    }
                }
            }

            public final int A() {
                return this.classId_;
            }

            public final double B() {
                return this.doubleValue_;
            }

            public final int C() {
                return this.enumValueId_;
            }

            public final int D() {
                return this.flags_;
            }

            public final float E() {
                return this.floatValue_;
            }

            public final long F() {
                return this.intValue_;
            }

            public final int G() {
                return this.stringValue_;
            }

            public final EnumC0421c H() {
                return this.type_;
            }

            public final boolean I() {
                return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
            }

            public final boolean J() {
                return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256;
            }

            public final boolean K() {
                return (this.bitField0_ & 32) == 32;
            }

            public final boolean L() {
                return (this.bitField0_ & 8) == 8;
            }

            public final boolean M() {
                return (this.bitField0_ & 64) == 64;
            }

            public final boolean N() {
                return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512;
            }

            public final boolean O() {
                return (this.bitField0_ & 4) == 4;
            }

            public final boolean P() {
                return (this.bitField0_ & 2) == 2;
            }

            public final boolean Q() {
                return (this.bitField0_ & 16) == 16;
            }

            public final boolean R() {
                return (this.bitField0_ & 1) == 1;
            }

            public final void S() {
                this.type_ = EnumC0421c.BYTE;
                this.intValue_ = 0L;
                this.floatValue_ = 0.0f;
                this.doubleValue_ = 0.0d;
                this.stringValue_ = 0;
                this.classId_ = 0;
                this.enumValueId_ = 0;
                this.annotation_ = t4c.a;
                this.arrayElement_ = Collections.EMPTY_LIST;
                this.arrayDimensionCount_ = 0;
                this.flags_ = 0;
            }

            @Override // defpackage.rp9
            public final rp9.a c() {
                C0420b c0420b = new C0420b();
                c0420b.m(this);
                return c0420b;
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
                if (I() && !this.annotation_.d()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                for (int i = 0; i < this.arrayElement_.size(); i++) {
                    if (!y(i).d()) {
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
                int iA = (this.bitField0_ & 1) == 1 ? f92.a(1, this.type_.getNumber()) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    long j = this.intValue_;
                    iA += f92.g((j >> 63) ^ (j << 1)) + f92.h(2);
                }
                if ((this.bitField0_ & 4) == 4) {
                    iA += f92.h(3) + 4;
                }
                if ((this.bitField0_ & 8) == 8) {
                    iA += f92.h(4) + 8;
                }
                if ((this.bitField0_ & 16) == 16) {
                    iA += f92.b(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    iA += f92.b(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    iA += f92.b(7, this.enumValueId_);
                }
                if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                    iA += f92.d(8, this.annotation_);
                }
                for (int i2 = 0; i2 < this.arrayElement_.size(); i2++) {
                    iA += f92.d(9, this.arrayElement_.get(i2));
                }
                if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    iA += f92.b(10, this.flags_);
                }
                if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    iA += f92.b(11, this.arrayDimensionCount_);
                }
                int size = this.unknownFields.size() + iA;
                this.memoizedSerializedSize = size;
                return size;
            }

            @Override // defpackage.rp9
            public final rp9.a f() {
                return new C0420b();
            }

            @Override // defpackage.rp9
            public final void h(f92 f92Var) {
                e();
                if ((this.bitField0_ & 1) == 1) {
                    f92Var.l(1, this.type_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    long j = this.intValue_;
                    f92Var.x(2, 0);
                    f92Var.w((j >> 63) ^ (j << 1));
                }
                if ((this.bitField0_ & 4) == 4) {
                    float f = this.floatValue_;
                    f92Var.x(3, 5);
                    f92Var.t(Float.floatToRawIntBits(f));
                }
                if ((this.bitField0_ & 8) == 8) {
                    double d = this.doubleValue_;
                    f92Var.x(4, 1);
                    f92Var.u(Double.doubleToRawLongBits(d));
                }
                if ((this.bitField0_ & 16) == 16) {
                    f92Var.m(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    f92Var.m(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    f92Var.m(7, this.enumValueId_);
                }
                if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                    f92Var.o(8, this.annotation_);
                }
                for (int i = 0; i < this.arrayElement_.size(); i++) {
                    f92Var.o(9, this.arrayElement_.get(i));
                }
                if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    f92Var.m(10, this.flags_);
                }
                if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    f92Var.m(11, this.arrayDimensionCount_);
                }
                f92Var.r(this.unknownFields);
            }

            public final t4c w() {
                return this.annotation_;
            }

            public final int x() {
                return this.arrayDimensionCount_;
            }

            public final c y(int i) {
                return this.arrayElement_.get(i);
            }

            public final List<c> z() {
                return this.arrayElement_;
            }

            public c() {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ur1.a;
            }

            public c(C0420b c0420b) {
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = c0420b.a;
            }
        }
    }

    public t4c() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }

    public t4c(c cVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.a;
    }
}
