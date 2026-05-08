package defpackage;

import defpackage.h3;
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
public final class m5c extends rw5 implements tp9 {
    public static final m5c a;
    public static final a b = new a();
    private int bitField0_;
    private int firstNullable_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<j5c> type_;
    private final ur1 unknownFields;

    public static class a extends p3<m5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new m5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.a<m5c, b> implements tp9 {
        public int b;
        public List<j5c> c = Collections.EMPTY_LIST;
        public int d = -1;

        @Override // rp9.a
        public final rp9 build() {
            m5c m5cVarL = l();
            if (m5cVarL.d()) {
                return m5cVarL;
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
            m((m5c) rw5Var);
            return this;
        }

        public final m5c l() {
            m5c m5cVar = new m5c(this);
            int i = this.b;
            if ((i & 1) == 1) {
                this.c = Collections.unmodifiableList(this.c);
                this.b &= -2;
            }
            m5cVar.type_ = this.c;
            int i2 = (i & 2) != 2 ? 0 : 1;
            m5cVar.firstNullable_ = this.d;
            m5cVar.bitField0_ = i2;
            return m5cVar;
        }

        public final void m(m5c m5cVar) {
            if (m5cVar == m5c.a) {
                return;
            }
            if (!m5cVar.type_.isEmpty()) {
                if (this.c.isEmpty()) {
                    this.c = m5cVar.type_;
                    this.b &= -2;
                } else {
                    if ((this.b & 1) != 1) {
                        this.c = new ArrayList(this.c);
                        this.b |= 1;
                    }
                    this.c.addAll(m5cVar.type_);
                }
            }
            if (m5cVar.p()) {
                int iN = m5cVar.n();
                this.b |= 2;
                this.d = iN;
            }
            this.a = this.a.b(m5cVar.unknownFields);
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
                m5c$a r1 = defpackage.m5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                m5c r1 = new m5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.m(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                m5c r4 = (defpackage.m5c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: m5c.b.n(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            n(e92Var, s45Var);
            return this;
        }
    }

    static {
        m5c m5cVar = new m5c();
        a = m5cVar;
        m5cVar.type_ = Collections.EMPTY_LIST;
        m5cVar.firstNullable_ = -1;
    }

    public m5c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.type_ = Collections.EMPTY_LIST;
        this.firstNullable_ = -1;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iN = e92Var.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z2) {
                                    this.type_ = new ArrayList();
                                    z2 = true;
                                }
                                this.type_.add((j5c) e92Var.g(j5c.b, s45Var));
                            } else if (iN == 16) {
                                this.bitField0_ |= 1;
                                this.firstNullable_ = e92Var.k();
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
                if (z2) {
                    this.type_ = Collections.unmodifiableList(this.type_);
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
            this.type_ = Collections.unmodifiableList(this.type_);
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

    public static b q(m5c m5cVar) {
        b bVar = new b();
        bVar.m(m5cVar);
        return bVar;
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
        for (int i = 0; i < this.type_.size(); i++) {
            if (!this.type_.get(i).d()) {
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
        int iB = 0;
        for (int i2 = 0; i2 < this.type_.size(); i2++) {
            iB += f92.d(1, this.type_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            iB += f92.b(2, this.firstNullable_);
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
        for (int i = 0; i < this.type_.size(); i++) {
            f92Var.o(1, this.type_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            f92Var.m(2, this.firstNullable_);
        }
        f92Var.r(this.unknownFields);
    }

    public final int n() {
        return this.firstNullable_;
    }

    public final List<j5c> o() {
        return this.type_;
    }

    public final boolean p() {
        return (this.bitField0_ & 1) == 1;
    }

    public final b r() {
        return q(this);
    }

    public m5c() {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }

    public m5c(b bVar) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }
}
