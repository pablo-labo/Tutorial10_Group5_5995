package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.h3;
import defpackage.j5c;
import defpackage.m5c;
import defpackage.p5c;
import defpackage.pi7;
import defpackage.rp9;
import defpackage.rw5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public final class u4c extends rw5.c<u4c> {
    public static final u4c a;
    public static final a b = new a();
    private int bitField0_;
    private int companionObjectName_;
    private List<v4c> compilerPluginData_;
    private List<w4c> constructor_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    private List<Integer> contextReceiverTypeId_;
    private List<j5c> contextReceiverType_;
    private List<z4c> enumEntry_;
    private int flags_;
    private int fqName_;
    private List<b5c> function_;
    private int inlineClassUnderlyingPropertyName_;
    private int inlineClassUnderlyingTypeId_;
    private j5c inlineClassUnderlyingType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int multiFieldValueClassUnderlyingNameMemoizedSerializedSize;
    private List<Integer> multiFieldValueClassUnderlyingName_;
    private int multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize;
    private List<Integer> multiFieldValueClassUnderlyingTypeId_;
    private List<j5c> multiFieldValueClassUnderlyingType_;
    private int nestedClassNameMemoizedSerializedSize;
    private List<Integer> nestedClassName_;
    private List<g5c> property_;
    private int sealedSubclassFqNameMemoizedSerializedSize;
    private List<Integer> sealedSubclassFqName_;
    private int supertypeIdMemoizedSerializedSize;
    private List<Integer> supertypeId_;
    private List<j5c> supertype_;
    private List<k5c> typeAlias_;
    private List<l5c> typeParameter_;
    private m5c typeTable_;
    private final ur1 unknownFields;
    private p5c versionRequirementTable_;
    private List<Integer> versionRequirement_;

    public static class a extends p3<u4c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new u4c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.b<u4c, b> {
        public int V;
        public List<l5c> W;
        public List<j5c> X;
        public List<Integer> Y;
        public List<Integer> Z;
        public List<j5c> a0;
        public List<Integer> b0;
        public List<w4c> c0;
        public int d;
        public List<b5c> d0;
        public int e = 6;
        public List<g5c> e0;
        public int f;
        public List<k5c> f0;
        public List<z4c> g0;
        public List<Integer> h0;
        public int i0;
        public j5c j0;
        public int k0;
        public List<Integer> l0;
        public List<j5c> m0;
        public List<Integer> n0;
        public m5c o0;
        public List<Integer> p0;
        public p5c q0;
        public List<v4c> r0;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.W = list;
            this.X = list;
            this.Y = list;
            this.Z = list;
            this.a0 = list;
            this.b0 = list;
            this.c0 = list;
            this.d0 = list;
            this.e0 = list;
            this.f0 = list;
            this.g0 = list;
            this.h0 = list;
            this.j0 = j5c.a;
            this.l0 = list;
            this.m0 = list;
            this.n0 = list;
            this.o0 = m5c.a;
            this.p0 = list;
            this.q0 = p5c.a;
            this.r0 = list;
        }

        @Override // rp9.a
        public final rp9 build() {
            u4c u4cVarM = m();
            if (u4cVarM.d()) {
                return u4cVarM;
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
            n((u4c) rw5Var);
            return this;
        }

        public final u4c m() {
            u4c u4cVar = new u4c(this);
            int i = this.d;
            int i2 = (i & 1) != 1 ? 0 : 1;
            u4cVar.flags_ = this.e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            u4cVar.fqName_ = this.f;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            u4cVar.companionObjectName_ = this.V;
            if ((this.d & 8) == 8) {
                this.W = Collections.unmodifiableList(this.W);
                this.d &= -9;
            }
            u4cVar.typeParameter_ = this.W;
            if ((this.d & 16) == 16) {
                this.X = Collections.unmodifiableList(this.X);
                this.d &= -17;
            }
            u4cVar.supertype_ = this.X;
            if ((this.d & 32) == 32) {
                this.Y = Collections.unmodifiableList(this.Y);
                this.d &= -33;
            }
            u4cVar.supertypeId_ = this.Y;
            if ((this.d & 64) == 64) {
                this.Z = Collections.unmodifiableList(this.Z);
                this.d &= -65;
            }
            u4cVar.nestedClassName_ = this.Z;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                this.a0 = Collections.unmodifiableList(this.a0);
                this.d &= -129;
            }
            u4cVar.contextReceiverType_ = this.a0;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                this.b0 = Collections.unmodifiableList(this.b0);
                this.d &= -257;
            }
            u4cVar.contextReceiverTypeId_ = this.b0;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.c0 = Collections.unmodifiableList(this.c0);
                this.d &= -513;
            }
            u4cVar.constructor_ = this.c0;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) == 1024) {
                this.d0 = Collections.unmodifiableList(this.d0);
                this.d &= -1025;
            }
            u4cVar.function_ = this.d0;
            if ((this.d & 2048) == 2048) {
                this.e0 = Collections.unmodifiableList(this.e0);
                this.d &= -2049;
            }
            u4cVar.property_ = this.e0;
            if ((this.d & 4096) == 4096) {
                this.f0 = Collections.unmodifiableList(this.f0);
                this.d &= -4097;
            }
            u4cVar.typeAlias_ = this.f0;
            if ((this.d & 8192) == 8192) {
                this.g0 = Collections.unmodifiableList(this.g0);
                this.d &= -8193;
            }
            u4cVar.enumEntry_ = this.g0;
            if ((this.d & 16384) == 16384) {
                this.h0 = Collections.unmodifiableList(this.h0);
                this.d &= -16385;
            }
            u4cVar.sealedSubclassFqName_ = this.h0;
            if ((i & 32768) == 32768) {
                i2 |= 8;
            }
            u4cVar.inlineClassUnderlyingPropertyName_ = this.i0;
            if ((i & 65536) == 65536) {
                i2 |= 16;
            }
            u4cVar.inlineClassUnderlyingType_ = this.j0;
            if ((i & 131072) == 131072) {
                i2 |= 32;
            }
            u4cVar.inlineClassUnderlyingTypeId_ = this.k0;
            if ((this.d & 262144) == 262144) {
                this.l0 = Collections.unmodifiableList(this.l0);
                this.d &= -262145;
            }
            u4cVar.multiFieldValueClassUnderlyingName_ = this.l0;
            if ((this.d & 524288) == 524288) {
                this.m0 = Collections.unmodifiableList(this.m0);
                this.d &= -524289;
            }
            u4cVar.multiFieldValueClassUnderlyingType_ = this.m0;
            if ((this.d & 1048576) == 1048576) {
                this.n0 = Collections.unmodifiableList(this.n0);
                this.d &= -1048577;
            }
            u4cVar.multiFieldValueClassUnderlyingTypeId_ = this.n0;
            if ((i & 2097152) == 2097152) {
                i2 |= 64;
            }
            u4cVar.typeTable_ = this.o0;
            if ((this.d & 4194304) == 4194304) {
                this.p0 = Collections.unmodifiableList(this.p0);
                this.d &= -4194305;
            }
            u4cVar.versionRequirement_ = this.p0;
            if ((i & 8388608) == 8388608) {
                i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
            }
            u4cVar.versionRequirementTable_ = this.q0;
            if ((this.d & 16777216) == 16777216) {
                this.r0 = Collections.unmodifiableList(this.r0);
                this.d &= -16777217;
            }
            u4cVar.compilerPluginData_ = this.r0;
            u4cVar.bitField0_ = i2;
            return u4cVar;
        }

        public final void n(u4c u4cVar) {
            p5c p5cVar;
            m5c m5cVar;
            j5c j5cVar;
            if (u4cVar == u4c.a) {
                return;
            }
            if (u4cVar.M0()) {
                int iP0 = u4cVar.p0();
                this.d |= 1;
                this.e = iP0;
            }
            if (u4cVar.N0()) {
                int iQ0 = u4cVar.q0();
                this.d |= 2;
                this.f = iQ0;
            }
            if (u4cVar.L0()) {
                int iK0 = u4cVar.k0();
                this.d |= 4;
                this.V = iK0;
            }
            if (!u4cVar.typeParameter_.isEmpty()) {
                if (this.W.isEmpty()) {
                    this.W = u4cVar.typeParameter_;
                    this.d &= -9;
                } else {
                    if ((this.d & 8) != 8) {
                        this.W = new ArrayList(this.W);
                        this.d |= 8;
                    }
                    this.W.addAll(u4cVar.typeParameter_);
                }
            }
            if (!u4cVar.supertype_.isEmpty()) {
                if (this.X.isEmpty()) {
                    this.X = u4cVar.supertype_;
                    this.d &= -17;
                } else {
                    if ((this.d & 16) != 16) {
                        this.X = new ArrayList(this.X);
                        this.d |= 16;
                    }
                    this.X.addAll(u4cVar.supertype_);
                }
            }
            if (!u4cVar.supertypeId_.isEmpty()) {
                if (this.Y.isEmpty()) {
                    this.Y = u4cVar.supertypeId_;
                    this.d &= -33;
                } else {
                    if ((this.d & 32) != 32) {
                        this.Y = new ArrayList(this.Y);
                        this.d |= 32;
                    }
                    this.Y.addAll(u4cVar.supertypeId_);
                }
            }
            if (!u4cVar.nestedClassName_.isEmpty()) {
                if (this.Z.isEmpty()) {
                    this.Z = u4cVar.nestedClassName_;
                    this.d &= -65;
                } else {
                    if ((this.d & 64) != 64) {
                        this.Z = new ArrayList(this.Z);
                        this.d |= 64;
                    }
                    this.Z.addAll(u4cVar.nestedClassName_);
                }
            }
            if (!u4cVar.contextReceiverType_.isEmpty()) {
                if (this.a0.isEmpty()) {
                    this.a0 = u4cVar.contextReceiverType_;
                    this.d &= -129;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128) {
                        this.a0 = new ArrayList(this.a0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    }
                    this.a0.addAll(u4cVar.contextReceiverType_);
                }
            }
            if (!u4cVar.contextReceiverTypeId_.isEmpty()) {
                if (this.b0.isEmpty()) {
                    this.b0 = u4cVar.contextReceiverTypeId_;
                    this.d &= -257;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                        this.b0 = new ArrayList(this.b0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    }
                    this.b0.addAll(u4cVar.contextReceiverTypeId_);
                }
            }
            if (!u4cVar.constructor_.isEmpty()) {
                if (this.c0.isEmpty()) {
                    this.c0 = u4cVar.constructor_;
                    this.d &= -513;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                        this.c0 = new ArrayList(this.c0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    }
                    this.c0.addAll(u4cVar.constructor_);
                }
            }
            if (!u4cVar.function_.isEmpty()) {
                if (this.d0.isEmpty()) {
                    this.d0 = u4cVar.function_;
                    this.d &= -1025;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 1024) {
                        this.d0 = new ArrayList(this.d0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    }
                    this.d0.addAll(u4cVar.function_);
                }
            }
            if (!u4cVar.property_.isEmpty()) {
                if (this.e0.isEmpty()) {
                    this.e0 = u4cVar.property_;
                    this.d &= -2049;
                } else {
                    if ((this.d & 2048) != 2048) {
                        this.e0 = new ArrayList(this.e0);
                        this.d |= 2048;
                    }
                    this.e0.addAll(u4cVar.property_);
                }
            }
            if (!u4cVar.typeAlias_.isEmpty()) {
                if (this.f0.isEmpty()) {
                    this.f0 = u4cVar.typeAlias_;
                    this.d &= -4097;
                } else {
                    if ((this.d & 4096) != 4096) {
                        this.f0 = new ArrayList(this.f0);
                        this.d |= 4096;
                    }
                    this.f0.addAll(u4cVar.typeAlias_);
                }
            }
            if (!u4cVar.enumEntry_.isEmpty()) {
                if (this.g0.isEmpty()) {
                    this.g0 = u4cVar.enumEntry_;
                    this.d &= -8193;
                } else {
                    if ((this.d & 8192) != 8192) {
                        this.g0 = new ArrayList(this.g0);
                        this.d |= 8192;
                    }
                    this.g0.addAll(u4cVar.enumEntry_);
                }
            }
            if (!u4cVar.sealedSubclassFqName_.isEmpty()) {
                if (this.h0.isEmpty()) {
                    this.h0 = u4cVar.sealedSubclassFqName_;
                    this.d &= -16385;
                } else {
                    if ((this.d & 16384) != 16384) {
                        this.h0 = new ArrayList(this.h0);
                        this.d |= 16384;
                    }
                    this.h0.addAll(u4cVar.sealedSubclassFqName_);
                }
            }
            if (u4cVar.O0()) {
                int iT0 = u4cVar.t0();
                this.d |= 32768;
                this.i0 = iT0;
            }
            if (u4cVar.P0()) {
                j5c j5cVarU0 = u4cVar.u0();
                if ((this.d & 65536) != 65536 || (j5cVar = this.j0) == j5c.a) {
                    this.j0 = j5cVarU0;
                } else {
                    j5c.c cVarM0 = j5c.m0(j5cVar);
                    cVarM0.n(j5cVarU0);
                    this.j0 = cVarM0.m();
                }
                this.d |= 65536;
            }
            if (u4cVar.Q0()) {
                int iV0 = u4cVar.v0();
                this.d |= 131072;
                this.k0 = iV0;
            }
            if (!u4cVar.multiFieldValueClassUnderlyingName_.isEmpty()) {
                if (this.l0.isEmpty()) {
                    this.l0 = u4cVar.multiFieldValueClassUnderlyingName_;
                    this.d &= -262145;
                } else {
                    if ((this.d & 262144) != 262144) {
                        this.l0 = new ArrayList(this.l0);
                        this.d |= 262144;
                    }
                    this.l0.addAll(u4cVar.multiFieldValueClassUnderlyingName_);
                }
            }
            if (!u4cVar.multiFieldValueClassUnderlyingType_.isEmpty()) {
                if (this.m0.isEmpty()) {
                    this.m0 = u4cVar.multiFieldValueClassUnderlyingType_;
                    this.d &= -524289;
                } else {
                    if ((this.d & 524288) != 524288) {
                        this.m0 = new ArrayList(this.m0);
                        this.d |= 524288;
                    }
                    this.m0.addAll(u4cVar.multiFieldValueClassUnderlyingType_);
                }
            }
            if (!u4cVar.multiFieldValueClassUnderlyingTypeId_.isEmpty()) {
                if (this.n0.isEmpty()) {
                    this.n0 = u4cVar.multiFieldValueClassUnderlyingTypeId_;
                    this.d &= -1048577;
                } else {
                    if ((this.d & 1048576) != 1048576) {
                        this.n0 = new ArrayList(this.n0);
                        this.d |= 1048576;
                    }
                    this.n0.addAll(u4cVar.multiFieldValueClassUnderlyingTypeId_);
                }
            }
            if (u4cVar.R0()) {
                m5c m5cVarJ0 = u4cVar.J0();
                if ((this.d & 2097152) != 2097152 || (m5cVar = this.o0) == m5c.a) {
                    this.o0 = m5cVarJ0;
                } else {
                    m5c.b bVarQ = m5c.q(m5cVar);
                    bVarQ.m(m5cVarJ0);
                    this.o0 = bVarQ.l();
                }
                this.d |= 2097152;
            }
            if (!u4cVar.versionRequirement_.isEmpty()) {
                if (this.p0.isEmpty()) {
                    this.p0 = u4cVar.versionRequirement_;
                    this.d &= -4194305;
                } else {
                    if ((this.d & 4194304) != 4194304) {
                        this.p0 = new ArrayList(this.p0);
                        this.d |= 4194304;
                    }
                    this.p0.addAll(u4cVar.versionRequirement_);
                }
            }
            if (u4cVar.S0()) {
                p5c p5cVarK0 = u4cVar.K0();
                if ((this.d & 8388608) != 8388608 || (p5cVar = this.q0) == p5c.a) {
                    this.q0 = p5cVarK0;
                } else {
                    p5c.b bVar = new p5c.b();
                    bVar.m(p5cVar);
                    bVar.m(p5cVarK0);
                    this.q0 = bVar.l();
                }
                this.d |= 8388608;
            }
            if (!u4cVar.compilerPluginData_.isEmpty()) {
                if (this.r0.isEmpty()) {
                    this.r0 = u4cVar.compilerPluginData_;
                    this.d &= -16777217;
                } else {
                    if ((this.d & 16777216) != 16777216) {
                        this.r0 = new ArrayList(this.r0);
                        this.d |= 16777216;
                    }
                    this.r0.addAll(u4cVar.compilerPluginData_);
                }
            }
            l(u4cVar);
            this.a = this.a.b(u4cVar.unknownFields);
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
                u4c$a r1 = defpackage.u4c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                u4c r1 = new u4c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.n(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                u4c r4 = (defpackage.u4c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: u4c.b.o(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }
    }

    public enum c implements pi7.a {
        CLASS(0),
        INTERFACE(1),
        ENUM_CLASS(2),
        /* JADX INFO: Fake field, exist only in values array */
        ENUM_ENTRY(3),
        ANNOTATION_CLASS(4),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(5),
        COMPANION_OBJECT(6);

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
        u4c u4cVar = new u4c(0);
        a = u4cVar;
        u4cVar.T0();
    }

    public u4c() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Type inference failed for: r12v51, types: [j5c$c] */
    /* JADX WARN: Type inference failed for: r12v82, types: [m5c$b] */
    /* JADX WARN: Type inference failed for: r14v98, types: [p5c$b] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u4c(defpackage.e92 r23, defpackage.s45 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u4c.<init>(e92, s45):void");
    }

    public final List<Integer> A0() {
        return this.multiFieldValueClassUnderlyingTypeId_;
    }

    public final List<j5c> B0() {
        return this.multiFieldValueClassUnderlyingType_;
    }

    public final List<Integer> C0() {
        return this.nestedClassName_;
    }

    public final List<g5c> D0() {
        return this.property_;
    }

    public final List<Integer> E0() {
        return this.sealedSubclassFqName_;
    }

    public final List<Integer> F0() {
        return this.supertypeId_;
    }

    public final List<j5c> G0() {
        return this.supertype_;
    }

    public final List<k5c> H0() {
        return this.typeAlias_;
    }

    public final List<l5c> I0() {
        return this.typeParameter_;
    }

    public final m5c J0() {
        return this.typeTable_;
    }

    public final p5c K0() {
        return this.versionRequirementTable_;
    }

    public final boolean L0() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean M0() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean N0() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean O0() {
        return (this.bitField0_ & 8) == 8;
    }

    public final boolean P0() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean Q0() {
        return (this.bitField0_ & 32) == 32;
    }

    public final boolean R0() {
        return (this.bitField0_ & 64) == 64;
    }

    public final boolean S0() {
        return (this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128;
    }

    public final void T0() {
        this.flags_ = 6;
        this.fqName_ = 0;
        this.companionObjectName_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        this.supertype_ = list;
        this.supertypeId_ = list;
        this.nestedClassName_ = list;
        this.contextReceiverType_ = list;
        this.contextReceiverTypeId_ = list;
        this.constructor_ = list;
        this.function_ = list;
        this.property_ = list;
        this.typeAlias_ = list;
        this.enumEntry_ = list;
        this.sealedSubclassFqName_ = list;
        this.inlineClassUnderlyingPropertyName_ = 0;
        this.inlineClassUnderlyingType_ = j5c.a;
        this.inlineClassUnderlyingTypeId_ = 0;
        this.multiFieldValueClassUnderlyingName_ = list;
        this.multiFieldValueClassUnderlyingType_ = list;
        this.multiFieldValueClassUnderlyingTypeId_ = list;
        this.typeTable_ = m5c.a;
        this.versionRequirement_ = list;
        this.versionRequirementTable_ = p5c.a;
        this.compilerPluginData_ = list;
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
        if (!N0()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            if (!this.typeParameter_.get(i).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.supertype_.size(); i2++) {
            if (!this.supertype_.get(i2).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            if (!this.contextReceiverType_.get(i3).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.constructor_.size(); i4++) {
            if (!this.constructor_.get(i4).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.function_.size(); i5++) {
            if (!this.function_.get(i5).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.property_.size(); i6++) {
            if (!this.property_.get(i6).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.typeAlias_.size(); i7++) {
            if (!this.typeAlias_.get(i7).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.enumEntry_.size(); i8++) {
            if (!this.enumEntry_.get(i8).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (P0() && !this.inlineClassUnderlyingType_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.multiFieldValueClassUnderlyingType_.size(); i9++) {
            if (!this.multiFieldValueClassUnderlyingType_.get(i9).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (R0() && !this.typeTable_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.compilerPluginData_.size(); i10++) {
            if (!this.compilerPluginData_.get(i10).d()) {
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
        List<Integer> list2;
        List<Integer> list3;
        List<Integer> list4;
        List<Integer> list5;
        List<Integer> list6;
        List<Integer> list7;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.flags_) : 0;
        int i2 = 0;
        int iC = 0;
        while (true) {
            int size = this.supertypeId_.size();
            list = this.supertypeId_;
            if (i2 >= size) {
                break;
            }
            iC += f92.c(list.get(i2).intValue());
            i2++;
        }
        int iD = iB + iC;
        if (!list.isEmpty()) {
            iD = iD + 1 + f92.c(iC);
        }
        this.supertypeIdMemoizedSerializedSize = iC;
        if ((this.bitField0_ & 2) == 2) {
            iD += f92.b(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            iD += f92.b(4, this.companionObjectName_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            iD += f92.d(5, this.typeParameter_.get(i3));
        }
        for (int i4 = 0; i4 < this.supertype_.size(); i4++) {
            iD += f92.d(6, this.supertype_.get(i4));
        }
        int i5 = 0;
        int iC2 = 0;
        while (true) {
            int size2 = this.nestedClassName_.size();
            list2 = this.nestedClassName_;
            if (i5 >= size2) {
                break;
            }
            iC2 += f92.c(list2.get(i5).intValue());
            i5++;
        }
        int iD2 = iD + iC2;
        if (!list2.isEmpty()) {
            iD2 = iD2 + 1 + f92.c(iC2);
        }
        this.nestedClassNameMemoizedSerializedSize = iC2;
        for (int i6 = 0; i6 < this.constructor_.size(); i6++) {
            iD2 += f92.d(8, this.constructor_.get(i6));
        }
        for (int i7 = 0; i7 < this.function_.size(); i7++) {
            iD2 += f92.d(9, this.function_.get(i7));
        }
        for (int i8 = 0; i8 < this.property_.size(); i8++) {
            iD2 += f92.d(10, this.property_.get(i8));
        }
        for (int i9 = 0; i9 < this.typeAlias_.size(); i9++) {
            iD2 += f92.d(11, this.typeAlias_.get(i9));
        }
        for (int i10 = 0; i10 < this.enumEntry_.size(); i10++) {
            iD2 += f92.d(13, this.enumEntry_.get(i10));
        }
        int i11 = 0;
        int iC3 = 0;
        while (true) {
            int size3 = this.sealedSubclassFqName_.size();
            list3 = this.sealedSubclassFqName_;
            if (i11 >= size3) {
                break;
            }
            iC3 += f92.c(list3.get(i11).intValue());
            i11++;
        }
        int iD3 = iD2 + iC3;
        if (!list3.isEmpty()) {
            iD3 = iD3 + 2 + f92.c(iC3);
        }
        this.sealedSubclassFqNameMemoizedSerializedSize = iC3;
        if ((this.bitField0_ & 8) == 8) {
            iD3 += f92.b(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iD3 += f92.d(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iD3 += f92.b(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i12 = 0; i12 < this.contextReceiverType_.size(); i12++) {
            iD3 += f92.d(20, this.contextReceiverType_.get(i12));
        }
        int i13 = 0;
        int iC4 = 0;
        while (true) {
            int size4 = this.contextReceiverTypeId_.size();
            list4 = this.contextReceiverTypeId_;
            if (i13 >= size4) {
                break;
            }
            iC4 += f92.c(list4.get(i13).intValue());
            i13++;
        }
        int iC5 = iD3 + iC4;
        if (!list4.isEmpty()) {
            iC5 = iC5 + 2 + f92.c(iC4);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = iC4;
        int i14 = 0;
        int iC6 = 0;
        while (true) {
            int size5 = this.multiFieldValueClassUnderlyingName_.size();
            list5 = this.multiFieldValueClassUnderlyingName_;
            if (i14 >= size5) {
                break;
            }
            iC6 += f92.c(list5.get(i14).intValue());
            i14++;
        }
        int iD4 = iC5 + iC6;
        if (!list5.isEmpty()) {
            iD4 = iD4 + 2 + f92.c(iC6);
        }
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = iC6;
        for (int i15 = 0; i15 < this.multiFieldValueClassUnderlyingType_.size(); i15++) {
            iD4 += f92.d(23, this.multiFieldValueClassUnderlyingType_.get(i15));
        }
        int i16 = 0;
        int iC7 = 0;
        while (true) {
            int size6 = this.multiFieldValueClassUnderlyingTypeId_.size();
            list6 = this.multiFieldValueClassUnderlyingTypeId_;
            if (i16 >= size6) {
                break;
            }
            iC7 += f92.c(list6.get(i16).intValue());
            i16++;
        }
        int iD5 = iD4 + iC7;
        if (!list6.isEmpty()) {
            iD5 = iD5 + 2 + f92.c(iC7);
        }
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = iC7;
        if ((this.bitField0_ & 64) == 64) {
            iD5 += f92.d(30, this.typeTable_);
        }
        int i17 = 0;
        int iC8 = 0;
        while (true) {
            int size7 = this.versionRequirement_.size();
            list7 = this.versionRequirement_;
            if (i17 >= size7) {
                break;
            }
            iC8 += f92.c(list7.get(i17).intValue());
            i17++;
        }
        int size8 = (list7.size() * 2) + iD5 + iC8;
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            size8 += f92.d(32, this.versionRequirementTable_);
        }
        for (int i18 = 0; i18 < this.compilerPluginData_.size(); i18++) {
            size8 += f92.d(33, this.compilerPluginData_.get(i18));
        }
        int size9 = this.unknownFields.size() + k() + size8;
        this.memoizedSerializedSize = size9;
        return size9;
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
        if (this.supertypeId_.size() > 0) {
            f92Var.v(18);
            f92Var.v(this.supertypeIdMemoizedSerializedSize);
        }
        for (int i = 0; i < this.supertypeId_.size(); i++) {
            f92Var.n(this.supertypeId_.get(i).intValue());
        }
        if ((this.bitField0_ & 2) == 2) {
            f92Var.m(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            f92Var.m(4, this.companionObjectName_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            f92Var.o(5, this.typeParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
            f92Var.o(6, this.supertype_.get(i3));
        }
        if (this.nestedClassName_.size() > 0) {
            f92Var.v(58);
            f92Var.v(this.nestedClassNameMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
            f92Var.n(this.nestedClassName_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
            f92Var.o(8, this.constructor_.get(i5));
        }
        for (int i6 = 0; i6 < this.function_.size(); i6++) {
            f92Var.o(9, this.function_.get(i6));
        }
        for (int i7 = 0; i7 < this.property_.size(); i7++) {
            f92Var.o(10, this.property_.get(i7));
        }
        for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
            f92Var.o(11, this.typeAlias_.get(i8));
        }
        for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
            f92Var.o(13, this.enumEntry_.get(i9));
        }
        if (this.sealedSubclassFqName_.size() > 0) {
            f92Var.v(130);
            f92Var.v(this.sealedSubclassFqNameMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
            f92Var.n(this.sealedSubclassFqName_.get(i10).intValue());
        }
        if ((this.bitField0_ & 8) == 8) {
            f92Var.m(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            f92Var.o(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            f92Var.m(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
            f92Var.o(20, this.contextReceiverType_.get(i11));
        }
        if (this.contextReceiverTypeId_.size() > 0) {
            f92Var.v(170);
            f92Var.v(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
            f92Var.n(this.contextReceiverTypeId_.get(i12).intValue());
        }
        if (this.multiFieldValueClassUnderlyingName_.size() > 0) {
            f92Var.v(178);
            f92Var.v(this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize);
        }
        for (int i13 = 0; i13 < this.multiFieldValueClassUnderlyingName_.size(); i13++) {
            f92Var.n(this.multiFieldValueClassUnderlyingName_.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.multiFieldValueClassUnderlyingType_.size(); i14++) {
            f92Var.o(23, this.multiFieldValueClassUnderlyingType_.get(i14));
        }
        if (this.multiFieldValueClassUnderlyingTypeId_.size() > 0) {
            f92Var.v(194);
            f92Var.v(this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize);
        }
        for (int i15 = 0; i15 < this.multiFieldValueClassUnderlyingTypeId_.size(); i15++) {
            f92Var.n(this.multiFieldValueClassUnderlyingTypeId_.get(i15).intValue());
        }
        if ((this.bitField0_ & 64) == 64) {
            f92Var.o(30, this.typeTable_);
        }
        for (int i16 = 0; i16 < this.versionRequirement_.size(); i16++) {
            f92Var.m(31, this.versionRequirement_.get(i16).intValue());
        }
        if ((this.bitField0_ & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
            f92Var.o(32, this.versionRequirementTable_);
        }
        for (int i17 = 0; i17 < this.compilerPluginData_.size(); i17++) {
            f92Var.o(33, this.compilerPluginData_.get(i17));
        }
        aVar.a(19000, f92Var);
        f92Var.r(this.unknownFields);
    }

    public final int k0() {
        return this.companionObjectName_;
    }

    public final List<w4c> l0() {
        return this.constructor_;
    }

    public final List<Integer> m0() {
        return this.contextReceiverTypeId_;
    }

    public final List<j5c> n0() {
        return this.contextReceiverType_;
    }

    public final List<z4c> o0() {
        return this.enumEntry_;
    }

    public final int p0() {
        return this.flags_;
    }

    public final int q0() {
        return this.fqName_;
    }

    public final List<b5c> r0() {
        return this.function_;
    }

    public final int t0() {
        return this.inlineClassUnderlyingPropertyName_;
    }

    public final j5c u0() {
        return this.inlineClassUnderlyingType_;
    }

    public final int v0() {
        return this.inlineClassUnderlyingTypeId_;
    }

    public final int w0() {
        return this.multiFieldValueClassUnderlyingName_.size();
    }

    public final List<Integer> x0() {
        return this.multiFieldValueClassUnderlyingName_;
    }

    public final int y0() {
        return this.multiFieldValueClassUnderlyingType_.size();
    }

    public final int z0() {
        return this.multiFieldValueClassUnderlyingTypeId_.size();
    }

    public u4c(b bVar) {
        super(bVar);
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public u4c(int i) {
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
