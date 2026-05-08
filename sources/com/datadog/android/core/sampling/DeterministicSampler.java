package com.datadog.android.core.sampling;

import com.datadog.android.api.InternalLogger;
import defpackage.gu5;
import defpackage.l4g;
import defpackage.mj8;
import defpackage.zte;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u0000 \u0018*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0018B)\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rB'\b\u0016\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\f\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/datadog/android/core/sampling/DeterministicSampler;", "", "T", "Lcom/datadog/android/core/sampling/Sampler;", "Lkotlin/Function1;", "Ll4g;", "idConverter", "Lkotlin/Function0;", "", "sampleRateProvider", "<init>", "(Lkotlin/jvm/functions/Function1;Lgu5;)V", "sampleRate", "(Lkotlin/jvm/functions/Function1;F)V", "", "(Lkotlin/jvm/functions/Function1;D)V", "item", "", "sample", "(Ljava/lang/Object;)Z", "getSampleRate", "()Ljava/lang/Float;", "Lkotlin/jvm/functions/Function1;", "Lgu5;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class DeterministicSampler<T> implements Sampler<T> {
    private static final Companion Companion = new Companion(null);
    private static final long MAX_ID = -1;
    private static final long SAMPLER_HASHER = 1111111111111111111L;

    @Deprecated
    public static final float SAMPLE_ALL_RATE = 100.0f;
    private final Function1<T, l4g> idConverter;
    private final gu5<Float> sampleRateProvider;

    /* JADX INFO: renamed from: com.datadog.android.core.sampling.DeterministicSampler$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<Float> {
        final /* synthetic */ float $sampleRate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(0);
            this.$sampleRate = f;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final Float invoke() {
            return Float.valueOf(this.$sampleRate);
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.sampling.DeterministicSampler$getSampleRate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05571 extends mj8 implements gu5<String> {
        final /* synthetic */ float $rawSampleRate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05571(float f) {
            super(0);
            this.$rawSampleRate = f;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Sample rate value provided " + this.$rawSampleRate + " is below 0, setting it to 0.";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.sampling.DeterministicSampler$getSampleRate$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        final /* synthetic */ float $rawSampleRate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(float f) {
            super(0);
            this.$rawSampleRate = f;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Sample rate value provided " + this.$rawSampleRate + " is above 100, setting it to 100.";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeterministicSampler(Function1<? super T, l4g> function1, gu5<Float> gu5Var) {
        function1.getClass();
        gu5Var.getClass();
        this.idConverter = function1;
        this.sampleRateProvider = gu5Var;
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public Float getSampleRate() {
        float fFloatValue = this.sampleRateProvider.invoke().floatValue();
        float f = 0.0f;
        if (fFloatValue >= 0.0f) {
            f = 100.0f;
            if (fFloatValue > 100.0f) {
                InternalLogger.DefaultImpls.log$default(InternalLogger.INSTANCE.getUNBOUND(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new AnonymousClass2(fFloatValue), (Throwable) null, false, (Map) null, 56, (Object) null);
            }
            return Float.valueOf(fFloatValue);
        }
        InternalLogger.DefaultImpls.log$default(InternalLogger.INSTANCE.getUNBOUND(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new C05571(fFloatValue), (Throwable) null, false, (Map) null, 56, (Object) null);
        fFloatValue = f;
        return Float.valueOf(fFloatValue);
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public boolean sample(T item) {
        long j = MAX_ID;
        double dG = zte.g(MAX_ID);
        item.getClass();
        float fFloatValue = getSampleRate().floatValue();
        if (fFloatValue >= 100.0f) {
            return true;
        }
        if (fFloatValue <= 0.0f) {
            return false;
        }
        long j2 = this.idConverter.invoke(item).a * SAMPLER_HASHER;
        double d = (((double) fFloatValue) * dG) / 100.0d;
        if (Double.isNaN(d) || d <= zte.g(0L)) {
            j = 0;
        } else if (d < dG) {
            j = d < 9.223372036854776E18d ? (long) d : ((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE;
        }
        return Long.compareUnsigned(j2, j) < 0;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0002X\u0082Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048\u0002X\u0082Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Lcom/datadog/android/core/sampling/DeterministicSampler$Companion;", "", "<init>", "()V", "Ll4g;", "MAX_ID", "J", "SAMPLER_HASHER", "", "SAMPLE_ALL_RATE", "F", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeterministicSampler(Function1<? super T, l4g> function1, float f) {
        this(function1, new AnonymousClass1(f));
        function1.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DeterministicSampler(Function1<? super T, l4g> function1, double d) {
        this((Function1) function1, (float) d);
        function1.getClass();
    }
}
