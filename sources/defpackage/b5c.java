package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.h3;
import defpackage.j5c;
import defpackage.m5c;
import defpackage.rp9;
import defpackage.rw5;
import defpackage.ur1;
import defpackage.x4c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class b5c extends rw5.c<b5c> {
    public static final b5c a;
    public static final a b = new a();
    private int bitField0_;
    private List<v4c> compilerPluginData_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<j5c> contextReceiverType_;
    private x4c contract_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private int oldFlags_;
    private int receiverTypeId_;
    private j5c receiverType_;
    private int returnTypeId_;
    private j5c returnType_;
    private List<l5c> typeParameter_;
    private m5c typeTable_;
    private final ur1 unknownFields;
    private List<n5c> valueParameter_;
    private List<Integer> versionRequirement_;

    public static class a extends p3<b5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new b5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.b<b5c, b> {
        public int V;
        public j5c W;
        public int X;
        public List<l5c> Y;
        public j5c Z;
        public int a0;
        public List<j5c> b0;
        public List<Integer> c0;
        public int d;
        public List<n5c> d0;
        public m5c e0;
        public List<Integer> f0;
        public x4c g0;
        public List<v4c> h0;
        public int e = 6;
        public int f = 6;

        public b() {
            j5c j5cVar = j5c.a;
            this.W = j5cVar;
            List list = Collections.EMPTY_LIST;
            this.Y = list;
            this.Z = j5cVar;
            this.b0 = list;
            this.c0 = list;
            this.d0 = list;
            this.e0 = m5c.a;
            this.f0 = list;
            this.g0 = x4c.a;
            this.h0 = list;
        }

        @Override // rp9.a
        public final rp9 build() {
            b5c b5cVarM = m();
            if (b5cVarM.d()) {
                return b5cVarM;
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
            n((b5c) rw5Var);
            return this;
        }

        public final b5c m() {
            b5c b5cVar = new b5c(this);
            int i = this.d;
            int i2 = (i & 1) != 1 ? 0 : 1;
            b5cVar.flags_ = this.e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            b5cVar.oldFlags_ = this.f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            b5cVar.name_ = this.V;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            b5cVar.returnType_ = this.W;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            b5cVar.returnTypeId_ = this.X;
            if ((this.d & 32) == 32) {
                this.Y = Collections.unmodifiableList(this.Y);
                this.d &= -33;
            }
            b5cVar.typeParameter_ = this.Y;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            b5cVar.receiverType_ = this.Z;
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                i2 |= 64;
            }
            b5cVar.receiverTypeId_ = this.a0;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                this.b0 = Collections.unmodifiableList(this.b0);
                this.d &= -257;
            }
            b5cVar.contextReceiverType_ = this.b0;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.c0 = Collections.unmodifiableList(this.c0);
                this.d &= -513;
            }
            b5cVar.contextReceiverTypeId_ = this.c0;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                this.d0 = Collections.unmodifiableList(this.d0);
                this.d &= -1025;
            }
            b5cVar.valueParameter_ = this.d0;
            if ((i & 2048) == 2048) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            b5cVar.typeTable_ = this.e0;
            if ((this.d & 4096) == 4096) {
                this.f0 = Collections.unmodifiableList(this.f0);
                this.d &= -4097;
            }
            b5cVar.versionRequirement_ = this.f0;
            if ((i & 8192) == 8192) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
            }
            b5cVar.contract_ = this.g0;
            if ((this.d & 16384) == 16384) {
                this.h0 = Collections.unmodifiableList(this.h0);
                this.d &= -16385;
            }
            b5cVar.compilerPluginData_ = this.h0;
            b5cVar.bitField0_ = i2;
            return b5cVar;
        }

        public final void n(b5c b5cVar) {
            x4c x4cVar;
            m5c m5cVar;
            j5c j5cVar;
            j5c j5cVar2;
            if (b5cVar == b5c.a) {
                return;
            }
            if (b5cVar.d0()) {
                int iS = b5cVar.S();
                this.d |= 1;
                this.e = iS;
            }
            if (b5cVar.f0()) {
                int iU = b5cVar.U();
                this.d |= 2;
                this.f = iU;
            }
            if (b5cVar.e0()) {
                int iT = b5cVar.T();
                this.d |= 4;
                this.V = iT;
            }
            if (b5cVar.i0()) {
                j5c j5cVarX = b5cVar.X();
                if ((this.d & 8) != 8 || (j5cVar2 = this.W) == j5c.a) {
                    this.W = j5cVarX;
                } else {
                    j5c.c cVarM0 = j5c.m0(j5cVar2);
                    cVarM0.n(j5cVarX);
                    this.W = cVarM0.m();
                }
                this.d |= 8;
            }
            if (b5cVar.j0()) {
                int iY = b5cVar.Y();
                this.d |= 16;
                this.X = iY;
            }
            if (!b5cVar.typeParameter_.isEmpty()) {
                if (this.Y.isEmpty()) {
                    this.Y = b5cVar.typeParameter_;
                    this.d &= -33;
                } else {
                    if ((this.d & 32) != 32) {
                        this.Y = new ArrayList(this.Y);
                        this.d |= 32;
                    }
                    this.Y.addAll(b5cVar.typeParameter_);
                }
            }
            if (b5cVar.g0()) {
                j5c j5cVarV = b5cVar.V();
                if ((this.d & 64) != 64 || (j5cVar = this.Z) == j5c.a) {
                    this.Z = j5cVarV;
                } else {
                    j5c.c cVarM02 = j5c.m0(j5cVar);
                    cVarM02.n(j5cVarV);
                    this.Z = cVarM02.m();
                }
                this.d |= 64;
            }
            if (b5cVar.h0()) {
                int iW = b5cVar.W();
                this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                this.a0 = iW;
            }
            if (!b5cVar.contextReceiverType_.isEmpty()) {
                if (this.b0.isEmpty()) {
                    this.b0 = b5cVar.contextReceiverType_;
                    this.d &= -257;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                        this.b0 = new ArrayList(this.b0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    }
                    this.b0.addAll(b5cVar.contextReceiverType_);
                }
            }
            if (!b5cVar.contextReceiverTypeId_.isEmpty()) {
                if (this.c0.isEmpty()) {
                    this.c0 = b5cVar.contextReceiverTypeId_;
                    this.d &= -513;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                        this.c0 = new ArrayList(this.c0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    }
                    this.c0.addAll(b5cVar.contextReceiverTypeId_);
                }
            }
            if (!b5cVar.valueParameter_.isEmpty()) {
                if (this.d0.isEmpty()) {
                    this.d0 = b5cVar.valueParameter_;
                    this.d &= -1025;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024) {
                        this.d0 = new ArrayList(this.d0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    }
                    this.d0.addAll(b5cVar.valueParameter_);
                }
            }
            if (b5cVar.k0()) {
                m5c m5cVarA0 = b5cVar.a0();
                if ((this.d & 2048) != 2048 || (m5cVar = this.e0) == m5c.a) {
                    this.e0 = m5cVarA0;
                } else {
                    m5c.b bVarQ = m5c.q(m5cVar);
                    bVarQ.m(m5cVarA0);
                    this.e0 = bVarQ.l();
                }
                this.d |= 2048;
            }
            if (!b5cVar.versionRequirement_.isEmpty()) {
                if (this.f0.isEmpty()) {
                    this.f0 = b5cVar.versionRequirement_;
                    this.d &= -4097;
                } else {
                    if ((this.d & 4096) != 4096) {
                        this.f0 = new ArrayList(this.f0);
                        this.d |= 4096;
                    }
                    this.f0.addAll(b5cVar.versionRequirement_);
                }
            }
            if (b5cVar.c0()) {
                x4c x4cVarR = b5cVar.R();
                if ((this.d & 8192) != 8192 || (x4cVar = this.g0) == x4c.a) {
                    this.g0 = x4cVarR;
                } else {
                    x4c.b bVar = new x4c.b();
                    bVar.m(x4cVar);
                    bVar.m(x4cVarR);
                    this.g0 = bVar.l();
                }
                this.d |= 8192;
            }
            if (!b5cVar.compilerPluginData_.isEmpty()) {
                if (this.h0.isEmpty()) {
                    this.h0 = b5cVar.compilerPluginData_;
                    this.d &= -16385;
                } else {
                    if ((this.d & 16384) != 16384) {
                        this.h0 = new ArrayList(this.h0);
                        this.d |= 16384;
                    }
                    this.h0.addAll(b5cVar.compilerPluginData_);
                }
            }
            l(b5cVar);
            this.a = this.a.b(b5cVar.unknownFields);
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
                b5c$a r1 = defpackage.b5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                b5c r1 = new b5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.n(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                b5c r4 = (defpackage.b5c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: b5c.b.o(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }
    }

    static {
        b5c b5cVar = new b5c(0);
        a = b5cVar;
        b5cVar.l0();
    }

    public b5c() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    public b5c(e92 e92Var, s45 s45Var) {
        boolean z;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        l0();
        ur1.b bVar = new ur1.b();
        boolean z2 = true;
        f92 f92VarJ = f92.j(bVar, 1);
        boolean z3 = false;
        int i = 0;
        while (true) {
            ?? Q = 1024;
            if (z3) {
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if (((i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if (((i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if (((i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if (((i == true ? 1 : 0) & 4096) == 4096) {
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
                    try {
                        int iN = e92Var.n();
                        j5c.c cVarM0 = null;
                        x4c.b bVar2 = null;
                        m5c.b bVarQ = null;
                        j5c.c cVarM02 = null;
                        switch (iN) {
                            case 0:
                                z = z2;
                                z3 = z;
                                z2 = z;
                                i = i;
                                break;
                            case 8:
                                z = z2;
                                this.bitField0_ |= 2;
                                this.oldFlags_ = e92Var.k();
                                z2 = z;
                                i = i;
                                break;
                            case 16:
                                z = z2;
                                this.bitField0_ |= 4;
                                this.name_ = e92Var.k();
                                z2 = z;
                                i = i;
                                break;
                            case 26:
                                z = z2;
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
                                z2 = z;
                                i = i;
                                break;
                            case 34:
                                z = z2;
                                int i2 = (i == true ? 1 : 0) & 32;
                                i = i;
                                if (i2 != 32) {
                                    this.typeParameter_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 32;
                                }
                                this.typeParameter_.add((l5c) e92Var.g(l5c.b, s45Var));
                                z2 = z;
                                i = i;
                                break;
                            case 42:
                                z = z2;
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
                                z2 = z;
                                i = i;
                                break;
                            case 50:
                                z = z2;
                                int i3 = (i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                i = i;
                                if (i3 != 1024) {
                                    this.valueParameter_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                                }
                                this.valueParameter_.add((n5c) e92Var.g(n5c.b, s45Var));
                                z2 = z;
                                i = i;
                                break;
                            case 56:
                                z = z2;
                                this.bitField0_ |= 16;
                                this.returnTypeId_ = e92Var.k();
                                z2 = z;
                                i = i;
                                break;
                            case 64:
                                z = z2;
                                this.bitField0_ |= 64;
                                this.receiverTypeId_ = e92Var.k();
                                z2 = z;
                                i = i;
                                break;
                            case 72:
                                z = z2;
                                this.bitField0_ |= 1;
                                this.flags_ = e92Var.k();
                                z2 = z;
                                i = i;
                                break;
                            case 82:
                                z = z2;
                                int i4 = (i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                i = i;
                                if (i4 != 256) {
                                    this.contextReceiverType_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                }
                                this.contextReceiverType_.add((j5c) e92Var.g(j5c.b, s45Var));
                                z2 = z;
                                i = i;
                                break;
                            case 88:
                                z = z2;
                                int i5 = (i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                i = i;
                                if (i5 != 512) {
                                    this.contextReceiverTypeId_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                }
                                this.contextReceiverTypeId_.add(Integer.valueOf(e92Var.k()));
                                z2 = z;
                                i = i;
                                break;
                            case 90:
                                z = z2;
                                int iD = e92Var.d(e92Var.k());
                                int i6 = (i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                                i = i;
                                if (i6 != 512) {
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
                                z2 = z;
                                i = i;
                                break;
                            case 242:
                                z = z2;
                                if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
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
                                this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                                z2 = z;
                                i = i;
                                break;
                            case 248:
                                z = z2;
                                int i7 = (i == true ? 1 : 0) & 4096;
                                i = i;
                                if (i7 != 4096) {
                                    this.versionRequirement_ = new ArrayList();
                                    i = (i == true ? 1 : 0) | 4096;
                                }
                                this.versionRequirement_.add(Integer.valueOf(e92Var.k()));
                                z2 = z;
                                i = i;
                                break;
                            case 250:
                                int iD2 = e92Var.d(e92Var.k());
                                int i8 = (i == true ? 1 : 0) & 4096;
                                i = i;
                                if (i8 != 4096) {
                                    i = i;
                                    if (e92Var.b() > 0) {
                                        this.versionRequirement_ = new ArrayList();
                                        i = (i == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (e92Var.b() > 0) {
                                    this.versionRequirement_.add(Integer.valueOf(e92Var.k()));
                                    z2 = z2;
                                }
                                z = z2;
                                e92Var.c(iD2);
                                z2 = z;
                                i = i;
                                break;
                            case 258:
                                if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                                    x4c x4cVar = this.contract_;
                                    x4cVar.getClass();
                                    bVar2 = new x4c.b();
                                    bVar2.m(x4cVar);
                                }
                                x4c x4cVar2 = (x4c) e92Var.g(x4c.b, s45Var);
                                this.contract_ = x4cVar2;
                                if (bVar2 != null) {
                                    bVar2.m(x4cVar2);
                                    this.contract_ = bVar2.l();
                                }
                                this.bitField0_ |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                                i = i;
                                z = z2;
                                z2 = z;
                                i = i;
                                break;
                            case 266:
                                int i9 = (i == true ? 1 : 0) & 16384;
                                int i10 = i;
                                if (i9 != 16384) {
                                    this.compilerPluginData_ = new ArrayList();
                                    i10 = (i == true ? 1 : 0) | 16384;
                                }
                                this.compilerPluginData_.add((v4c) e92Var.g(v4c.b, s45Var));
                                i = i10;
                                z = z2;
                                z2 = z;
                                i = i;
                                break;
                            default:
                                Q = q(e92Var, f92VarJ, s45Var, iN);
                                i = i;
                                if (Q == 0) {
                                    z3 = z2;
                                    z = z3;
                                } else {
                                    z = z2;
                                }
                                z2 = z;
                                i = i;
                                break;
                        }
                    } catch (IOException e) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                        invalidProtocolBufferException.b(this);
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e2) {
                    e2.b(this);
                    throw e2;
                }
            } catch (Throwable th2) {
                if (((i == true ? 1 : 0) & 32) == 32) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if (((i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == Q) {
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if (((i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.contextReceiverType_ = Collections.unmodifiableList(this.contextReceiverType_);
                }
                if (((i == true ? 1 : 0) & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                    this.contextReceiverTypeId_ = Collections.unmodifiableList(this.contextReceiverTypeId_);
                }
                if (((i == true ? 1 : 0) & 4096) == 4096) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if (((i == true ? 1 : 0) & 16384) == 16384) {
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

    public final List<Integer> P() {
        return this.contextReceiverTypeId_;
    }

    public final List<j5c> Q() {
        return this.contextReceiverType_;
    }

    public final x4c R() {
        return this.contract_;
    }

    public final int S() {
        return this.flags_;
    }

    public final int T() {
        return this.name_;
    }

    public final int U() {
        return this.oldFlags_;
    }

    public final j5c V() {
        return this.receiverType_;
    }

    public final int W() {
        return this.receiverTypeId_;
    }

    public final j5c X() {
        return this.returnType_;
    }

    public final int Y() {
        return this.returnTypeId_;
    }

    public final List<l5c> Z() {
        return this.typeParameter_;
    }

    public final m5c a0() {
        return this.typeTable_;
    }

    public final List<n5c> b0() {
        return this.valueParameter_;
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
        if (!e0()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (i0() && !this.returnType_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            if (!this.typeParameter_.get(i).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (g0() && !this.receiverType_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            if (!this.contextReceiverType_.get(i2).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
            if (!this.valueParameter_.get(i3).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (k0() && !this.typeTable_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (c0() && !this.contract_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            if (!this.compilerPluginData_.get(i4).d()) {
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
        return (this.bitField0_ & 1) == 1;
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
        for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
            iB += f92.d(6, this.valueParameter_.get(i3));
        }
        if ((this.bitField0_ & 16) == 16) {
            iB += f92.b(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            iB += f92.b(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            iB += f92.b(9, this.flags_);
        }
        for (int i4 = 0; i4 < this.contextReceiverType_.size(); i4++) {
            iB += f92.d(10, this.contextReceiverType_.get(i4));
        }
        int i5 = 0;
        int iC = 0;
        while (true) {
            int size = this.contextReceiverTypeId_.size();
            list = this.contextReceiverTypeId_;
            if (i5 >= size) {
                break;
            }
            iC += f92.c(list.get(i5).intValue());
            i5++;
        }
        int iD = iB + iC;
        if (!list.isEmpty()) {
            iD = iD + 1 + f92.c(iC);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iC;
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            iD += f92.d(30, this.typeTable_);
        }
        int i6 = 0;
        int iC2 = 0;
        while (true) {
            int size2 = this.versionRequirement_.size();
            list2 = this.versionRequirement_;
            if (i6 >= size2) {
                break;
            }
            iC2 += f92.c(list2.get(i6).intValue());
            i6++;
        }
        int size3 = (list2.size() * 2) + iD + iC2;
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            size3 += f92.d(32, this.contract_);
        }
        for (int i7 = 0; i7 < this.compilerPluginData_.size(); i7++) {
            size3 += f92.d(33, this.compilerPluginData_.get(i7));
        }
        int size4 = this.unknownFields.size() + k() + size3;
        this.memoizedSerializedSize = size4;
        return size4;
    }

    public final boolean e0() {
        return (this.bitField0_ & 4) == 4;
    }

    @Override // defpackage.rp9
    public final rp9.a f() {
        return new b();
    }

    public final boolean f0() {
        return (this.bitField0_ & 2) == 2;
    }

    @Override // defpackage.tp9
    public final rp9 g() {
        return a;
    }

    public final boolean g0() {
        return (this.bitField0_ & 32) == 32;
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
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            f92Var.o(6, this.valueParameter_.get(i2));
        }
        if ((this.bitField0_ & 16) == 16) {
            f92Var.m(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            f92Var.m(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            f92Var.m(9, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            f92Var.o(10, this.contextReceiverType_.get(i3));
        }
        if (this.contextReceiverTypeId_.size() > 0) {
            f92Var.v(90);
            f92Var.v(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            f92Var.n(this.contextReceiverTypeId_.get(i4).intValue());
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            f92Var.o(30, this.typeTable_);
        }
        for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
            f92Var.m(31, this.versionRequirement_.get(i5).intValue());
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
            f92Var.o(32, this.contract_);
        }
        for (int i6 = 0; i6 < this.compilerPluginData_.size(); i6++) {
            f92Var.o(33, this.compilerPluginData_.get(i6));
        }
        aVar.a(19000, f92Var);
        f92Var.r(this.unknownFields);
    }

    public final boolean h0() {
        return (this.bitField0_ & 64) == 64;
    }

    public final boolean i0() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean j0() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean k0() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
    }

    public final void l0() {
        this.flags_ = 6;
        this.oldFlags_ = 6;
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
        this.valueParameter_ = list;
        this.typeTable_ = m5c.a;
        this.versionRequirement_ = list;
        this.contract_ = x4c.a;
        this.compilerPluginData_ = list;
    }

    public b5c(b bVar) {
        super(bVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public b5c(int i) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
