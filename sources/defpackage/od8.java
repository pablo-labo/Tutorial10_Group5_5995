package defpackage;

import defpackage.h3;
import defpackage.pi7;
import defpackage.rp9;
import defpackage.rw5;
import defpackage.s0h;
import defpackage.ur1;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class od8 {
    public static final rw5.e<w4c, b> a;
    public static final rw5.e<b5c, b> b;
    public static final rw5.e<b5c, Integer> c;
    public static final rw5.e<g5c, c> d;
    public static final rw5.e<g5c, Integer> e;
    public static final rw5.e<j5c, List<t4c>> f;
    public static final rw5.e<j5c, Boolean> g;
    public static final rw5.e<l5c, List<t4c>> h;
    public static final rw5.e<u4c, Integer> i;
    public static final rw5.e<u4c, List<g5c>> j;
    public static final rw5.e<u4c, Integer> k;
    public static final rw5.e<u4c, Integer> l;
    public static final rw5.e<e5c, Integer> m;
    public static final rw5.e<e5c, List<g5c>> n;

    static {
        w4c w4cVar = w4c.a;
        b bVar = b.a;
        s0h.c cVar = s0h.d;
        a = rw5.b(w4cVar, bVar, bVar, 100, cVar, b.class);
        b5c b5cVar = b5c.a;
        b = rw5.b(b5cVar, bVar, bVar, 100, cVar, b.class);
        s0h s0hVar = s0h.a;
        c = rw5.b(b5cVar, 0, null, 101, s0hVar, Integer.class);
        g5c g5cVar = g5c.a;
        c cVar2 = c.a;
        d = rw5.b(g5cVar, cVar2, cVar2, 100, cVar, c.class);
        e = rw5.b(g5cVar, 0, null, 101, s0hVar, Integer.class);
        j5c j5cVar = j5c.a;
        t4c t4cVar = t4c.a;
        f = rw5.a(j5cVar, t4cVar, 100, cVar, t4c.class);
        g = rw5.b(j5cVar, Boolean.FALSE, null, 101, s0h.b, Boolean.class);
        h = rw5.a(l5c.a, t4cVar, 100, cVar, t4c.class);
        u4c u4cVar = u4c.a;
        i = rw5.b(u4cVar, 0, null, 101, s0hVar, Integer.class);
        j = rw5.a(u4cVar, g5cVar, 102, cVar, g5c.class);
        k = rw5.b(u4cVar, 0, null, 103, s0hVar, Integer.class);
        l = rw5.b(u4cVar, 0, null, 104, s0hVar, Integer.class);
        e5c e5cVar = e5c.a;
        m = rw5.b(e5cVar, 0, null, 101, s0hVar, Integer.class);
        n = rw5.a(e5cVar, g5cVar, 102, cVar, g5c.class);
    }

    public static final class a extends rw5 implements tp9 {
        public static final a a;
        public static final C0363a b = new C0363a();
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ur1 unknownFields;

        /* JADX INFO: renamed from: od8$a$a, reason: collision with other inner class name */
        public static class C0363a extends p3<a> {
            @Override // defpackage.n4b
            public final Object a(e92 e92Var, s45 s45Var) {
                return new a(e92Var);
            }
        }

        public static final class b extends rw5.a<a, b> implements tp9 {
            public int b;
            public int c;
            public int d;

            @Override // rp9.a
            public final rp9 build() {
                a aVarL = l();
                if (aVarL.d()) {
                    return aVarL;
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
                m((a) rw5Var);
                return this;
            }

            public final a l() {
                a aVar = new a(this);
                int i = this.b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                aVar.name_ = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                aVar.desc_ = this.d;
                aVar.bitField0_ = i2;
                return aVar;
            }

            public final void m(a aVar) {
                if (aVar == a.a) {
                    return;
                }
                if (aVar.p()) {
                    int iN = aVar.n();
                    this.b |= 1;
                    this.c = iN;
                }
                if (aVar.o()) {
                    int iM = aVar.m();
                    this.b |= 2;
                    this.d = iM;
                }
                this.a = this.a.b(aVar.unknownFields);
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
                    od8$a$a r0 = od8.a.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    od8$a r0 = new od8$a     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.m(r0)
                    return
                Lf:
                    r2 = move-exception
                    goto L1b
                L11:
                    r2 = move-exception
                    rp9 r0 = r2.a()     // Catch: java.lang.Throwable -> Lf
                    od8$a r0 = (od8.a) r0     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: od8.a.b.n(e92, s45):void");
            }

            @Override // h3.a, rp9.a
            public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
                n(e92Var, s45Var);
                return this;
            }
        }

        static {
            a aVar = new a();
            a = aVar;
            aVar.name_ = 0;
            aVar.desc_ = 0;
        }

        public a(e92 e92Var) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.name_ = 0;
            this.desc_ = 0;
            ur1.b bVar = new ur1.b();
            f92 f92VarJ = f92.j(bVar, 1);
            while (!z) {
                try {
                    try {
                        int iN = e92Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = e92Var.k();
                            } else if (iN == 16) {
                                this.bitField0_ |= 2;
                                this.desc_ = e92Var.k();
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // defpackage.rp9
        public final int e() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iB += f92.b(2, this.desc_);
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
                f92Var.m(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                f92Var.m(2, this.desc_);
            }
            f92Var.r(this.unknownFields);
        }

        public final int m() {
            return this.desc_;
        }

        public final int n() {
            return this.name_;
        }

        public final boolean o() {
            return (this.bitField0_ & 2) == 2;
        }

        public final boolean p() {
            return (this.bitField0_ & 1) == 1;
        }

        public a() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ur1.a;
        }

        public a(b bVar) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.a;
        }
    }

    public static final class b extends rw5 implements tp9 {
        public static final b a;
        public static final a b = new a();
        private int bitField0_;
        private int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private int name_;
        private final ur1 unknownFields;

        public static class a extends p3<b> {
            @Override // defpackage.n4b
            public final Object a(e92 e92Var, s45 s45Var) {
                return new b(e92Var);
            }
        }

        /* JADX INFO: renamed from: od8$b$b, reason: collision with other inner class name */
        public static final class C0364b extends rw5.a<b, C0364b> implements tp9 {
            public int b;
            public int c;
            public int d;

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
                C0364b c0364b = new C0364b();
                c0364b.m(l());
                return c0364b;
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
                C0364b c0364b = new C0364b();
                c0364b.m(l());
                return c0364b;
            }

            @Override // rw5.a
            public final /* bridge */ /* synthetic */ rw5.a k(rw5 rw5Var) {
                m((b) rw5Var);
                return this;
            }

            public final b l() {
                b bVar = new b(this);
                int i = this.b;
                int i2 = (i & 1) != 1 ? 0 : 1;
                bVar.name_ = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.desc_ = this.d;
                bVar.bitField0_ = i2;
                return bVar;
            }

            public final void m(b bVar) {
                if (bVar == b.a) {
                    return;
                }
                if (bVar.p()) {
                    int iN = bVar.n();
                    this.b |= 1;
                    this.c = iN;
                }
                if (bVar.o()) {
                    int iM = bVar.m();
                    this.b |= 2;
                    this.d = iM;
                }
                this.a = this.a.b(bVar.unknownFields);
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
                    od8$b$a r0 = od8.b.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    od8$b r0 = new od8$b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.m(r0)
                    return
                Lf:
                    r2 = move-exception
                    goto L1b
                L11:
                    r2 = move-exception
                    rp9 r0 = r2.a()     // Catch: java.lang.Throwable -> Lf
                    od8$b r0 = (od8.b) r0     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: od8.b.C0364b.n(e92, s45):void");
            }

            @Override // h3.a, rp9.a
            public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
                n(e92Var, s45Var);
                return this;
            }
        }

        static {
            b bVar = new b();
            a = bVar;
            bVar.name_ = 0;
            bVar.desc_ = 0;
        }

        public b(e92 e92Var) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            boolean z = false;
            this.name_ = 0;
            this.desc_ = 0;
            ur1.b bVar = new ur1.b();
            f92 f92VarJ = f92.j(bVar, 1);
            while (!z) {
                try {
                    try {
                        int iN = e92Var.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.bitField0_ |= 1;
                                this.name_ = e92Var.k();
                            } else if (iN == 16) {
                                this.bitField0_ |= 2;
                                this.desc_ = e92Var.k();
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

        public static C0364b q(b bVar) {
            C0364b c0364b = new C0364b();
            c0364b.m(bVar);
            return c0364b;
        }

        @Override // defpackage.rp9
        public final rp9.a c() {
            return q(this);
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
            int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.name_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iB += f92.b(2, this.desc_);
            }
            int size = this.unknownFields.size() + iB;
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // defpackage.rp9
        public final rp9.a f() {
            return new C0364b();
        }

        @Override // defpackage.rp9
        public final void h(f92 f92Var) {
            e();
            if ((this.bitField0_ & 1) == 1) {
                f92Var.m(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                f92Var.m(2, this.desc_);
            }
            f92Var.r(this.unknownFields);
        }

        public final int m() {
            return this.desc_;
        }

        public final int n() {
            return this.name_;
        }

        public final boolean o() {
            return (this.bitField0_ & 2) == 2;
        }

        public final boolean p() {
            return (this.bitField0_ & 1) == 1;
        }

        public b() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ur1.a;
        }

        public b(C0364b c0364b) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = c0364b.a;
        }
    }

    public static final class d extends rw5 implements tp9 {
        public static final d a;
        public static final a b = new a();
        private int localNameMemoizedSerializedSize;
        private List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private List<c> record_;
        private final ur1 unknownFields;

        public static class a extends p3<d> {
            @Override // defpackage.n4b
            public final Object a(e92 e92Var, s45 s45Var) {
                return new d(e92Var, s45Var);
            }
        }

        public static final class b extends rw5.a<d, b> implements tp9 {
            public int b;
            public List<c> c;
            public List<Integer> d;

            public b() {
                List list = Collections.EMPTY_LIST;
                this.c = list;
                this.d = list;
            }

            @Override // rp9.a
            public final rp9 build() {
                d dVarL = l();
                if (dVarL.d()) {
                    return dVarL;
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
                m((d) rw5Var);
                return this;
            }

            public final d l() {
                d dVar = new d(this);
                if ((this.b & 1) == 1) {
                    this.c = Collections.unmodifiableList(this.c);
                    this.b &= -2;
                }
                dVar.record_ = this.c;
                if ((this.b & 2) == 2) {
                    this.d = Collections.unmodifiableList(this.d);
                    this.b &= -3;
                }
                dVar.localName_ = this.d;
                return dVar;
            }

            public final void m(d dVar) {
                if (dVar == d.a) {
                    return;
                }
                if (!dVar.record_.isEmpty()) {
                    if (this.c.isEmpty()) {
                        this.c = dVar.record_;
                        this.b &= -2;
                    } else {
                        if ((this.b & 1) != 1) {
                            this.c = new ArrayList(this.c);
                            this.b |= 1;
                        }
                        this.c.addAll(dVar.record_);
                    }
                }
                if (!dVar.localName_.isEmpty()) {
                    if (this.d.isEmpty()) {
                        this.d = dVar.localName_;
                        this.b &= -3;
                    } else {
                        if ((this.b & 2) != 2) {
                            this.d = new ArrayList(this.d);
                            this.b |= 2;
                        }
                        this.d.addAll(dVar.localName_);
                    }
                }
                this.a = this.a.b(dVar.unknownFields);
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
                    od8$d$a r1 = od8.d.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    od8$d r1 = new od8$d     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.m(r1)
                    return
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    od8$d r4 = (od8.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: od8.d.b.n(e92, s45):void");
            }

            @Override // h3.a, rp9.a
            public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
                n(e92Var, s45Var);
                return this;
            }
        }

        static {
            d dVar = new d();
            a = dVar;
            List list = Collections.EMPTY_LIST;
            dVar.record_ = list;
            dVar.localName_ = list;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public d(e92 e92Var, s45 s45Var) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            List list = Collections.EMPTY_LIST;
            this.record_ = list;
            this.localName_ = list;
            ur1.b bVar = new ur1.b();
            f92 f92VarJ = f92.j(bVar, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        try {
                            int iN = e92Var.n();
                            if (iN != 0) {
                                if (iN == 10) {
                                    if ((i & 1) != 1) {
                                        this.record_ = new ArrayList();
                                        i |= 1;
                                    }
                                    this.record_.add((c) e92Var.g(c.b, s45Var));
                                } else if (iN == 40) {
                                    if ((i & 2) != 2) {
                                        this.localName_ = new ArrayList();
                                        i |= 2;
                                    }
                                    this.localName_.add(Integer.valueOf(e92Var.k()));
                                } else if (iN == 42) {
                                    int iD = e92Var.d(e92Var.k());
                                    if ((i & 2) != 2 && e92Var.b() > 0) {
                                        this.localName_ = new ArrayList();
                                        i |= 2;
                                    }
                                    while (e92Var.b() > 0) {
                                        this.localName_.add(Integer.valueOf(e92Var.k()));
                                    }
                                    e92Var.c(iD);
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
                    if ((i & 1) == 1) {
                        this.record_ = Collections.unmodifiableList(this.record_);
                    }
                    if ((i & 2) == 2) {
                        this.localName_ = Collections.unmodifiableList(this.localName_);
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
            if ((i & 1) == 1) {
                this.record_ = Collections.unmodifiableList(this.record_);
            }
            if ((i & 2) == 2) {
                this.localName_ = Collections.unmodifiableList(this.localName_);
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
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // defpackage.rp9
        public final int e() {
            List<Integer> list;
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int iD = 0;
            for (int i3 = 0; i3 < this.record_.size(); i3++) {
                iD += f92.d(1, this.record_.get(i3));
            }
            int iC = 0;
            while (true) {
                int size = this.localName_.size();
                list = this.localName_;
                if (i2 >= size) {
                    break;
                }
                iC += f92.c(list.get(i2).intValue());
                i2++;
            }
            int iC2 = iD + iC;
            if (!list.isEmpty()) {
                iC2 = iC2 + 1 + f92.c(iC);
            }
            this.localNameMemoizedSerializedSize = iC;
            int size2 = this.unknownFields.size() + iC2;
            this.memoizedSerializedSize = size2;
            return size2;
        }

        @Override // defpackage.rp9
        public final rp9.a f() {
            return new b();
        }

        @Override // defpackage.rp9
        public final void h(f92 f92Var) {
            e();
            for (int i = 0; i < this.record_.size(); i++) {
                f92Var.o(1, this.record_.get(i));
            }
            if (this.localName_.size() > 0) {
                f92Var.v(42);
                f92Var.v(this.localNameMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.localName_.size(); i2++) {
                f92Var.n(this.localName_.get(i2).intValue());
            }
            f92Var.r(this.unknownFields);
        }

        public final List<Integer> n() {
            return this.localName_;
        }

        public final List<c> o() {
            return this.record_;
        }

        public d() {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ur1.a;
        }

        public d(b bVar) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.a;
        }

        public static final class c extends rw5 implements tp9 {
            public static final c a;
            public static final a b = new a();
            private int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            private EnumC0365c operation_;
            private int predefinedIndex_;
            private int range_;
            private int replaceCharMemoizedSerializedSize;
            private List<Integer> replaceChar_;
            private Object string_;
            private int substringIndexMemoizedSerializedSize;
            private List<Integer> substringIndex_;
            private final ur1 unknownFields;

            public static class a extends p3<c> {
                @Override // defpackage.n4b
                public final Object a(e92 e92Var, s45 s45Var) {
                    return new c(e92Var);
                }
            }

            public static final class b extends rw5.a<c, b> implements tp9 {
                public List<Integer> V;
                public List<Integer> W;
                public int b;
                public int d;
                public int c = 1;
                public Object e = "";
                public EnumC0365c f = EnumC0365c.NONE;

                public b() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.V = list;
                    this.W = list;
                }

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
                    cVar.range_ = this.c;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    cVar.predefinedIndex_ = this.d;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    cVar.string_ = this.e;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    cVar.operation_ = this.f;
                    if ((this.b & 16) == 16) {
                        this.V = Collections.unmodifiableList(this.V);
                        this.b &= -17;
                    }
                    cVar.substringIndex_ = this.V;
                    if ((this.b & 32) == 32) {
                        this.W = Collections.unmodifiableList(this.W);
                        this.b &= -33;
                    }
                    cVar.replaceChar_ = this.W;
                    cVar.bitField0_ = i2;
                    return cVar;
                }

                public final void m(c cVar) {
                    if (cVar == c.a) {
                        return;
                    }
                    if (cVar.D()) {
                        int iV = cVar.v();
                        this.b |= 1;
                        this.c = iV;
                    }
                    if (cVar.C()) {
                        int iU = cVar.u();
                        this.b |= 2;
                        this.d = iU;
                    }
                    if (cVar.E()) {
                        this.b |= 4;
                        this.e = cVar.string_;
                    }
                    if (cVar.B()) {
                        EnumC0365c enumC0365cT = cVar.t();
                        enumC0365cT.getClass();
                        this.b |= 8;
                        this.f = enumC0365cT;
                    }
                    if (!cVar.substringIndex_.isEmpty()) {
                        if (this.V.isEmpty()) {
                            this.V = cVar.substringIndex_;
                            this.b &= -17;
                        } else {
                            if ((this.b & 16) != 16) {
                                this.V = new ArrayList(this.V);
                                this.b |= 16;
                            }
                            this.V.addAll(cVar.substringIndex_);
                        }
                    }
                    if (!cVar.replaceChar_.isEmpty()) {
                        if (this.W.isEmpty()) {
                            this.W = cVar.replaceChar_;
                            this.b &= -33;
                        } else {
                            if ((this.b & 32) != 32) {
                                this.W = new ArrayList(this.W);
                                this.b |= 32;
                            }
                            this.W.addAll(cVar.replaceChar_);
                        }
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
                        od8$d$c$a r0 = od8.d.c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        r0.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        od8$d$c r0 = new od8$d$c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        r1.m(r0)
                        return
                    Lf:
                        r2 = move-exception
                        goto L1b
                    L11:
                        r2 = move-exception
                        rp9 r0 = r2.a()     // Catch: java.lang.Throwable -> Lf
                        od8$d$c r0 = (od8.d.c) r0     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: od8.d.c.b.n(e92, s45):void");
                }

                @Override // h3.a, rp9.a
                public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
                    n(e92Var, s45Var);
                    return this;
                }
            }

            /* JADX INFO: renamed from: od8$d$c$c, reason: collision with other inner class name */
            public enum EnumC0365c implements pi7.a {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);

                private final int value;

                EnumC0365c(int i) {
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
                cVar.range_ = 1;
                cVar.predefinedIndex_ = 0;
                cVar.string_ = "";
                cVar.operation_ = EnumC0365c.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                cVar.substringIndex_ = list;
                cVar.replaceChar_ = list;
            }

            public c(e92 e92Var) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.range_ = 1;
                boolean z = false;
                this.predefinedIndex_ = 0;
                this.string_ = "";
                EnumC0365c enumC0365c = EnumC0365c.NONE;
                this.operation_ = enumC0365c;
                List<Integer> list = Collections.EMPTY_LIST;
                this.substringIndex_ = list;
                this.replaceChar_ = list;
                ur1.b bVar = new ur1.b();
                f92 f92VarJ = f92.j(bVar, 1);
                int i = 0;
                while (!z) {
                    try {
                        try {
                            int iN = e92Var.n();
                            if (iN != 0) {
                                if (iN == 8) {
                                    this.bitField0_ |= 1;
                                    this.range_ = e92Var.k();
                                } else if (iN == 16) {
                                    this.bitField0_ |= 2;
                                    this.predefinedIndex_ = e92Var.k();
                                } else if (iN == 24) {
                                    int iK = e92Var.k();
                                    EnumC0365c enumC0365c2 = iK != 0 ? iK != 1 ? iK != 2 ? null : EnumC0365c.DESC_TO_CLASS_ID : EnumC0365c.INTERNAL_TO_CLASS_ID : enumC0365c;
                                    if (enumC0365c2 == null) {
                                        f92VarJ.v(iN);
                                        f92VarJ.v(iK);
                                    } else {
                                        this.bitField0_ |= 8;
                                        this.operation_ = enumC0365c2;
                                    }
                                } else if (iN == 32) {
                                    if ((i & 16) != 16) {
                                        this.substringIndex_ = new ArrayList();
                                        i |= 16;
                                    }
                                    this.substringIndex_.add(Integer.valueOf(e92Var.k()));
                                } else if (iN == 34) {
                                    int iD = e92Var.d(e92Var.k());
                                    if ((i & 16) != 16 && e92Var.b() > 0) {
                                        this.substringIndex_ = new ArrayList();
                                        i |= 16;
                                    }
                                    while (e92Var.b() > 0) {
                                        this.substringIndex_.add(Integer.valueOf(e92Var.k()));
                                    }
                                    e92Var.c(iD);
                                } else if (iN == 40) {
                                    if ((i & 32) != 32) {
                                        this.replaceChar_ = new ArrayList();
                                        i |= 32;
                                    }
                                    this.replaceChar_.add(Integer.valueOf(e92Var.k()));
                                } else if (iN == 42) {
                                    int iD2 = e92Var.d(e92Var.k());
                                    if ((i & 32) != 32 && e92Var.b() > 0) {
                                        this.replaceChar_ = new ArrayList();
                                        i |= 32;
                                    }
                                    while (e92Var.b() > 0) {
                                        this.replaceChar_.add(Integer.valueOf(e92Var.k()));
                                    }
                                    e92Var.c(iD2);
                                } else if (iN == 50) {
                                    oz8 oz8VarE = e92Var.e();
                                    this.bitField0_ |= 4;
                                    this.string_ = oz8VarE;
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
                        if ((i & 16) == 16) {
                            this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                        }
                        if ((i & 32) == 32) {
                            this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
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
                if ((i & 16) == 16) {
                    this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                }
                if ((i & 32) == 32) {
                    this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
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

            public final List<Integer> A() {
                return this.substringIndex_;
            }

            public final boolean B() {
                return (this.bitField0_ & 8) == 8;
            }

            public final boolean C() {
                return (this.bitField0_ & 2) == 2;
            }

            public final boolean D() {
                return (this.bitField0_ & 1) == 1;
            }

            public final boolean E() {
                return (this.bitField0_ & 4) == 4;
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
                List<Integer> list;
                List<Integer> list2;
                ur1 oz8Var;
                int i = this.memoizedSerializedSize;
                if (i != -1) {
                    return i;
                }
                int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.range_) : 0;
                if ((this.bitField0_ & 2) == 2) {
                    iB += f92.b(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    iB += f92.a(3, this.operation_.getNumber());
                }
                int i2 = 0;
                int iC = 0;
                while (true) {
                    int size = this.substringIndex_.size();
                    list = this.substringIndex_;
                    if (i2 >= size) {
                        break;
                    }
                    iC += f92.c(list.get(i2).intValue());
                    i2++;
                }
                int iC2 = iB + iC;
                if (!list.isEmpty()) {
                    iC2 = iC2 + 1 + f92.c(iC);
                }
                this.substringIndexMemoizedSerializedSize = iC;
                int i3 = 0;
                int iC3 = 0;
                while (true) {
                    int size2 = this.replaceChar_.size();
                    list2 = this.replaceChar_;
                    if (i3 >= size2) {
                        break;
                    }
                    iC3 += f92.c(list2.get(i3).intValue());
                    i3++;
                }
                int size3 = iC2 + iC3;
                if (!list2.isEmpty()) {
                    size3 = size3 + 1 + f92.c(iC3);
                }
                this.replaceCharMemoizedSerializedSize = iC3;
                if ((this.bitField0_ & 4) == 4) {
                    Object obj = this.string_;
                    if (obj instanceof String) {
                        try {
                            oz8Var = new oz8(((String) obj).getBytes("UTF-8"));
                            this.string_ = oz8Var;
                        } catch (UnsupportedEncodingException e) {
                            l6.p("UTF-8 not supported?", e);
                            return 0;
                        }
                    } else {
                        oz8Var = (ur1) obj;
                    }
                    size3 += oz8Var.size() + f92.f(oz8Var.size()) + f92.h(6);
                }
                int size4 = this.unknownFields.size() + size3;
                this.memoizedSerializedSize = size4;
                return size4;
            }

            @Override // defpackage.rp9
            public final rp9.a f() {
                return new b();
            }

            @Override // defpackage.rp9
            public final void h(f92 f92Var) {
                ur1 oz8Var;
                e();
                if ((this.bitField0_ & 1) == 1) {
                    f92Var.m(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    f92Var.m(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    f92Var.l(3, this.operation_.getNumber());
                }
                if (this.substringIndex_.size() > 0) {
                    f92Var.v(34);
                    f92Var.v(this.substringIndexMemoizedSerializedSize);
                }
                for (int i = 0; i < this.substringIndex_.size(); i++) {
                    f92Var.n(this.substringIndex_.get(i).intValue());
                }
                if (this.replaceChar_.size() > 0) {
                    f92Var.v(42);
                    f92Var.v(this.replaceCharMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                    f92Var.n(this.replaceChar_.get(i2).intValue());
                }
                if ((this.bitField0_ & 4) == 4) {
                    Object obj = this.string_;
                    if (obj instanceof String) {
                        try {
                            oz8Var = new oz8(((String) obj).getBytes("UTF-8"));
                            this.string_ = oz8Var;
                        } catch (UnsupportedEncodingException e) {
                            l6.p("UTF-8 not supported?", e);
                            return;
                        }
                    } else {
                        oz8Var = (ur1) obj;
                    }
                    f92Var.x(6, 2);
                    f92Var.v(oz8Var.size());
                    f92Var.r(oz8Var);
                }
                f92Var.r(this.unknownFields);
            }

            public final EnumC0365c t() {
                return this.operation_;
            }

            public final int u() {
                return this.predefinedIndex_;
            }

            public final int v() {
                return this.range_;
            }

            public final int w() {
                return this.replaceChar_.size();
            }

            public final List<Integer> x() {
                return this.replaceChar_;
            }

            public final String y() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ur1 ur1Var = (ur1) obj;
                String strO = ur1Var.o();
                if (ur1Var.g()) {
                    this.string_ = strO;
                }
                return strO;
            }

            public final int z() {
                return this.substringIndex_.size();
            }

            public c() {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = ur1.a;
            }

            public c(b bVar) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.a;
            }
        }
    }

    public static final class c extends rw5 implements tp9 {
        public static final c a;
        public static final a b = new a();
        private int bitField0_;
        private b delegateMethod_;
        private a field_;
        private b getter_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private b setter_;
        private b syntheticMethod_;
        private final ur1 unknownFields;

        public static class a extends p3<c> {
            @Override // defpackage.n4b
            public final Object a(e92 e92Var, s45 s45Var) {
                return new c(e92Var, s45Var);
            }
        }

        public static final class b extends rw5.a<c, b> implements tp9 {
            public b V;
            public int b;
            public a c = a.a;
            public b d;
            public b e;
            public b f;

            public b() {
                b bVar = b.a;
                this.d = bVar;
                this.e = bVar;
                this.f = bVar;
                this.V = bVar;
            }

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
                cVar.field_ = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.syntheticMethod_ = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                cVar.getter_ = this.e;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                cVar.setter_ = this.f;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                cVar.delegateMethod_ = this.V;
                cVar.bitField0_ = i2;
                return cVar;
            }

            public final void m(c cVar) {
                b bVar;
                b bVar2;
                b bVar3;
                b bVar4;
                a aVar;
                if (cVar == c.a) {
                    return;
                }
                if (cVar.v()) {
                    a aVarQ = cVar.q();
                    if ((this.b & 1) != 1 || (aVar = this.c) == a.a) {
                        this.c = aVarQ;
                    } else {
                        a.b bVar5 = new a.b();
                        bVar5.m(aVar);
                        bVar5.m(aVarQ);
                        this.c = bVar5.l();
                    }
                    this.b |= 1;
                }
                if (cVar.y()) {
                    b bVarT = cVar.t();
                    if ((this.b & 2) != 2 || (bVar4 = this.d) == b.a) {
                        this.d = bVarT;
                    } else {
                        b.C0364b c0364bQ = b.q(bVar4);
                        c0364bQ.m(bVarT);
                        this.d = c0364bQ.l();
                    }
                    this.b |= 2;
                }
                if (cVar.w()) {
                    b bVarR = cVar.r();
                    if ((this.b & 4) != 4 || (bVar3 = this.e) == b.a) {
                        this.e = bVarR;
                    } else {
                        b.C0364b c0364bQ2 = b.q(bVar3);
                        c0364bQ2.m(bVarR);
                        this.e = c0364bQ2.l();
                    }
                    this.b |= 4;
                }
                if (cVar.x()) {
                    b bVarS = cVar.s();
                    if ((this.b & 8) != 8 || (bVar2 = this.f) == b.a) {
                        this.f = bVarS;
                    } else {
                        b.C0364b c0364bQ3 = b.q(bVar2);
                        c0364bQ3.m(bVarS);
                        this.f = c0364bQ3.l();
                    }
                    this.b |= 8;
                }
                if (cVar.u()) {
                    b bVarP = cVar.p();
                    if ((this.b & 16) != 16 || (bVar = this.V) == b.a) {
                        this.V = bVarP;
                    } else {
                        b.C0364b c0364bQ4 = b.q(bVar);
                        c0364bQ4.m(bVarP);
                        this.V = c0364bQ4.l();
                    }
                    this.b |= 16;
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
                    od8$c$a r1 = od8.c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    od8$c r1 = new od8$c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.m(r1)
                    return
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    od8$c r4 = (od8.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: od8.c.b.n(e92, s45):void");
            }

            @Override // h3.a, rp9.a
            public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
                n(e92Var, s45Var);
                return this;
            }
        }

        static {
            c cVar = new c();
            a = cVar;
            cVar.field_ = a.a;
            b bVar = b.a;
            cVar.syntheticMethod_ = bVar;
            cVar.getter_ = bVar;
            cVar.setter_ = bVar;
            cVar.delegateMethod_ = bVar;
        }

        public c(e92 e92Var, s45 s45Var) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.field_ = a.a;
            b bVar = b.a;
            this.syntheticMethod_ = bVar;
            this.getter_ = bVar;
            this.setter_ = bVar;
            this.delegateMethod_ = bVar;
            ur1.b bVar2 = new ur1.b();
            f92 f92VarJ = f92.j(bVar2, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iN = e92Var.n();
                        if (iN != 0) {
                            b.C0364b c0364bQ = null;
                            a.b bVar3 = null;
                            b.C0364b c0364bQ2 = null;
                            b.C0364b c0364bQ3 = null;
                            b.C0364b c0364bQ4 = null;
                            if (iN == 10) {
                                if ((this.bitField0_ & 1) == 1) {
                                    a aVar = this.field_;
                                    aVar.getClass();
                                    bVar3 = new a.b();
                                    bVar3.m(aVar);
                                }
                                a aVar2 = (a) e92Var.g(a.b, s45Var);
                                this.field_ = aVar2;
                                if (bVar3 != null) {
                                    bVar3.m(aVar2);
                                    this.field_ = bVar3.l();
                                }
                                this.bitField0_ |= 1;
                            } else if (iN == 18) {
                                if ((this.bitField0_ & 2) == 2) {
                                    b bVar4 = this.syntheticMethod_;
                                    bVar4.getClass();
                                    c0364bQ2 = b.q(bVar4);
                                }
                                b bVar5 = (b) e92Var.g(b.b, s45Var);
                                this.syntheticMethod_ = bVar5;
                                if (c0364bQ2 != null) {
                                    c0364bQ2.m(bVar5);
                                    this.syntheticMethod_ = c0364bQ2.l();
                                }
                                this.bitField0_ |= 2;
                            } else if (iN == 26) {
                                if ((this.bitField0_ & 4) == 4) {
                                    b bVar6 = this.getter_;
                                    bVar6.getClass();
                                    c0364bQ3 = b.q(bVar6);
                                }
                                b bVar7 = (b) e92Var.g(b.b, s45Var);
                                this.getter_ = bVar7;
                                if (c0364bQ3 != null) {
                                    c0364bQ3.m(bVar7);
                                    this.getter_ = c0364bQ3.l();
                                }
                                this.bitField0_ |= 4;
                            } else if (iN == 34) {
                                if ((this.bitField0_ & 8) == 8) {
                                    b bVar8 = this.setter_;
                                    bVar8.getClass();
                                    c0364bQ4 = b.q(bVar8);
                                }
                                b bVar9 = (b) e92Var.g(b.b, s45Var);
                                this.setter_ = bVar9;
                                if (c0364bQ4 != null) {
                                    c0364bQ4.m(bVar9);
                                    this.setter_ = c0364bQ4.l();
                                }
                                this.bitField0_ |= 8;
                            } else if (iN == 42) {
                                if ((this.bitField0_ & 16) == 16) {
                                    b bVar10 = this.delegateMethod_;
                                    bVar10.getClass();
                                    c0364bQ = b.q(bVar10);
                                }
                                b bVar11 = (b) e92Var.g(b.b, s45Var);
                                this.delegateMethod_ = bVar11;
                                if (c0364bQ != null) {
                                    c0364bQ.m(bVar11);
                                    this.delegateMethod_ = c0364bQ.l();
                                }
                                this.bitField0_ |= 16;
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
                        this.unknownFields = bVar2.p();
                        throw th2;
                    }
                    this.unknownFields = bVar2.p();
                    throw th;
                }
            }
            try {
                f92VarJ.k();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = bVar2.p();
                throw th3;
            }
            this.unknownFields = bVar2.p();
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
            int iD = (this.bitField0_ & 1) == 1 ? f92.d(1, this.field_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iD += f92.d(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iD += f92.d(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iD += f92.d(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iD += f92.d(5, this.delegateMethod_);
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
            if ((this.bitField0_ & 1) == 1) {
                f92Var.o(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                f92Var.o(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                f92Var.o(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                f92Var.o(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                f92Var.o(5, this.delegateMethod_);
            }
            f92Var.r(this.unknownFields);
        }

        public final b p() {
            return this.delegateMethod_;
        }

        public final a q() {
            return this.field_;
        }

        public final b r() {
            return this.getter_;
        }

        public final b s() {
            return this.setter_;
        }

        public final b t() {
            return this.syntheticMethod_;
        }

        public final boolean u() {
            return (this.bitField0_ & 16) == 16;
        }

        public final boolean v() {
            return (this.bitField0_ & 1) == 1;
        }

        public final boolean w() {
            return (this.bitField0_ & 4) == 4;
        }

        public final boolean x() {
            return (this.bitField0_ & 8) == 8;
        }

        public final boolean y() {
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
