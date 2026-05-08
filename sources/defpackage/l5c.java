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
public final class l5c extends rw5.c<l5c> {
    public static final l5c a;
    public static final a b = new a();
    private int bitField0_;
    private int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private boolean reified_;
    private final ur1 unknownFields;
    private int upperBoundIdMemoizedSerializedSize;
    private List<Integer> upperBoundId_;
    private List<j5c> upperBound_;
    private c variance_;

    public static class a extends p3<l5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new l5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.b<l5c, b> {
        public boolean V;
        public c W = c.INV;
        public List<j5c> X;
        public List<Integer> Y;
        public int d;
        public int e;
        public int f;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.X = list;
            this.Y = list;
        }

        @Override // rp9.a
        public final rp9 build() {
            l5c l5cVarM = m();
            if (l5cVarM.d()) {
                return l5cVarM;
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
            n((l5c) rw5Var);
            return this;
        }

        public final l5c m() {
            l5c l5cVar = new l5c(this);
            int i = this.d;
            int i2 = (i & 1) != 1 ? 0 : 1;
            l5cVar.id_ = this.e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            l5cVar.name_ = this.f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            l5cVar.reified_ = this.V;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            l5cVar.variance_ = this.W;
            if ((this.d & 16) == 16) {
                this.X = Collections.unmodifiableList(this.X);
                this.d &= -17;
            }
            l5cVar.upperBound_ = this.X;
            if ((this.d & 32) == 32) {
                this.Y = Collections.unmodifiableList(this.Y);
                this.d &= -33;
            }
            l5cVar.upperBoundId_ = this.Y;
            l5cVar.bitField0_ = i2;
            return l5cVar;
        }

        public final void n(l5c l5cVar) {
            if (l5cVar == l5c.a) {
                return;
            }
            if (l5cVar.I()) {
                int iC = l5cVar.C();
                this.d |= 1;
                this.e = iC;
            }
            if (l5cVar.J()) {
                int iD = l5cVar.D();
                this.d |= 2;
                this.f = iD;
            }
            if (l5cVar.K()) {
                boolean zE = l5cVar.E();
                this.d |= 4;
                this.V = zE;
            }
            if (l5cVar.L()) {
                c cVarH = l5cVar.H();
                cVarH.getClass();
                this.d |= 8;
                this.W = cVarH;
            }
            if (!l5cVar.upperBound_.isEmpty()) {
                if (this.X.isEmpty()) {
                    this.X = l5cVar.upperBound_;
                    this.d &= -17;
                } else {
                    if ((this.d & 16) != 16) {
                        this.X = new ArrayList(this.X);
                        this.d |= 16;
                    }
                    this.X.addAll(l5cVar.upperBound_);
                }
            }
            if (!l5cVar.upperBoundId_.isEmpty()) {
                if (this.Y.isEmpty()) {
                    this.Y = l5cVar.upperBoundId_;
                    this.d &= -33;
                } else {
                    if ((this.d & 32) != 32) {
                        this.Y = new ArrayList(this.Y);
                        this.d |= 32;
                    }
                    this.Y.addAll(l5cVar.upperBoundId_);
                }
            }
            l(l5cVar);
            this.a = this.a.b(l5cVar.unknownFields);
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
                l5c$a r1 = defpackage.l5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                l5c r1 = new l5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.n(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                l5c r4 = (defpackage.l5c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: l5c.b.o(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }
    }

    public enum c implements pi7.a {
        IN(0),
        OUT(1),
        INV(2);

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
        l5c l5cVar = new l5c(0);
        a = l5cVar;
        l5cVar.id_ = 0;
        l5cVar.name_ = 0;
        l5cVar.reified_ = false;
        l5cVar.variance_ = c.INV;
        List list = Collections.EMPTY_LIST;
        l5cVar.upperBound_ = list;
        l5cVar.upperBoundId_ = list;
    }

    public l5c() {
        throw null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public l5c(e92 e92Var, s45 s45Var) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.id_ = 0;
        this.name_ = 0;
        this.reified_ = false;
        c cVar = c.INV;
        this.variance_ = cVar;
        List list = Collections.EMPTY_LIST;
        this.upperBound_ = list;
        this.upperBoundId_ = list;
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
                            this.id_ = e92Var.k();
                        } else if (iN == 16) {
                            this.bitField0_ |= 2;
                            this.name_ = e92Var.k();
                        } else if (iN == 24) {
                            this.bitField0_ |= 4;
                            this.reified_ = e92Var.l() != 0;
                        } else if (iN == 32) {
                            int iK = e92Var.k();
                            c cVar2 = iK != 0 ? iK != 1 ? iK != 2 ? null : cVar : c.OUT : c.IN;
                            if (cVar2 == null) {
                                f92VarJ.v(iN);
                                f92VarJ.v(iK);
                            } else {
                                this.bitField0_ |= 8;
                                this.variance_ = cVar2;
                            }
                        } else if (iN == 42) {
                            if ((i & 16) != 16) {
                                this.upperBound_ = new ArrayList();
                                i |= 16;
                            }
                            this.upperBound_.add((j5c) e92Var.g(j5c.b, s45Var));
                        } else if (iN == 48) {
                            if ((i & 32) != 32) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            this.upperBoundId_.add(Integer.valueOf(e92Var.k()));
                        } else if (iN == 50) {
                            int iD = e92Var.d(e92Var.k());
                            if ((i & 32) != 32 && e92Var.b() > 0) {
                                this.upperBoundId_ = new ArrayList();
                                i |= 32;
                            }
                            while (e92Var.b() > 0) {
                                this.upperBoundId_.add(Integer.valueOf(e92Var.k()));
                            }
                            e92Var.c(iD);
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
                if ((i & 16) == 16) {
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                }
                if ((i & 32) == 32) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
        if ((i & 16) == 16) {
            this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
        }
        if ((i & 32) == 32) {
            this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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

    public final int C() {
        return this.id_;
    }

    public final int D() {
        return this.name_;
    }

    public final boolean E() {
        return this.reified_;
    }

    public final List<Integer> F() {
        return this.upperBoundId_;
    }

    public final List<j5c> G() {
        return this.upperBound_;
    }

    public final c H() {
        return this.variance_;
    }

    public final boolean I() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean J() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean K() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean L() {
        return (this.bitField0_ & 8) == 8;
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
        if (!I()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (!J()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            if (!this.upperBound_.get(i).d()) {
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
        int i2 = 0;
        int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.id_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iB += f92.b(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iB += f92.h(3) + 1;
        }
        if ((this.bitField0_ & 8) == 8) {
            iB += f92.a(4, this.variance_.getNumber());
        }
        for (int i3 = 0; i3 < this.upperBound_.size(); i3++) {
            iB += f92.d(5, this.upperBound_.get(i3));
        }
        int iC = 0;
        while (true) {
            int size = this.upperBoundId_.size();
            list = this.upperBoundId_;
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
        this.upperBoundIdMemoizedSerializedSize = iC;
        int size2 = this.unknownFields.size() + k() + iC2;
        this.memoizedSerializedSize = size2;
        return size2;
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
    public final void h(f92 f92Var) throws IOException {
        e();
        rw5.c.a aVar = new rw5.c.a(this);
        if ((this.bitField0_ & 1) == 1) {
            f92Var.m(1, this.id_);
        }
        if ((this.bitField0_ & 2) == 2) {
            f92Var.m(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            boolean z = this.reified_;
            f92Var.x(3, 0);
            f92Var.q(z ? 1 : 0);
        }
        if ((this.bitField0_ & 8) == 8) {
            f92Var.l(4, this.variance_.getNumber());
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            f92Var.o(5, this.upperBound_.get(i));
        }
        if (this.upperBoundId_.size() > 0) {
            f92Var.v(50);
            f92Var.v(this.upperBoundIdMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
            f92Var.n(this.upperBoundId_.get(i2).intValue());
        }
        aVar.a(1000, f92Var);
        f92Var.r(this.unknownFields);
    }

    public l5c(b bVar) {
        super(bVar);
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public l5c(int i) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
