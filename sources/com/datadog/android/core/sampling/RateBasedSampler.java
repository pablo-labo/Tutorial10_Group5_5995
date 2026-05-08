package com.datadog.android.core.sampling;

import com.datadog.android.api.InternalLogger;
import defpackage.boa;
import defpackage.gu5;
import defpackage.mj8;
import java.security.SecureRandom;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001a*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u001aB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\nB\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/core/sampling/RateBasedSampler;", "", "T", "Lcom/datadog/android/core/sampling/Sampler;", "Lkotlin/Function0;", "", "sampleRateProvider", "<init>", "(Lgu5;)V", "sampleRate", "(F)V", "", "(D)V", "item", "", "sample", "(Ljava/lang/Object;)Z", "getSampleRate", "()Ljava/lang/Float;", "Lgu5;", "Ljava/security/SecureRandom;", "random$delegate", "Lkotlin/Lazy;", "getRandom", "()Ljava/security/SecureRandom;", "random", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class RateBasedSampler<T> implements Sampler<T> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final float SAMPLE_ALL_RATE = 100.0f;

    /* JADX INFO: renamed from: random$delegate, reason: from kotlin metadata */
    private final Lazy random;
    private final gu5<Float> sampleRateProvider;

    /* JADX INFO: renamed from: com.datadog.android.core.sampling.RateBasedSampler$1, reason: invalid class name */
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

    /* JADX INFO: renamed from: com.datadog.android.core.sampling.RateBasedSampler$getSampleRate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05581 extends mj8 implements gu5<String> {
        final /* synthetic */ float $rawSampleRate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05581(float f) {
            super(0);
            this.$rawSampleRate = f;
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Sample rate value provided " + this.$rawSampleRate + " is below 0, setting it to 0.";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.sampling.RateBasedSampler$getSampleRate$2, reason: invalid class name */
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

    public RateBasedSampler(gu5<Float> gu5Var) {
        gu5Var.getClass();
        this.sampleRateProvider = gu5Var;
        this.random = boa.D(RateBasedSampler$random$2.INSTANCE);
    }

    private final SecureRandom getRandom() {
        return (SecureRandom) this.random.getValue();
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
        InternalLogger.DefaultImpls.log$default(InternalLogger.INSTANCE.getUNBOUND(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new C05581(fFloatValue), (Throwable) null, false, (Map) null, 56, (Object) null);
        fFloatValue = f;
        return Float.valueOf(fFloatValue);
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public boolean sample(T item) {
        item.getClass();
        float fFloatValue = getSampleRate().floatValue();
        if (fFloatValue == 0.0f) {
            return false;
        }
        return fFloatValue == 100.0f || getRandom().nextFloat() * 100.0f <= fFloatValue;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/core/sampling/RateBasedSampler$Companion;", "", "()V", "SAMPLE_ALL_RATE", "", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RateBasedSampler(float f) {
        this(new AnonymousClass1(f));
    }

    public RateBasedSampler(double d) {
        this((float) d);
    }
}
