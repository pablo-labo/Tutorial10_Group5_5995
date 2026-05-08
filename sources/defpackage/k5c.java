package defpackage;

import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.h3;
import defpackage.j5c;
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
public final class k5c extends rw5.c<k5c> {
    public static final k5c a;
    public static final a b = new a();
    private List<t4c> annotation_;
    private int bitField0_;
    private List<v4c> compilerPluginData_;
    private int expandedTypeId_;
    private j5c expandedType_;
    private int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int name_;
    private List<l5c> typeParameter_;
    private int underlyingTypeId_;
    private j5c underlyingType_;
    private final ur1 unknownFields;
    private List<Integer> versionRequirement_;

    public static class a extends p3<k5c> {
        @Override // defpackage.n4b
        public final Object a(e92 e92Var, s45 s45Var) {
            return new k5c(e92Var, s45Var);
        }
    }

    public static final class b extends rw5.b<k5c, b> {
        public List<l5c> V;
        public j5c W;
        public int X;
        public j5c Y;
        public int Z;
        public List<t4c> a0;
        public List<Integer> b0;
        public List<v4c> c0;
        public int d;
        public int e = 6;
        public int f;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.V = list;
            j5c j5cVar = j5c.a;
            this.W = j5cVar;
            this.Y = j5cVar;
            this.a0 = list;
            this.b0 = list;
            this.c0 = list;
        }

        @Override // rp9.a
        public final rp9 build() {
            k5c k5cVarM = m();
            if (k5cVarM.d()) {
                return k5cVarM;
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
            n((k5c) rw5Var);
            return this;
        }

        public final k5c m() {
            k5c k5cVar = new k5c(this);
            int i = this.d;
            int i2 = (i & 1) != 1 ? 0 : 1;
            k5cVar.flags_ = this.e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            k5cVar.name_ = this.f;
            if ((this.d & 4) == 4) {
                this.V = Collections.unmodifiableList(this.V);
                this.d &= -5;
            }
            k5cVar.typeParameter_ = this.V;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            k5cVar.underlyingType_ = this.W;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            k5cVar.underlyingTypeId_ = this.X;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            k5cVar.expandedType_ = this.Y;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            k5cVar.expandedTypeId_ = this.Z;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                this.a0 = Collections.unmodifiableList(this.a0);
                this.d &= -129;
            }
            k5cVar.annotation_ = this.a0;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                this.b0 = Collections.unmodifiableList(this.b0);
                this.d &= -257;
            }
            k5cVar.versionRequirement_ = this.b0;
            if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
                this.c0 = Collections.unmodifiableList(this.c0);
                this.d &= -513;
            }
            k5cVar.compilerPluginData_ = this.c0;
            k5cVar.bitField0_ = i2;
            return k5cVar;
        }

        public final void n(k5c k5cVar) {
            j5c j5cVar;
            j5c j5cVar2;
            if (k5cVar == k5c.a) {
                return;
            }
            if (k5cVar.S()) {
                int iL = k5cVar.L();
                this.d |= 1;
                this.e = iL;
            }
            if (k5cVar.T()) {
                int iM = k5cVar.M();
                this.d |= 2;
                this.f = iM;
            }
            if (!k5cVar.typeParameter_.isEmpty()) {
                if (this.V.isEmpty()) {
                    this.V = k5cVar.typeParameter_;
                    this.d &= -5;
                } else {
                    if ((this.d & 4) != 4) {
                        this.V = new ArrayList(this.V);
                        this.d |= 4;
                    }
                    this.V.addAll(k5cVar.typeParameter_);
                }
            }
            if (k5cVar.U()) {
                j5c j5cVarO = k5cVar.O();
                if ((this.d & 8) != 8 || (j5cVar2 = this.W) == j5c.a) {
                    this.W = j5cVarO;
                } else {
                    j5c.c cVarM0 = j5c.m0(j5cVar2);
                    cVarM0.n(j5cVarO);
                    this.W = cVarM0.m();
                }
                this.d |= 8;
            }
            if (k5cVar.V()) {
                int iP = k5cVar.P();
                this.d |= 16;
                this.X = iP;
            }
            if (k5cVar.Q()) {
                j5c j5cVarJ = k5cVar.J();
                if ((this.d & 32) != 32 || (j5cVar = this.Y) == j5c.a) {
                    this.Y = j5cVarJ;
                } else {
                    j5c.c cVarM02 = j5c.m0(j5cVar);
                    cVarM02.n(j5cVarJ);
                    this.Y = cVarM02.m();
                }
                this.d |= 32;
            }
            if (k5cVar.R()) {
                int iK = k5cVar.K();
                this.d |= 64;
                this.Z = iK;
            }
            if (!k5cVar.annotation_.isEmpty()) {
                if (this.a0.isEmpty()) {
                    this.a0 = k5cVar.annotation_;
                    this.d &= -129;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128) {
                        this.a0 = new ArrayList(this.a0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    }
                    this.a0.addAll(k5cVar.annotation_);
                }
            }
            if (!k5cVar.versionRequirement_.isEmpty()) {
                if (this.b0.isEmpty()) {
                    this.b0 = k5cVar.versionRequirement_;
                    this.d &= -257;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                        this.b0 = new ArrayList(this.b0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    }
                    this.b0.addAll(k5cVar.versionRequirement_);
                }
            }
            if (!k5cVar.compilerPluginData_.isEmpty()) {
                if (this.c0.isEmpty()) {
                    this.c0 = k5cVar.compilerPluginData_;
                    this.d &= -513;
                } else {
                    if ((this.d & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                        this.c0 = new ArrayList(this.c0);
                        this.d |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    }
                    this.c0.addAll(k5cVar.compilerPluginData_);
                }
            }
            l(k5cVar);
            this.a = this.a.b(k5cVar.unknownFields);
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
                k5c$a r1 = defpackage.k5c.b     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.getClass()     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                k5c r1 = new k5c     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                r2.n(r1)
                return
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                rp9 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                k5c r4 = (defpackage.k5c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: k5c.b.o(e92, s45):void");
        }

        @Override // h3.a, rp9.a
        public final /* bridge */ /* synthetic */ rp9.a s0(e92 e92Var, s45 s45Var) throws Throwable {
            o(e92Var, s45Var);
            return this;
        }
    }

    static {
        k5c k5cVar = new k5c(0);
        a = k5cVar;
        k5cVar.flags_ = 6;
        k5cVar.name_ = 0;
        List list = Collections.EMPTY_LIST;
        k5cVar.typeParameter_ = list;
        j5c j5cVar = j5c.a;
        k5cVar.underlyingType_ = j5cVar;
        k5cVar.underlyingTypeId_ = 0;
        k5cVar.expandedType_ = j5cVar;
        k5cVar.expandedTypeId_ = 0;
        k5cVar.annotation_ = list;
        k5cVar.versionRequirement_ = list;
        k5cVar.compilerPluginData_ = list;
    }

    public k5c() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public k5c(e92 e92Var, s45 s45Var) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.flags_ = 6;
        boolean z = false;
        this.name_ = 0;
        List list = Collections.EMPTY_LIST;
        this.typeParameter_ = list;
        j5c j5cVar = j5c.a;
        this.underlyingType_ = j5cVar;
        this.underlyingTypeId_ = 0;
        this.expandedType_ = j5cVar;
        this.expandedTypeId_ = 0;
        this.annotation_ = list;
        this.versionRequirement_ = list;
        this.compilerPluginData_ = list;
        ur1.b bVar = new ur1.b();
        f92 f92VarJ = f92.j(bVar, 1);
        int i = 0;
        while (true) {
            ?? Q = 128;
            if (z) {
                if ((i & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
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
                    switch (iN) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.bitField0_ |= 1;
                            this.flags_ = e92Var.k();
                            break;
                        case 16:
                            this.bitField0_ |= 2;
                            this.name_ = e92Var.k();
                            break;
                        case 26:
                            if ((i & 4) != 4) {
                                this.typeParameter_ = new ArrayList();
                                i |= 4;
                            }
                            this.typeParameter_.add((l5c) e92Var.g(l5c.b, s45Var));
                            break;
                        case 34:
                            if ((this.bitField0_ & 4) == 4) {
                                j5c j5cVar2 = this.underlyingType_;
                                j5cVar2.getClass();
                                cVarM0 = j5c.m0(j5cVar2);
                            }
                            j5c j5cVar3 = (j5c) e92Var.g(j5c.b, s45Var);
                            this.underlyingType_ = j5cVar3;
                            if (cVarM0 != null) {
                                cVarM0.n(j5cVar3);
                                this.underlyingType_ = cVarM0.m();
                            }
                            this.bitField0_ |= 4;
                            break;
                        case 40:
                            this.bitField0_ |= 8;
                            this.underlyingTypeId_ = e92Var.k();
                            break;
                        case 50:
                            if ((this.bitField0_ & 16) == 16) {
                                j5c j5cVar4 = this.expandedType_;
                                j5cVar4.getClass();
                                cVarM0 = j5c.m0(j5cVar4);
                            }
                            j5c j5cVar5 = (j5c) e92Var.g(j5c.b, s45Var);
                            this.expandedType_ = j5cVar5;
                            if (cVarM0 != null) {
                                cVarM0.n(j5cVar5);
                                this.expandedType_ = cVarM0.m();
                            }
                            this.bitField0_ |= 16;
                            break;
                        case 56:
                            this.bitField0_ |= 32;
                            this.expandedTypeId_ = e92Var.k();
                            break;
                        case 66:
                            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 128) {
                                this.annotation_ = new ArrayList();
                                i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                            }
                            this.annotation_.add((t4c) e92Var.g(t4c.b, s45Var));
                            break;
                        case 248:
                            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256) {
                                this.versionRequirement_ = new ArrayList();
                                i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            }
                            this.versionRequirement_.add(Integer.valueOf(e92Var.k()));
                            break;
                        case 250:
                            int iD = e92Var.d(e92Var.k());
                            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 256 && e92Var.b() > 0) {
                                this.versionRequirement_ = new ArrayList();
                                i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                            }
                            while (e92Var.b() > 0) {
                                this.versionRequirement_.add(Integer.valueOf(e92Var.k()));
                            }
                            e92Var.c(iD);
                            break;
                        case 258:
                            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 512) {
                                this.compilerPluginData_ = new ArrayList();
                                i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
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
                if ((i & 4) == 4) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == Q) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
                }
                if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) == 256) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
                }
                if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 512) {
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

    public final List<t4c> I() {
        return this.annotation_;
    }

    public final j5c J() {
        return this.expandedType_;
    }

    public final int K() {
        return this.expandedTypeId_;
    }

    public final int L() {
        return this.flags_;
    }

    public final int M() {
        return this.name_;
    }

    public final List<l5c> N() {
        return this.typeParameter_;
    }

    public final j5c O() {
        return this.underlyingType_;
    }

    public final int P() {
        return this.underlyingTypeId_;
    }

    public final boolean Q() {
        return (this.bitField0_ & 16) == 16;
    }

    public final boolean R() {
        return (this.bitField0_ & 32) == 32;
    }

    public final boolean S() {
        return (this.bitField0_ & 1) == 1;
    }

    public final boolean T() {
        return (this.bitField0_ & 2) == 2;
    }

    public final boolean U() {
        return (this.bitField0_ & 4) == 4;
    }

    public final boolean V() {
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
        if (!T()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            if (!this.typeParameter_.get(i).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (U() && !this.underlyingType_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        if (Q() && !this.expandedType_.d()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            if (!this.annotation_.get(i2).d()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
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

    @Override // defpackage.rp9
    public final int e() {
        List<Integer> list;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iB = (this.bitField0_ & 1) == 1 ? f92.b(1, this.flags_) : 0;
        if ((this.bitField0_ & 2) == 2) {
            iB += f92.b(2, this.name_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            iB += f92.d(3, this.typeParameter_.get(i2));
        }
        if ((this.bitField0_ & 4) == 4) {
            iB += f92.d(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            iB += f92.b(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            iB += f92.d(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            iB += f92.b(7, this.expandedTypeId_);
        }
        for (int i3 = 0; i3 < this.annotation_.size(); i3++) {
            iB += f92.d(8, this.annotation_.get(i3));
        }
        int i4 = 0;
        int iC = 0;
        while (true) {
            int size = this.versionRequirement_.size();
            list = this.versionRequirement_;
            if (i4 >= size) {
                break;
            }
            iC += f92.c(list.get(i4).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iB + iC;
        for (int i5 = 0; i5 < this.compilerPluginData_.size(); i5++) {
            size2 += f92.d(32, this.compilerPluginData_.get(i5));
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
        if ((this.bitField0_ & 2) == 2) {
            f92Var.m(2, this.name_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            f92Var.o(3, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 4) == 4) {
            f92Var.o(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            f92Var.m(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            f92Var.o(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            f92Var.m(7, this.expandedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            f92Var.o(8, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            f92Var.m(31, this.versionRequirement_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.compilerPluginData_.size(); i4++) {
            f92Var.o(32, this.compilerPluginData_.get(i4));
        }
        aVar.a(UiRumDebugListener.DEFAULT_ALPHA, f92Var);
        f92Var.r(this.unknownFields);
    }

    public k5c(b bVar) {
        super(bVar);
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.a;
    }

    public k5c(int i) {
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = ur1.a;
    }
}
