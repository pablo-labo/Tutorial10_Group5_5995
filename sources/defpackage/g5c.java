package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.h3;
import defpackage.j5c;
import defpackage.n5c;
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
public final class g5c extends rw5.c<g5c> {
    public static final g5c a;
    public static final a b = new a();
    private int bitField0_;
    private List<v4c> compilerPluginData_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<j5c> contextReceiverType_;
    private int flags_;
    private int getterFlags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private j5c receiverType_;
    private int returnTypeId_;
    private j5c returnType_;
    private int setterFlags_;
    private n5c setterValueParameter_;
    private List<l5c> typeParameter_;
    private final ur1 unknownFields;
    private List<Integer> versionRequirement_;

    public static class a extends p3<g5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new g5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.b<g5c, b> {
        public int V;
        public j5c W;
        public int X;
        public List<l5c> Y;
        public j5c Z;
        public int a0;
        public List<j5c> b0;
        public List<Integer> c0;
        public int d;
        public n5c d0;
        public int e0;
        public int f0;
        public List<Integer> g0;
        public List<v4c> h0;
        public int e = 518;
        public int f = 2054;

        public b() {
            j5c j5cVar = j5c.a;
            this.W = j5cVar;
            List list = Collections.EMPTY_LIST;
            this.Y = list;
            this.Z = j5cVar;
            this.b0 = list;
            this.c0 = list;
            this.d0 = n5c.a;
            this.g0 = list;
            this.h0 = list;
        }

        @Override // rp9.a
        public final rp9 build() {
            g5c g5cVarM = m();
            if (g5cVarM.d()) {
                return g5cVarM;
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
            n((g5c) rw5Var);
            return this;
        }

        public final g5c m() {
            g5c g5cVar = new g5c(this);
            int i = this.d;
            int i2 = (i & 1) != 1 ? 0 : 1;
            g5cVar.flags_ = this.e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            g5cVar.oldFlags_ = this.f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            g5cVar.name_ = this.V;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            g5cVar.returnType_ = this.W;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            g5cVar.returnTypeId_ = this.X;
            if ((this.d & 32) == 32) {
                this.Y = Collections.unmodifiableList(this.Y);
                this.d &= -33;
            }
            g5cVar.typeParameter_ = this.Y;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            g5cVar.receiverType_ = this.Z;
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                i2 |= 64;
            }
            g5cVar.receiverTypeId_ = this.a0;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                this.b0 = Collections.unmodifiableList(this.b0);
                this.d &= -257;
            }
            g5cVar.contextReceiverType_ = this.b0;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.c0 = Collections.unmodifiableList(this.c0);
                this.d &= -513;
            }
            g5cVar.contextReceiverTypeId_ = this.c0;
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            g5cVar.setterValueParameter_ = this.d0;
            if ((i & 2048) == 2048) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            g5cVar.getterFlags_ = this.e0;
            if ((i & 4096) == 4096) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
            }
            g5cVar.setterFlags_ = this.f0;
            if ((this.d & 8192) == 8192) {
                this.g0 = Collections.unmodifiableList(this.g0);
                this.d &= -8193;
            }
            g5cVar.versionRequirement_ = this.g0;
            if ((this.d & 16384) == 16384) {
                this.h0 = Collections.unmodifiableList(this.h0);
                this.d &= -16385;
            }
            g5cVar.compilerPluginData_ = this.h0;
            g5cVar.bitField0_ = i2;
            return g5cVar;
        }

        public final void n(g5c g5cVar) {
            n5c n5cVar;
            j5c j5cVar;
            j5c j5cVar2;
            if (g5cVar == g5c.a) {
                return;
            }
            if (g5cVar.b0()) {
                int iQ = g5cVar.Q();
                this.d |= 1;
                this.e = iQ;
            }
            if (g5cVar.e0()) {
                int iT = g5cVar.T();
                this.d |= 2;
                this.f = iT;
            }
            if (g5cVar.d0()) {
                int iS = g5cVar.S();
                this.d |= 4;
                this.V = iS;
            }
            if (g5cVar.h0()) {
                j5c j5cVarW = g5cVar.W();
                if ((this.d & 8) != 8 || (j5cVar2 = this.W) == j5c.a) {
                    this.W = j5cVarW;
                } else {
                    j5c.c cVarM0 = j5c.m0(j5cVar2);
                    cVarM0.n(j5cVarW);
                    this.W = cVarM0.m();
                }
                this.d |= 8;
            }
            if (g5cVar.i0()) {
                int iX = g5cVar.X();
                this.d |= 16;
                this.X = iX;
            }
            if (!g5cVar.typeParameter_.isEmpty()) {
                if (this.Y.isEmpty()) {
                    this.Y = g5cVar.typeParameter_;
                    this.d &= -33;
                } else {
                    if ((this.d & 32) != 32) {
                        this.Y = new ArrayList(this.Y);
                        this.d |= 32;
                    }
                    this.Y.addAll(g5cVar.typeParameter_);
                }
            }
            if (g5cVar.f0()) {
                j5c j5cVarU = g5cVar.U();
                if ((this.d & 64) != 64 || (j5cVar = this.Z) == j5c.a) {
                    this.Z = j5cVarU;
                } else {
                    j5c.c cVarM02 = j5c.m0(j5cVar);
                    cVarM02.n(j5cVarU);
                    this.Z = cVarM02.m();
                }
                this.d |= 64;
            }
            if (g5cVar.g0()) {
                int iV = g5cVar.V();
                this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                this.a0 = iV;
            }
            if (!g5cVar.contextReceiverType_.isEmpty()) {
                if (this.b0.isEmpty()) {
                    this.b0 = g5cVar.contextReceiverType_;
                    this.d &= -257;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                        this.b0 = new ArrayList(this.b0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    }
                    this.b0.addAll(g5cVar.contextReceiverType_);
                }
            }
            if (!g5cVar.contextReceiverTypeId_.isEmpty()) {
                if (this.c0.isEmpty()) {
                    this.c0 = g5cVar.contextReceiverTypeId_;
                    this.d &= -513;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                        this.c0 = new ArrayList(this.c0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    }
                    this.c0.addAll(g5cVar.contextReceiverTypeId_);
                }
            }
            if (g5cVar.k0()) {
                n5c n5cVarZ = g5cVar.Z();
                if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024 || (n5cVar = this.d0) == n5c.a) {
                    this.d0 = n5cVarZ;
                } else {
                    n5c.b bVar = new n5c.b();
                    bVar.n(n5cVar);
                    bVar.n(n5cVarZ);
                    this.d0 = bVar.m();
                }
                this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
            }
            if (g5cVar.c0()) {
                int iR = g5cVar.R();
                this.d |= 2048;
                this.e0 = iR;
            }
            if (g5cVar.j0()) {
                int iY = g5cVar.Y();
                this.d |= 4096;
                this.f0 = iY;
            }
            if (!g5cVar.versionRequirement_.isEmpty()) {
                if (this.g0.isEmpty()) {
                    this.g0 = g5cVar.versionRequirement_;
                    this.d &= -8193;
                } else {
                    if ((this.d & 8192) != 8192) {
                        this.g0 = new ArrayList(this.g0);
                        this.d |= 8192;
                    }
                    this.g0.addAll(g5cVar.versionRequirement_);
                }
            }
            if (!g5cVar.compilerPluginData_.isEmpty()) {
                if (this.h0.isEmpty()) {
                    this.h0 = g5cVar.compilerPluginData_;
                    this.d &= -16385;
                } else {
                    if ((this.d & 16384) != 16384) {
                        this.h0 = new ArrayList(this.h0);
                        this.d |= 16384;
                    }
                    this.h0.addAll(g5cVar.compilerPluginData_);
                }
            }
            l(g5cVar);
            this.a = this.a.b(g5cVar.unknownFields);
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
                g5c$a r1 = defpackage.g5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                g5c r1 = new g5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.n(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                g5c r4 = (defpackage.g5c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: g5c.b.o(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }
    }

    static {
        g5c g5cVar = new g5c(0);
        a = g5cVar;
        g5cVar.l0();
    }

    public g5c() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public g5c(e92 e92Var, s45 s45Var) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        l0();
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            ?? Q = 16384;
            if (z) {
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if (((i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if (((i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if (((i == true ? 1 : 0) & 8192) == 8192) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if (((i == true ? 1 : 0) & 16384) == 16384) {
                    this.compilerPluginData_ = Collections.unmodifiableList(this.compilerPluginData_);
                }
                try {
                    f92VarJ.k();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.unknownFields = bVar.p();
                    throw th;
                }
                this.unknownFields = bVar.p();
                p();
                return;
            }
            try {
                try {
                    int iN = e92Var.n();
                    j5c.c cVarM0 = null;
                    n5c.b bVar2 = null;
                    j5c.c cVarM02 = null;
                    switch (iN) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.bitField0_ |= 2;
                            this.oldFlags_ = e92Var.k();
                            break;
                        case 16:
                            this.bitField0_ |= 4;
                            this.name_ = e92Var.k();
                            break;
                        case 26:
                            if ((this.bitField0_ & 8) == 8) {
                                j5c j5cVar = this.returnType_;
                                j5cVar.getClass();
                                cVarM0 = j5c.m0(j5cVar);
                            }
                            j5c j5cVar2 = (j5c) e92Var.g(j5c.b, s45Var);
                            this.returnType_ = j5cVar2;
                            if (cVarM0 != null) {
                                cVarM0.n(j5cVar2);
                                this.returnType_ = cVarM0.m();
                            }
                            this.bitField0_ |= 8;
                            break;
                        case 34:
                            int i2 = (i == true ? 1 : 0) & 32;
                            i = i;
                            if (i2 != 32) {
                                this.typeParameter_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 32;
                            }
                            this.typeParameter_.add((l5c) e92Var.g(l5c.b, s45Var));
                            break;
                        case 42:
                            if ((this.bitField0_ & 32) == 32) {
                                j5c j5cVar3 = this.receiverType_;
                                j5cVar3.getClass();
                                cVarM02 = j5c.m0(j5cVar3);
                            }
                            j5c j5cVar4 = (j5c) e92Var.g(j5c.b, s45Var);
                            this.receiverType_ = j5cVar4;
                            if (cVarM02 != null) {
                                cVarM02.n(j5cVar4);
                                this.receiverType_ = cVarM02.m();
                            }
                            this.bitField0_ |= 32;
                            break;
                        case 50:
                            if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                                n5c n5cVar = this.setterValueParameter_;
                                n5cVar.getClass();
                                bVar2 = new n5c.b();
                                bVar2.n(n5cVar);
                            }
                            n5c n5cVar2 = (n5c) e92Var.g(n5c.b, s45Var);
                            this.setterValueParameter_ = n5cVar2;
                            if (bVar2 != null) {
                                bVar2.n(n5cVar2);
                                this.setterValueParameter_ = bVar2.m();
                            }
                            this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            break;
                        case 56:
                            this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            this.getterFlags_ = e92Var.k();
                            break;
                        case 64:
                            this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            this.setterFlags_ = e92Var.k();
                            break;
                        case 72:
                            this.bitField0_ |= 16;
                            this.returnTypeId_ = e92Var.k();
                            break;
                        case 80:
                            this.bitField0_ |= 64;
                            this.receiverTypeId_ = e92Var.k();
                            break;
                        case 88:
                            this.bitField0_ |= 1;
                            this.flags_ = e92Var.k();
                            break;
                        case 98:
                            int i3 = (i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            i = i;
                            if (i3 != 256) {
                                this.contextReceiverType_ = new ArrayList();
                                i = (i == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            }
                            this.contextReceiverType_.add((j5c) e92Var.g(j5c.b, s45Var));
                            break;
                        case 104:
                            int i4 = (i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            i = i;
                            if (i4 != 512) {
                                this.contextReceiverTypeId_ = new ArrayList();
                                i = (i == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            }
                            this.contextReceiverTypeId_.add(Integer.valueOf(e92Var.k()));
                            break;
                        case 106:
                            int iD = e92Var.d(e92Var.k());
                            int i5 = (i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                            i = i;
                            if (i5 != 512) {
                                i = i;
                                if (e92Var.b() > 0) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                }
                            }
                            while (e92Var.b() > 0) {
                                this.contextReceiverTypeId_.add(Integer.valueOf(e92Var.k()));
                            }
                            e92Var.c(iD);
                            break;
                        case 248:
                            int i6 = (i == true ? 1 : 0) & 8192;
                            i = i;
                            if (i6 != 8192) {
                                this.versionRequirement_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 8192;
                            }
                            this.versionRequirement_.add(Integer.valueOf(e92Var.k()));
                            break;
                        case 250:
                            int iD2 = e92Var.d(e92Var.k());
                            int i7 = (i == true ? 1 : 0) & 8192;
                            i = i;
                            if (i7 != 8192) {
                                i = i;
                                if (e92Var.b() > 0) {
                                    this.versionRequirement_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 8192;
                                }
                            }
                            while (e92Var.b() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(e92Var.k()));
                            }
                            e92Var.c(iD2);
                            break;
                        case 258:
                            int i8 = (i == true ? 1 : 0) & 16384;
                            i = i;
                            if (i8 != 16384) {
                                this.compilerPluginData_ = new ArrayList();
                                i = (i == true ? 1 : 0) | 16384;
                            }
                            this.compilerPluginData_.add((v4c) e92Var.g(v4c.b, s45Var));
                            break;
                        default:
                            Q = q(e92Var, f92VarJ, s45Var, iN);
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
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if (((i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if (((i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if (((i == true ? 1 : 0) & 8192) == 8192) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if (((i == true ? 1 : 0) & 16384) == Q) {
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
                throw th2;
            }
        }
    }

    public final List<Integer> O() {
        return this.contextReceiverTypeId_;
    }

    public final List<j5c> P() {
        return this.contextReceiverType_;
    }

    public final int Q() {
        return this.flags_;
    }

    public final int R() {
        return this.getterFlags_;
    }

    public final int S() {
        return this.name_;
    }

    public final int T() {
        return this.oldFlags_;
    }

    public final j5c U() {
        return this.receiverType_;
    }

    public final int V() {
        return this.receiverTypeId_;
    }

    public final j5c W() {
        return this.returnType_;
    }

    public final int X() {
        return this.returnTypeId_;
    }

    public final int Y() {
        return this.setterFlags_;
    }

    public final n5c Z() {
        return this.setterValueParameter_;
    }

    public final List<l5c> a0() {
        return this.typeParameter_;
    }

    public final boolean b0() {
        return (this.bitField0_ & 1) == 1;
    }

    @Override // defpackage.rp9
    public final rp9.a c() {
        b bVar = new b();
        bVar.n(this);
        return bVar;
    }

    public final boolean c0() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256;
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
        if (!d0()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (h0() && !this.returnType_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            if (!this.typeParameter_.get(i).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (f0() && !this.receiverType_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            if (!this.contextReceiverType_.get(i2).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (k0() && !this.setterValueParameter_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.compilerPluginData_.size(); i3++) {
            if (!this.compilerPluginData_.get(i3).d()) {
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

    public final boolean d0() {
        return (this.bitField0_ & 4) == 4;
    }

    @Override // defpackage.rp9
    public final int e() {
        List<Integer> list;
        List<Integer> list2;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iB = (this.bitField0_ & 2) == 2 ? f92.b(1, this.oldFlags_) : 0;
        if ((this.bitField0_ & 4) == 4) {
            iB += f92.b(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iB += f92.d(3, this.returnType_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iB += f92.d(4, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 32) == 32) {
            iB += f92.d(5, this.receiverType_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iB += f92.d(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            iB += f92.b(7, this.getterFlags_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            iB += f92.b(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iB += f92.b(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iB += f92.b(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            iB += f92.b(11, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            iB += f92.d(12, this.contextReceiverType_.get(i3));
        }
        int i4 = 0;
        int iC = 0;
        while (true) {
            int size = this.contextReceiverTypeId_.size();
            list = this.contextReceiverTypeId_;
            if (i4 >= size) {
                break;
            }
            iC += f92.c(list.get(i4).intValue());
            i4++;
        }
        int iC2 = iB + iC;
        if (!list.isEmpty()) {
            iC2 = iC2 + 1 + f92.c(iC);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iC;
        int i5 = 0;
        int iC3 = 0;
        while (true) {
            int size2 = this.versionRequirement_.size();
            list2 = this.versionRequirement_;
            if (i5 >= size2) {
                break;
            }
            iC3 += f92.c(list2.get(i5).intValue());
            i5++;
        }
        int size3 = (list2.size() * 2) + iC2 + iC3;
        for (int i6 = 0; i6 < this.compilerPluginData_.size(); i6++) {
            size3 += f92.d(32, this.compilerPluginData_.get(i6));
        }
        int size4 = this.unknownFields.size() + k() + size3;
        this.memoizedSerializedSize = size4;
        return size4;
    }

    public final boolean e0() {
        return (this.bitField0_ & 2) == 2;
    }

    @Override // defpackage.rp9
    public final rp9.a f() {
        return new b();
    }

    public final boolean f0() {
        return (this.bitField0_ & 32) == 32;
    }

    @Override // defpackage.tp9
    public final rp9 g() {
        return a;
    }

    public final boolean g0() {
        return (this.bitField0_ & 64) == 64;
    }

    @Override // defpackage.rp9
    public final void h(f92 f92Var) {
        e();
        rw5.c.a aVar = new rw5.c.a(this);
        if ((this.bitField0_ & 2) == 2) {
            f92Var.m(1, this.oldFlags_);
        }
        if ((this.bitField0_ & 4) == 4) {
            f92Var.m(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            f92Var.o(3, this.returnType_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            f92Var.o(4, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 32) == 32) {
            f92Var.o(5, this.receiverType_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            f92Var.o(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            f92Var.m(7, this.getterFlags_);
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
            f92Var.m(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            f92Var.m(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            f92Var.m(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            f92Var.m(11, this.flags_);
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            f92Var.o(12, this.contextReceiverType_.get(i2));
        }
        if (this.contextReceiverTypeId_.size() > 0) {
            f92Var.v(106);
            f92Var.v(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
            f92Var.n(this.contextReceiverTypeId_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            f92Var.m(31, this.versionRequirement_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            f92Var.o(32, this.compilerPluginData_.get(i5));
        }
        aVar.a(19000, f92Var);
        f92Var.r(this.unknownFields);
    }

    public final boolean h0() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean i0() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean j0() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512;
    }

    public final boolean k0() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
    }

    public final void l0() {
        this.flags_ = 518;
        this.oldFlags_ = 2054;
        this.name_ = 0;
        j5c j5cVar = j5c.a;
        this.returnType_ = j5cVar;
        this.returnTypeId_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.receiverType_ = j5cVar;
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.setterValueParameter_ = n5c.a;
        this.getterFlags_ = 0;
        this.setterFlags_ = 0;
        this.versionRequirement_ = list;
        this.compilerPluginData_ = list;
    }

    public g5c(b bVar) {
        super(bVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public g5c(int i) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
