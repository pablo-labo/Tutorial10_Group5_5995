package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;
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
public final class j5c extends rw5.c<j5c> {
    public static final j5c a;
    public static final a b = new a();
    private int abbreviatedTypeId_;
    private j5c abbreviatedType_;
    private List<b> argument_;
    private int bitField0_;
    private int className_;
    private int flags_;
    private int flexibleTypeCapabilitiesId_;
    private int flexibleUpperBoundId_;
    private j5c flexibleUpperBound_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private boolean nullable_;
    private int outerTypeId_;
    private j5c outerType_;
    private int typeAliasName_;
    private int typeParameterName_;
    private int typeParameter_;
    private final ur1 unknownFields;

    public static class a extends p3<j5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new j5c(e92Var, s45Var);
        }
    }

    public static final class c extends rw5.b<j5c, c> {
        public int V;
        public j5c W;
        public int X;
        public int Y;
        public int Z;
        public int a0;
        public int b0;
        public j5c c0;
        public int d;
        public int d0;
        public List<b> e = Collections.EMPTY_LIST;
        public j5c e0;
        public boolean f;
        public int f0;
        public int g0;

        public c() {
            j5c j5cVar = j5c.a;
            this.W = j5cVar;
            this.c0 = j5cVar;
            this.e0 = j5cVar;
        }

        @Override // rp9.a
        public final rp9 build() {
            j5c j5cVarM = m();
            if (j5cVarM.d()) {
                return j5cVarM;
            }
            throw new UninitializedMessageException();
        }

        @Override // rw5.a
        public final Object clone() {
            c cVar = new c();
            cVar.n(m());
            return cVar;
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
            c cVar = new c();
            cVar.n(m());
            return cVar;
        }

        @Override // rw5.a
        public final /* bridge */ /* synthetic */ rw5.a k(rw5 rw5Var) {
            n((j5c) rw5Var);
            return this;
        }

        public final j5c m() {
            j5c j5cVar = new j5c(this);
            int i = this.d;
            if ((i & 1) == 1) {
                this.e = Collections.unmodifiableList(this.e);
                this.d &= -2;
            }
            j5cVar.argument_ = this.e;
            int i2 = (i & 2) != 2 ? 0 : 1;
            j5cVar.nullable_ = this.f;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            j5cVar.flexibleTypeCapabilitiesId_ = this.V;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            j5cVar.flexibleUpperBound_ = this.W;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            j5cVar.flexibleUpperBoundId_ = this.X;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            j5cVar.className_ = this.Y;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            j5cVar.typeParameter_ = this.Z;
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                i2 |= 64;
            }
            j5cVar.typeParameterName_ = this.a0;
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            j5cVar.typeAliasName_ = this.b0;
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            j5cVar.outerType_ = this.c0;
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            j5cVar.outerTypeId_ = this.d0;
            if ((i & 2048) == 2048) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
            j5cVar.abbreviatedType_ = this.e0;
            if ((i & 4096) == 4096) {
                i2 |= 2048;
            }
            j5cVar.abbreviatedTypeId_ = this.f0;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            j5cVar.flags_ = this.g0;
            j5cVar.bitField0_ = i2;
            return j5cVar;
        }

        public final c n(j5c j5cVar) {
            j5c j5cVar2;
            j5c j5cVar3;
            j5c j5cVar4;
            j5c j5cVar5 = j5c.a;
            if (j5cVar == j5cVar5) {
                return this;
            }
            if (!j5cVar.argument_.isEmpty()) {
                if (this.e.isEmpty()) {
                    this.e = j5cVar.argument_;
                    this.d &= -2;
                } else {
                    if ((this.d & 1) != 1) {
                        this.e = new ArrayList(this.e);
                        this.d |= 1;
                    }
                    this.e.addAll(j5cVar.argument_);
                }
            }
            if (j5cVar.f0()) {
                boolean zS = j5cVar.S();
                this.d |= 2;
                this.f = zS;
            }
            if (j5cVar.c0()) {
                int iP = j5cVar.P();
                this.d |= 4;
                this.V = iP;
            }
            if (j5cVar.d0()) {
                j5c j5cVarQ = j5cVar.Q();
                if ((this.d & 8) != 8 || (j5cVar4 = this.W) == j5cVar5) {
                    this.W = j5cVarQ;
                } else {
                    c cVarM0 = j5c.m0(j5cVar4);
                    cVarM0.n(j5cVarQ);
                    this.W = cVarM0.m();
                }
                this.d |= 8;
            }
            if (j5cVar.e0()) {
                int iR = j5cVar.R();
                this.d |= 16;
                this.X = iR;
            }
            if (j5cVar.a0()) {
                int iN = j5cVar.N();
                this.d |= 32;
                this.Y = iN;
            }
            if (j5cVar.j0()) {
                int iW = j5cVar.W();
                this.d |= 64;
                this.Z = iW;
            }
            if (j5cVar.k0()) {
                int iX = j5cVar.X();
                this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                this.a0 = iX;
            }
            if (j5cVar.i0()) {
                int iV = j5cVar.V();
                this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                this.b0 = iV;
            }
            if (j5cVar.g0()) {
                j5c j5cVarT = j5cVar.T();
                if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512 || (j5cVar3 = this.c0) == j5cVar5) {
                    this.c0 = j5cVarT;
                } else {
                    c cVarM02 = j5c.m0(j5cVar3);
                    cVarM02.n(j5cVarT);
                    this.c0 = cVarM02.m();
                }
                this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            if (j5cVar.h0()) {
                int iU = j5cVar.U();
                this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                this.d0 = iU;
            }
            if (j5cVar.Y()) {
                j5c j5cVarJ = j5cVar.J();
                if ((this.d & 2048) != 2048 || (j5cVar2 = this.e0) == j5cVar5) {
                    this.e0 = j5cVarJ;
                } else {
                    c cVarM03 = j5c.m0(j5cVar2);
                    cVarM03.n(j5cVarJ);
                    this.e0 = cVarM03.m();
                }
                this.d |= 2048;
            }
            if (j5cVar.Z()) {
                int iK = j5cVar.K();
                this.d |= 4096;
                this.f0 = iK;
            }
            if (j5cVar.b0()) {
                int iO = j5cVar.O();
                this.d |= 8192;
                this.g0 = iO;
            }
            l(j5cVar);
            this.a = this.a.b(j5cVar.unknownFields);
            return this;
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
                j5c$a r1 = defpackage.j5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                j5c r1 = new j5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.n(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                j5c r4 = (defpackage.j5c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: j5c.c.o(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }
    }

    static {
        j5c j5cVar = new j5c(0);
        a = j5cVar;
        j5cVar.l0();
    }

    public j5c() {
        throw null;
    }

    public j5c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        l0();
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iN = e92Var.n();
                    a aVar = b;
                    c cVarM0 = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.bitField0_ |= 4096;
                            this.flags_ = e92Var.k();
                            continue;
                        case 18:
                            if (!z2) {
                                this.argument_ = new ArrayList();
                                z2 = true;
                            }
                            this.argument_.add((b) e92Var.g(b.b, s45Var));
                            continue;
                        case 24:
                            this.bitField0_ |= 1;
                            this.nullable_ = e92Var.l() != 0;
                            continue;
                        case 32:
                            this.bitField0_ |= 2;
                            this.flexibleTypeCapabilitiesId_ = e92Var.k();
                            continue;
                        case 42:
                            if ((this.bitField0_ & 4) == 4) {
                                j5c j5cVar = this.flexibleUpperBound_;
                                j5cVar.getClass();
                                cVarM0 = m0(j5cVar);
                            }
                            j5c j5cVar2 = (j5c) e92Var.g(aVar, s45Var);
                            this.flexibleUpperBound_ = j5cVar2;
                            if (cVarM0 != null) {
                                cVarM0.n(j5cVar2);
                                this.flexibleUpperBound_ = cVarM0.m();
                            }
                            this.bitField0_ |= 4;
                            continue;
                        case 48:
                            this.bitField0_ |= 16;
                            this.className_ = e92Var.k();
                            continue;
                        case 56:
                            this.bitField0_ |= 32;
                            this.typeParameter_ = e92Var.k();
                            continue;
                        case 64:
                            this.bitField0_ |= 8;
                            this.flexibleUpperBoundId_ = e92Var.k();
                            continue;
                        case 72:
                            this.bitField0_ |= 64;
                            this.typeParameterName_ = e92Var.k();
                            continue;
                        case 82:
                            if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                                j5c j5cVar3 = this.outerType_;
                                j5cVar3.getClass();
                                cVarM0 = m0(j5cVar3);
                            }
                            j5c j5cVar4 = (j5c) e92Var.g(aVar, s45Var);
                            this.outerType_ = j5cVar4;
                            if (cVarM0 != null) {
                                cVarM0.n(j5cVar4);
                                this.outerType_ = cVarM0.m();
                            }
                            this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            continue;
                        case 88:
                            this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            this.outerTypeId_ = e92Var.k();
                            continue;
                        case 96:
                            this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            this.typeAliasName_ = e92Var.k();
                            continue;
                        case 106:
                            if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                                j5c j5cVar5 = this.abbreviatedType_;
                                j5cVar5.getClass();
                                cVarM0 = m0(j5cVar5);
                            }
                            j5c j5cVar6 = (j5c) e92Var.g(aVar, s45Var);
                            this.abbreviatedType_ = j5cVar6;
                            if (cVarM0 != null) {
                                cVarM0.n(j5cVar6);
                                this.abbreviatedType_ = cVarM0.m();
                            }
                            this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                            continue;
                        case 112:
                            this.bitField0_ |= 2048;
                            this.abbreviatedTypeId_ = e92Var.k();
                            continue;
                        default:
                            if (!q(e92Var, f92VarJ, s45Var, iN)) {
                            }
                            break;
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
                p();
                throw th;
            }
        }
        if (z2) {
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
        p();
    }

    public static c m0(j5c j5cVar) {
        c cVar = new c();
        cVar.n(j5cVar);
        return cVar;
    }

    public final j5c J() {
        return this.abbreviatedType_;
    }

    public final int K() {
        return this.abbreviatedTypeId_;
    }

    public final int L() {
        return this.argument_.size();
    }

    public final List<b> M() {
        return this.argument_;
    }

    public final int N() {
        return this.className_;
    }

    public final int O() {
        return this.flags_;
    }

    public final int P() {
        return this.flexibleTypeCapabilitiesId_;
    }

    public final j5c Q() {
        return this.flexibleUpperBound_;
    }

    public final int R() {
        return this.flexibleUpperBoundId_;
    }

    public final boolean S() {
        return this.nullable_;
    }

    public final j5c T() {
        return this.outerType_;
    }

    public final int U() {
        return this.outerTypeId_;
    }

    public final int V() {
        return this.typeAliasName_;
    }

    public final int W() {
        return this.typeParameter_;
    }

    public final int X() {
        return this.typeParameterName_;
    }

    public final boolean Y() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024;
    }

    public final boolean Z() {
        return (this.bitField0_ & 2048) == 2048;
    }

    public final boolean a0() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean b0() {
        return (this.bitField0_ & 4096) == 4096;
    }

    public final boolean c0() {
        return (this.bitField0_ & 2) == 2;
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
        for (int i = 0; i < this.argument_.size(); i++) {
            if (!this.argument_.get(i).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (d0() && !this.flexibleUpperBound_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (g0() && !this.outerType_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (Y() && !this.abbreviatedType_.d()) {
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

    public final boolean d0() {
        return (this.bitField0_ & 4) == 4;
    }

    @Override // defpackage.rp9
    public final int e() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iB = (this.bitField0_ & 4096) == 4096 ? f92.b(1, this.flags_) : 0;
        for (int i2 = 0; i2 < this.argument_.size(); i2++) {
            iB += f92.d(2, this.argument_.get(i2));
        }
        if ((this.bitField0_ & 1) == 1) {
            iB += f92.h(3) + 1;
        }
        if ((this.bitField0_ & 2) == 2) {
            iB += f92.b(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iB += f92.d(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iB += f92.b(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iB += f92.b(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iB += f92.b(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iB += f92.b(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            iB += f92.d(10, this.outerType_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            iB += f92.b(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iB += f92.b(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            iB += f92.d(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            iB += f92.b(14, this.abbreviatedTypeId_);
        }
        int size = this.unknownFields.size() + k() + iB;
        this.memoizedSerializedSize = size;
        return size;
    }

    public final boolean e0() {
        return (this.bitField0_ & 8) == 8;
    }

    @Override // defpackage.rp9
    public final rp9.a f() {
        return new c();
    }

    public final boolean f0() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // defpackage.tp9
    public final rp9 g() {
        return a;
    }

    public final boolean g0() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256;
    }

    @Override // defpackage.rp9
    public final void h(f92 f92Var) throws IOException {
        e();
        rw5.c.a aVar = new rw5.c.a(this);
        if ((this.bitField0_ & 4096) == 4096) {
            f92Var.m(1, this.flags_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            f92Var.o(2, this.argument_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            boolean z = this.nullable_;
            f92Var.x(3, 0);
            f92Var.q(z ? 1 : 0);
        }
        if ((this.bitField0_ & 2) == 2) {
            f92Var.m(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            f92Var.o(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            f92Var.m(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            f92Var.m(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            f92Var.m(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            f92Var.m(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            f92Var.o(10, this.outerType_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            f92Var.m(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            f92Var.m(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
            f92Var.o(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            f92Var.m(14, this.abbreviatedTypeId_);
        }
        aVar.a(UiRumDebugListener.DEFAULT_ALPHA, f92Var);
        f92Var.r(this.unknownFields);
    }

    public final boolean h0() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512;
    }

    public final boolean i0() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
    }

    public final boolean j0() {
        return (this.bitField0_ & 32) == 32;
    }

    public final boolean k0() {
        return (this.bitField0_ & 64) == 64;
    }

    public final void l0() {
        this.argument_ = Collections.EMPTY_LIST;
        this.nullable_ = false;
        this.flexibleTypeCapabilitiesId_ = 0;
        j5c j5cVar = a;
        this.flexibleUpperBound_ = j5cVar;
        this.flexibleUpperBoundId_ = 0;
        this.className_ = 0;
        this.typeParameter_ = 0;
        this.typeParameterName_ = 0;
        this.typeAliasName_ = 0;
        this.outerType_ = j5cVar;
        this.outerTypeId_ = 0;
        this.abbreviatedType_ = j5cVar;
        this.abbreviatedTypeId_ = 0;
        this.flags_ = 0;
    }

    @Override // defpackage.rp9
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public final c c() {
        return m0(this);
    }

    public static final class b extends rw5 implements tp9 {
        public static final b a;
        public static final a b = new a();
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private c projection_;
        private int typeId_;
        private j5c type_;
        private final ur1 unknownFields;

        public static class a extends p3<b> {
            @Override // defpackage.n4b
            public final Object a(e92 e92Var, s45 s45Var) {
                return new b(e92Var, s45Var);
            }
        }

        /* JADX INFO: renamed from: j5c$b$b, reason: collision with other inner class name */
        public static final class C0276b extends rw5.a<b, C0276b> implements tp9 {
            public int b;
            public c c = c.INV;
            public j5c d = j5c.a;
            public int e;

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
                C0276b c0276b = new C0276b();
                c0276b.m(l());
                return c0276b;
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
                C0276b c0276b = new C0276b();
                c0276b.m(l());
                return c0276b;
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
                bVar.projection_ = this.c;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.type_ = this.d;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                bVar.typeId_ = this.e;
                bVar.bitField0_ = i2;
                return bVar;
            }

            public final void m(b bVar) {
                j5c j5cVar;
                if (bVar == b.a) {
                    return;
                }
                if (bVar.q()) {
                    c cVarN = bVar.n();
                    cVarN.getClass();
                    this.b |= 1;
                    this.c = cVarN;
                }
                if (bVar.r()) {
                    j5c j5cVarO = bVar.o();
                    if ((this.b & 2) != 2 || (j5cVar = this.d) == j5c.a) {
                        this.d = j5cVarO;
                    } else {
                        c cVarM0 = j5c.m0(j5cVar);
                        cVarM0.n(j5cVarO);
                        this.d = cVarM0.m();
                    }
                    this.b |= 2;
                }
                if (bVar.s()) {
                    int iP = bVar.p();
                    this.b |= 4;
                    this.e = iP;
                }
                this.a = this.a.b(bVar.unknownFields);
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
                    j5c$b$a r1 = j5c.b.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    j5c$b r1 = new j5c$b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    r2.m(r1)
                    return
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    j5c$b r4 = (j5c.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: j5c.b.C0276b.n(e92, s45):void");
            }

            @Override // h3.a, rp9.a
            public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
                n(e92Var, s45Var);
                return this;
            }
        }

        public enum c implements pi7.a {
            IN(0),
            OUT(1),
            INV(2),
            STAR(3);

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
            b bVar = new b();
            a = bVar;
            bVar.projection_ = c.INV;
            bVar.type_ = j5c.a;
            bVar.typeId_ = 0;
        }

        public b(e92 e92Var, s45 s45Var) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            c cVar = c.INV;
            this.projection_ = cVar;
            this.type_ = j5c.a;
            boolean z = false;
            this.typeId_ = 0;
            ur1.b bVar = new ur1.b();
            f92 f92VarJ = f92.j(bVar, 1);
            while (!z) {
                try {
                    try {
                        int iN = e92Var.n();
                        if (iN != 0) {
                            c cVarM0 = null;
                            c cVar2 = null;
                            if (iN == 8) {
                                int iK = e92Var.k();
                                if (iK == 0) {
                                    cVar2 = c.IN;
                                } else if (iK == 1) {
                                    cVar2 = c.OUT;
                                } else if (iK == 2) {
                                    cVar2 = cVar;
                                } else if (iK == 3) {
                                    cVar2 = c.STAR;
                                }
                                if (cVar2 == null) {
                                    f92VarJ.v(iN);
                                    f92VarJ.v(iK);
                                } else {
                                    this.bitField0_ |= 1;
                                    this.projection_ = cVar2;
                                }
                            } else if (iN == 18) {
                                if ((this.bitField0_ & 2) == 2) {
                                    j5c j5cVar = this.type_;
                                    j5cVar.getClass();
                                    cVarM0 = j5c.m0(j5cVar);
                                }
                                j5c j5cVar2 = (j5c) e92Var.g(j5c.b, s45Var);
                                this.type_ = j5cVar2;
                                if (cVarM0 != null) {
                                    cVarM0.n(j5cVar2);
                                    this.type_ = cVarM0.m();
                                }
                                this.bitField0_ |= 2;
                            } else if (iN == 24) {
                                this.bitField0_ |= 4;
                                this.typeId_ = e92Var.k();
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
            C0276b c0276b = new C0276b();
            c0276b.m(this);
            return c0276b;
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
            if (!r() || this.type_.d()) {
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
            int iA = (this.bitField0_ & 1) == 1 ? f92.a(1, this.projection_.getNumber()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iA += f92.d(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iA += f92.b(3, this.typeId_);
            }
            int size = this.unknownFields.size() + iA;
            this.memoizedSerializedSize = size;
            return size;
        }

        @Override // defpackage.rp9
        public final rp9.a f() {
            return new C0276b();
        }

        @Override // defpackage.rp9
        public final void h(f92 f92Var) {
            e();
            if ((this.bitField0_ & 1) == 1) {
                f92Var.l(1, this.projection_.getNumber());
            }
            if ((this.bitField0_ & 2) == 2) {
                f92Var.o(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                f92Var.m(3, this.typeId_);
            }
            f92Var.r(this.unknownFields);
        }

        public final c n() {
            return this.projection_;
        }

        public final j5c o() {
            return this.type_;
        }

        public final int p() {
            return this.typeId_;
        }

        public final boolean q() {
            return (this.bitField0_ & 1) == 1;
        }

        public final boolean r() {
            return (this.bitField0_ & 2) == 2;
        }

        public final boolean s() {
            return (this.bitField0_ & 4) == 4;
        }

        public b() {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = ur1.a;
        }

        public b(C0276b c0276b) {
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = c0276b.a;
        }
    }

    public j5c(c cVar) {
        super(cVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.a;
    }

    public j5c(int i) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
