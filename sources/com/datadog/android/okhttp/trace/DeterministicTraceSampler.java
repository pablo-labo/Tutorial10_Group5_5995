package com.datadog.android.okhttp.trace;

import com.datadog.android.core.sampling.DeterministicSampler;
import defpackage.doe;
import defpackage.gu5;
import defpackage.l4g;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tB\u0013\b\u0016\u0012\b\b\u0001\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/datadog/android/okhttp/trace/DeterministicTraceSampler;", "Lcom/datadog/android/core/sampling/DeterministicSampler;", "Ldoe;", "Lkotlin/Function0;", "", "sampleRateProvider", "<init>", "(Lgu5;)V", "sampleRate", "(F)V", "", "(D)V", "dd-sdk-android-okhttp_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class DeterministicTraceSampler extends DeterministicSampler<doe> {

    /* JADX INFO: renamed from: com.datadog.android.okhttp.trace.DeterministicTraceSampler$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldoe;", "it", "Ll4g;", "invoke-I7RO_PI", "(Ldoe;)J", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements Function1<doe, l4g> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ l4g invoke(doe doeVar) {
            return new l4g(m19invokeI7RO_PI(doeVar));
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[EDGE_INSN: B:18:0x004a->B:19:0x004b BREAK  A[LOOP:0: B:9:0x0026->B:13:0x0033]] */
        /* JADX INFO: renamed from: invoke-I7RO_PI, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long m19invokeI7RO_PI(defpackage.doe r6) {
            /*
                r5 = this;
                r6.getClass()
                eoe r5 = r6.f()
                java.lang.String r5 = r5.a()
                r5.getClass()
                r6 = 10
                defpackage.ypd.s(r6)
                int r0 = r5.length()
                if (r0 == 0) goto L4a
                r1 = 0
                r2 = 1
                if (r0 == r2) goto L36
                char r3 = r5.charAt(r1)
                r4 = 45
                if (r3 != r4) goto L26
                r1 = r2
            L26:
                if (r1 >= r0) goto L41
                char r2 = r5.charAt(r1)
                int r2 = java.lang.Character.digit(r2, r6)
                if (r2 >= 0) goto L33
                goto L4a
            L33:
                int r1 = r1 + 1
                goto L26
            L36:
                char r0 = r5.charAt(r1)
                int r0 = java.lang.Character.digit(r0, r6)
                if (r0 >= 0) goto L41
                goto L4a
            L41:
                java.math.BigInteger r0 = new java.math.BigInteger
                defpackage.ypd.s(r6)
                r0.<init>(r5, r6)
                goto L4b
            L4a:
                r0 = 0
            L4b:
                if (r0 == 0) goto L52
                long r5 = r0.longValue()
                return r5
            L52:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.okhttp.trace.DeterministicTraceSampler.AnonymousClass1.m19invokeI7RO_PI(doe):long");
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.okhttp.trace.DeterministicTraceSampler$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<Float> {
        final /* synthetic */ float $sampleRate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f) {
            super(0);
            this.$sampleRate = f;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final Float invoke() {
            return Float.valueOf(this.$sampleRate);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeterministicTraceSampler(gu5<Float> gu5Var) {
        super(AnonymousClass1.INSTANCE, gu5Var);
        gu5Var.getClass();
    }

    public DeterministicTraceSampler(float f) {
        this(new AnonymousClass2(f));
    }

    public DeterministicTraceSampler(double d) {
        this((float) d);
    }
}
