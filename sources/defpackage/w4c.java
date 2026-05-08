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
public final class w4c extends rw5.c<w4c> {
    public static final w4c a;
    public static final a b = new a();
    private int bitField0_;
    private List<v4c> compilerPluginData_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private final ur1 unknownFields;
    private List<n5c> valueParameter_;
    private List<Integer> versionRequirement_;

    public static class a extends p3<w4c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new w4c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.b<w4c, b> {
        public List<Integer> V;
        public List<v4c> W;
        public int d;
        public int e = 6;
        public List<n5c> f;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.f = list;
            this.V = list;
            this.W = list;
        }

        @Override // rp9.a
        public final rp9 build() {
            w4c w4cVarM = m();
            if (w4cVarM.d()) {
                return w4cVarM;
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
            n((w4c) rw5Var);
            return this;
        }

        public final w4c m() {
            w4c w4cVar = new w4c(this);
            int i = (this.d & 1) != 1 ? 0 : 1;
            w4cVar.flags_ = this.e;
            if ((this.d & 2) == 2) {
                this.f = Collections.unmodifiableList(this.f);
                this.d &= -3;
            }
            w4cVar.valueParameter_ = this.f;
            if ((this.d & 4) == 4) {
                this.V = Collections.unmodifiableList(this.V);
                this.d &= -5;
            }
            w4cVar.versionRequirement_ = this.V;
            if ((this.d & 8) == 8) {
                this.W = Collections.unmodifiableList(this.W);
                this.d &= -9;
            }
            w4cVar.compilerPluginData_ = this.W;
            w4cVar.bitField0_ = i;
            return w4cVar;
        }

        public final void n(w4c w4cVar) {
            if (w4cVar == w4c.a) {
                return;
            }
            if (w4cVar.D()) {
                int iB = w4cVar.B();
                this.d |= 1;
                this.e = iB;
            }
            if (!w4cVar.valueParameter_.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = w4cVar.valueParameter_;
                    this.d &= -3;
                } else {
                    if ((this.d & 2) != 2) {
                        this.f = new ArrayList(this.f);
                        this.d |= 2;
                    }
                    this.f.addAll(w4cVar.valueParameter_);
                }
            }
            if (!w4cVar.versionRequirement_.isEmpty()) {
                if (this.V.isEmpty()) {
                    this.V = w4cVar.versionRequirement_;
                    this.d &= -5;
                } else {
                    if ((this.d & 4) != 4) {
                        this.V = new ArrayList(this.V);
                        this.d |= 4;
                    }
                    this.V.addAll(w4cVar.versionRequirement_);
                }
            }
            if (!w4cVar.compilerPluginData_.isEmpty()) {
                if (this.W.isEmpty()) {
                    this.W = w4cVar.compilerPluginData_;
                    this.d &= -9;
                } else {
                    if ((this.d & 8) != 8) {
                        this.W = new ArrayList(this.W);
                        this.d |= 8;
                    }
                    this.W.addAll(w4cVar.compilerPluginData_);
                }
            }
            l(w4cVar);
            this.a = this.a.b(w4cVar.unknownFields);
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
                w4c$a r1 = defpackage.w4c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                w4c r1 = new w4c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.n(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                w4c r4 = (defpackage.w4c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: w4c.b.o(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }
    }

    static {
        w4c w4cVar = new w4c(0);
        a = w4cVar;
        w4cVar.flags_ = 6;
        List list = Collections.EMPTY_LIST;
        w4cVar.valueParameter_ = list;
        w4cVar.versionRequirement_ = list;
        w4cVar.compilerPluginData_ = list;
    }

    public w4c() {
        throw null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public w4c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.flags_ = 6;
        List list = Collections.EMPTY_LIST;
        this.valueParameter_ = list;
        this.versionRequirement_ = list;
        this.compilerPluginData_ = list;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = e92Var.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.bitField0_ |= 1;
                            this.flags_ = e92Var.k();
                        } else if (iN == 18) {
                            if ((i & 2) != 2) {
                                this.valueParameter_ = new ArrayList();
                                i |= 2;
                            }
                            this.valueParameter_.add((n5c) e92Var.g(n5c.b, s45Var));
                        } else if (iN == 248) {
                            if ((i & 4) != 4) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 4;
                            }
                            this.versionRequirement_.add(Integer.valueOf(e92Var.k()));
                        } else if (iN == 250) {
                            int iD = e92Var.d(e92Var.k());
                            if ((i & 4) != 4 && e92Var.b() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= 4;
                            }
                            while (e92Var.b() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(e92Var.k()));
                            }
                            e92Var.c(iD);
                        } else if (iN == 258) {
                            if ((i & 8) != 8) {
                                this.compilerPluginData_ = new ArrayList();
                                i |= 8;
                            }
                            this.compilerPluginData_.add((v4c) e92Var.g(v4c.b, s45Var));
                        } else if (!q(e92Var, f92VarJ, s45Var, iN)) {
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
                if ((i & 2) == 2) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if ((i & 4) == 4) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i & 8) == 8) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                }
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
        if ((i & 2) == 2) {
            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
        }
        if ((i & 4) == 4) {
            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
        }
        if ((i & 8) == 8) {
            this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
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

    public final int B() {
        return this.flags_;
    }

    public final List<n5c> C() {
        return this.valueParameter_;
    }

    public final boolean D() {
        return (this.bitField0_ & 1) == 1;
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
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            if (!this.valueParameter_.get(i).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.compilerPluginData_.size(); i2++) {
            if (!this.compilerPluginData_.get(i2).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
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
        List<Integer> list;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            iB += f92.d(2, this.valueParameter_.get(i2));
        }
        int i3 = 0;
        int iC = 0;
        while (true) {
            int size = this.versionRequirement_.size();
            list = this.versionRequirement_;
            if (i3 >= size) {
                break;
            }
            iC += f92.c(list.get(i3).intValue());
            i3++;
        }
        int size2 = (list.size() * 2) + iB + iC;
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            size2 += f92.d(32, this.compilerPluginData_.get(i4));
        }
        int size3 = this.unknownFields.size() + k() + size2;
        this.memoizedSerializedSize = size3;
        return size3;
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
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            f92Var.o(2, this.valueParameter_.get(i));
        }
        for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
            f92Var.m(31, this.versionRequirement_.get(i2).intValue());
        }
        for (int i3 = 0; i3 < this.compilerPluginData_.size(); i3++) {
            f92Var.o(32, this.compilerPluginData_.get(i3));
        }
        aVar.a(19000, f92Var);
        f92Var.r(this.unknownFields);
    }

    public w4c(b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public w4c(int i) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
