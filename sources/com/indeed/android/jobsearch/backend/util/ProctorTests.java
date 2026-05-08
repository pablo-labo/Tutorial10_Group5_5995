package com.indeed.android.jobsearch.backend.util;

import androidx.annotation.Keep;
import defpackage.as0;
import defpackage.b0;
import defpackage.boa;
import defpackage.by8;
import defpackage.ewa;
import defpackage.i04;
import defpackage.mve;
import defpackage.ni1;
import defpackage.o7e;
import defpackage.p7e;
import defpackage.qp1;
import defpackage.qt8;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import defpackage.wl7;
import defpackage.ypd;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@o7e
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0003%&'B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006("}, d2 = {"Lcom/indeed/android/jobsearch/backend/util/ProctorTests;", "", "", "", "Lcom/indeed/android/jobsearch/backend/util/ProctorTests$TestSpec;", "tests", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/util/Map;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$app_playProdRelease", "(Lcom/indeed/android/jobsearch/backend/util/ProctorTests;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/indeed/android/jobsearch/backend/util/ProctorTests;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getTests", "Companion", "TestSpec", "a", "b", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProctorTests {
    private final Map<String, TestSpec> tests;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final int $stable = 8;
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {boa.E(qt8.b, new as0(13))};

    @sy3
    public static final /* synthetic */ class a implements sw5<ProctorTests> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jobsearch.backend.util.ProctorTests", aVar, 1);
            pluginGeneratedSerialDescriptor.k("tests", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sw5
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{ProctorTests.$childSerializers[0].getValue()};
        }

        @Override // defpackage.i04
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ul2 ul2VarB = decoder.b(serialDescriptor);
            Lazy[] lazyArr = ProctorTests.$childSerializers;
            p7e p7eVar = null;
            boolean z = true;
            int i = 0;
            Map map = null;
            while (z) {
                int iP = ul2VarB.p(serialDescriptor);
                if (iP == -1) {
                    z = false;
                } else {
                    if (iP != 0) {
                        b0.m(iP);
                        return null;
                    }
                    map = (Map) ul2VarB.z(serialDescriptor, 0, (i04) lazyArr[0].getValue(), map);
                    i = 1;
                }
            }
            ul2VarB.c(serialDescriptor);
            return new ProctorTests(i, map, p7eVar);
        }

        @Override // defpackage.r7e, defpackage.i04
        /* JADX INFO: renamed from: getDescriptor */
        public final SerialDescriptor get$$serialDesc() {
            return descriptor;
        }

        @Override // defpackage.r7e
        public final void serialize(Encoder encoder, Object obj) {
            ProctorTests proctorTests = (ProctorTests) obj;
            proctorTests.getClass();
            SerialDescriptor serialDescriptor = descriptor;
            vl2 vl2VarB = encoder.b(serialDescriptor);
            ProctorTests.write$Self$app_playProdRelease(proctorTests, vl2VarB, serialDescriptor);
            vl2VarB.c(serialDescriptor);
        }

        @Override // defpackage.sw5
        public final KSerializer<?>[] typeParametersSerializers() {
            return ypd.V;
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.jobsearch.backend.util.ProctorTests$b, reason: from kotlin metadata */
    public static final class Companion {
        public final KSerializer<ProctorTests> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ ProctorTests(int i, Map map, p7e p7eVar) {
        if (1 == (i & 1)) {
            this.tests = map;
        } else {
            ewa.M(i, 1, a.a.get$$serialDesc());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new by8(mve.a, TestSpec.a.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProctorTests copy$default(ProctorTests proctorTests, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = proctorTests.tests;
        }
        return proctorTests.copy(map);
    }

    public static final /* synthetic */ void write$Self$app_playProdRelease(ProctorTests self, vl2 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, $childSerializers[0].getValue(), self.tests);
    }

    public final Map<String, TestSpec> component1() {
        return this.tests;
    }

    public final ProctorTests copy(Map<String, TestSpec> tests) {
        tests.getClass();
        return new ProctorTests(tests);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProctorTests) && wl7.b(this.tests, ((ProctorTests) other).tests);
    }

    public final Map<String, TestSpec> getTests() {
        return this.tests;
    }

    public int hashCode() {
        return this.tests.hashCode();
    }

    public String toString() {
        return "ProctorTests(tests=" + this.tests + ")";
    }

    @o7e
    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\u0003\u0010\u0015¨\u0006$"}, d2 = {"Lcom/indeed/android/jobsearch/backend/util/ProctorTests$TestSpec;", "", "", "isHotLoadSafe", "<init>", "(Ljava/lang/Boolean;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$app_playProdRelease", "(Lcom/indeed/android/jobsearch/backend/util/ProctorTests$TestSpec;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/indeed/android/jobsearch/backend/util/ProctorTests$TestSpec;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "Companion", "a", "b", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TestSpec {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        private final Boolean isHotLoadSafe;

        @sy3
        public static final /* synthetic */ class a implements sw5<TestSpec> {
            public static final a a;
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jobsearch.backend.util.ProctorTests.TestSpec", aVar, 1);
                pluginGeneratedSerialDescriptor.k("isHotLoadSafe", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{qp1.b(ni1.a)};
            }

            @Override // defpackage.i04
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = descriptor;
                ul2 ul2VarB = decoder.b(serialDescriptor);
                p7e p7eVar = null;
                boolean z = true;
                int i = 0;
                Boolean bool = null;
                while (z) {
                    int iP = ul2VarB.p(serialDescriptor);
                    if (iP == -1) {
                        z = false;
                    } else {
                        if (iP != 0) {
                            b0.m(iP);
                            return null;
                        }
                        bool = (Boolean) ul2VarB.h(serialDescriptor, 0, ni1.a, bool);
                        i = 1;
                    }
                }
                ul2VarB.c(serialDescriptor);
                return new TestSpec(i, bool, p7eVar);
            }

            @Override // defpackage.r7e, defpackage.i04
            /* JADX INFO: renamed from: getDescriptor */
            public final SerialDescriptor get$$serialDesc() {
                return descriptor;
            }

            @Override // defpackage.r7e
            public final void serialize(Encoder encoder, Object obj) {
                TestSpec testSpec = (TestSpec) obj;
                testSpec.getClass();
                SerialDescriptor serialDescriptor = descriptor;
                vl2 vl2VarB = encoder.b(serialDescriptor);
                TestSpec.write$Self$app_playProdRelease(testSpec, vl2VarB, serialDescriptor);
                vl2VarB.c(serialDescriptor);
            }

            @Override // defpackage.sw5
            public final KSerializer<?>[] typeParametersSerializers() {
                return ypd.V;
            }
        }

        /* JADX INFO: renamed from: com.indeed.android.jobsearch.backend.util.ProctorTests$TestSpec$b, reason: from kotlin metadata */
        public static final class Companion {
            public final KSerializer<TestSpec> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ TestSpec(int i, Boolean bool, p7e p7eVar) {
            if ((i & 1) == 0) {
                this.isHotLoadSafe = null;
            } else {
                this.isHotLoadSafe = bool;
            }
        }

        public static /* synthetic */ TestSpec copy$default(TestSpec testSpec, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = testSpec.isHotLoadSafe;
            }
            return testSpec.copy(bool);
        }

        public static final /* synthetic */ void write$Self$app_playProdRelease(TestSpec self, vl2 output, SerialDescriptor serialDesc) {
            if (!output.m(serialDesc) && self.isHotLoadSafe == null) {
                return;
            }
            output.k(serialDesc, 0, ni1.a, self.isHotLoadSafe);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsHotLoadSafe() {
            return this.isHotLoadSafe;
        }

        public final TestSpec copy(Boolean isHotLoadSafe) {
            return new TestSpec(isHotLoadSafe);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TestSpec) && wl7.b(this.isHotLoadSafe, ((TestSpec) other).isHotLoadSafe);
        }

        public int hashCode() {
            Boolean bool = this.isHotLoadSafe;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final Boolean isHotLoadSafe() {
            return this.isHotLoadSafe;
        }

        public String toString() {
            return "TestSpec(isHotLoadSafe=" + this.isHotLoadSafe + ")";
        }

        public TestSpec() {
            this((Boolean) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public TestSpec(Boolean bool) {
            this.isHotLoadSafe = bool;
        }

        public /* synthetic */ TestSpec(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool);
        }
    }

    public ProctorTests(Map<String, TestSpec> map) {
        map.getClass();
        this.tests = map;
    }
}
