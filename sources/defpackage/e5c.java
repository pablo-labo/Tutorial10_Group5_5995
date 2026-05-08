package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import defpackage.h3;
import defpackage.m5c;
import defpackage.p5c;
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
public final class e5c extends rw5.c<e5c> {
    public static final e5c a;
    public static final a b = new a();
    private int bitField0_;
    private List<b5c> function_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<g5c> property_;
    private List<k5c> typeAlias_;
    private m5c typeTable_;
    private final ur1 unknownFields;
    private p5c versionRequirementTable_;

    public static class a extends p3<e5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new e5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.b<e5c, b> {
        public List<k5c> V;
        public m5c W;
        public p5c X;
        public int d;
        public List<b5c> e;
        public List<g5c> f;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.e = list;
            this.f = list;
            this.V = list;
            this.W = m5c.a;
            this.X = p5c.a;
        }

        @Override // rp9.a
        public final rp9 build() {
            e5c e5cVarM = m();
            if (e5cVarM.d()) {
                return e5cVarM;
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
            n((e5c) rw5Var);
            return this;
        }

        public final e5c m() {
            e5c e5cVar = new e5c(this);
            int i = this.d;
            if ((i & 1) == 1) {
                this.e = Collections.unmodifiableList(this.e);
                this.d &= -2;
            }
            e5cVar.function_ = this.e;
            if ((this.d & 2) == 2) {
                this.f = Collections.unmodifiableList(this.f);
                this.d &= -3;
            }
            e5cVar.property_ = this.f;
            if ((this.d & 4) == 4) {
                this.V = Collections.unmodifiableList(this.V);
                this.d &= -5;
            }
            e5cVar.typeAlias_ = this.V;
            int i2 = (i & 8) != 8 ? 0 : 1;
            e5cVar.typeTable_ = this.W;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            e5cVar.versionRequirementTable_ = this.X;
            e5cVar.bitField0_ = i2;
            return e5cVar;
        }

        public final void n(e5c e5cVar) {
            p5c p5cVar;
            m5c m5cVar;
            if (e5cVar == e5c.a) {
                return;
            }
            if (!e5cVar.function_.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = e5cVar.function_;
                    this.d &= -2;
                } else {
                    if ((this.d & 1) != 1) {
                        this.e = new ArrayList(this.e);
                        this.d |= 1;
                    }
                    this.e.addAll(e5cVar.function_);
                }
            }
            if (!e5cVar.property_.isEmpty()) {
                if (this.f.isEmpty()) {
                    this.f = e5cVar.property_;
                    this.d &= -3;
                } else {
                    if ((this.d & 2) != 2) {
                        this.f = new ArrayList(this.f);
                        this.d |= 2;
                    }
                    this.f.addAll(e5cVar.property_);
                }
            }
            if (!e5cVar.typeAlias_.isEmpty()) {
                if (this.V.isEmpty()) {
                    this.V = e5cVar.typeAlias_;
                    this.d &= -5;
                } else {
                    if ((this.d & 4) != 4) {
                        this.V = new ArrayList(this.V);
                        this.d |= 4;
                    }
                    this.V.addAll(e5cVar.typeAlias_);
                }
            }
            if (e5cVar.H()) {
                m5c m5cVarF = e5cVar.F();
                if ((this.d & 8) != 8 || (m5cVar = this.W) == m5c.a) {
                    this.W = m5cVarF;
                } else {
                    m5c.b bVarQ = m5c.q(m5cVar);
                    bVarQ.m(m5cVarF);
                    this.W = bVarQ.l();
                }
                this.d |= 8;
            }
            if (e5cVar.I()) {
                p5c p5cVarG = e5cVar.G();
                if ((this.d & 16) != 16 || (p5cVar = this.X) == p5c.a) {
                    this.X = p5cVarG;
                } else {
                    p5c.b bVar = new p5c.b();
                    bVar.m(p5cVar);
                    bVar.m(p5cVarG);
                    this.X = bVar.l();
                }
                this.d |= 16;
            }
            l(e5cVar);
            this.a = this.a.b(e5cVar.unknownFields);
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
                e5c$a r1 = defpackage.e5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                e5c r1 = new e5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.n(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                e5c r4 = (defpackage.e5c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: e5c.b.o(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }
    }

    static {
        e5c e5cVar = new e5c(0);
        a = e5cVar;
        List list = Collections.EMPTY_LIST;
        e5cVar.function_ = list;
        e5cVar.property_ = list;
        e5cVar.typeAlias_ = list;
        e5cVar.typeTable_ = m5c.a;
        e5cVar.versionRequirementTable_ = p5c.a;
    }

    public e5c() {
        throw null;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public e5c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        List list = Collections.EMPTY_LIST;
        this.function_ = list;
        this.property_ = list;
        this.typeAlias_ = list;
        this.typeTable_ = m5c.a;
        this.versionRequirementTable_ = p5c.a;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iN = e92Var.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i2 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i2 != 1) {
                                this.function_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.function_.add((b5c) e92Var.g(b5c.b, s45Var));
                        } else if (iN == 34) {
                            int i3 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i3 != 2) {
                                this.property_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.property_.add((g5c) e92Var.g(g5c.b, s45Var));
                        } else if (iN != 42) {
                            p5c.b bVar2 = null;
                            m5c.b bVarQ = null;
                            if (iN == 242) {
                                if ((this.bitField0_ & 1) == 1) {
                                    m5c m5cVar = this.typeTable_;
                                    m5cVar.getClass();
                                    bVarQ = m5c.q(m5cVar);
                                }
                                m5c m5cVar2 = (m5c) e92Var.g(m5c.b, s45Var);
                                this.typeTable_ = m5cVar2;
                                if (bVarQ != null) {
                                    bVarQ.m(m5cVar2);
                                    this.typeTable_ = bVarQ.l();
                                }
                                this.bitField0_ |= 1;
                            } else if (iN == 258) {
                                if ((this.bitField0_ & 2) == 2) {
                                    p5c p5cVar = this.versionRequirementTable_;
                                    p5cVar.getClass();
                                    bVar2 = new p5c.b();
                                    bVar2.m(p5cVar);
                                }
                                p5c p5cVar2 = (p5c) e92Var.g(p5c.b, s45Var);
                                this.versionRequirementTable_ = p5cVar2;
                                if (bVar2 != null) {
                                    bVar2.m(p5cVar2);
                                    this.versionRequirementTable_ = bVar2.l();
                                }
                                this.bitField0_ |= 2;
                            } else if (!q(e92Var, f92VarJ, s45Var, iN)) {
                            }
                        } else {
                            int i4 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i4 != 4) {
                                this.typeAlias_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.typeAlias_.add((k5c) e92Var.g(k5c.b, s45Var));
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
                if (((i == true ? 1 : 0) & 1) == 1) {
                    this.function_ = Collections.unmodifiableList(this.function_);
                }
                if (((i == true ? 1 : 0) & 2) == 2) {
                    this.property_ = Collections.unmodifiableList(this.property_);
                }
                if (((i == true ? 1 : 0) & 4) == 4) {
                    this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
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
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.function_ = Collections.unmodifiableList(this.function_);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.property_ = Collections.unmodifiableList(this.property_);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.typeAlias_ = Collections.unmodifiableList(this.typeAlias_);
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

    public final List<b5c> C() {
        return this.function_;
    }

    public final List<g5c> D() {
        return this.property_;
    }

    public final List<k5c> E() {
        return this.typeAlias_;
    }

    public final m5c F() {
        return this.typeTable_;
    }

    public final p5c G() {
        return this.versionRequirementTable_;
    }

    public final boolean H() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean I() {
        return (this.bitField0_ & 2) == 2;
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
        for (int i = 0; i < this.function_.size(); i++) {
            if (!this.function_.get(i).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            if (!this.property_.get(i2).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            if (!this.typeAlias_.get(i3).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (H() && !this.typeTable_.d()) {
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
        int iD = 0;
        for (int i2 = 0; i2 < this.function_.size(); i2++) {
            iD += f92.d(3, this.function_.get(i2));
        }
        for (int i3 = 0; i3 < this.property_.size(); i3++) {
            iD += f92.d(4, this.property_.get(i3));
        }
        for (int i4 = 0; i4 < this.typeAlias_.size(); i4++) {
            iD += f92.d(5, this.typeAlias_.get(i4));
        }
        if ((this.bitField0_ & 1) == 1) {
            iD += f92.d(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            iD += f92.d(32, this.versionRequirementTable_);
        }
        int size = this.unknownFields.size() + k() + iD;
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
        for (int i = 0; i < this.function_.size(); i++) {
            f92Var.o(3, this.function_.get(i));
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            f92Var.o(4, this.property_.get(i2));
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            f92Var.o(5, this.typeAlias_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            f92Var.o(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            f92Var.o(32, this.versionRequirementTable_);
        }
        aVar.a(UiRumDebugListener.DEFAULT_ALPHA, f92Var);
        f92Var.r(this.unknownFields);
    }

    public e5c(b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public e5c(int i) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
