package com.datadog.android.rum;

import com.datadog.android.event.EventMapper;
import com.datadog.android.rum.configuration.VitalsUpdateFrequency;
import com.datadog.android.rum.event.ViewEventMapper;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.instrumentation.MainLooperLongTaskStrategy;
import com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ResourceEvent;
import com.datadog.android.rum.tracking.InteractionPredicate;
import com.datadog.android.rum.tracking.ViewAttributesProvider;
import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import defpackage.ut0;
import defpackage.wl7;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\fJ\u000e\u0010\r\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u000eJ\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/datadog/android/rum/RumConfiguration;", "", "applicationId", "", "featureConfiguration", "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/RumFeature$Configuration;)V", "getApplicationId$dd_sdk_android_rum_release", "()Ljava/lang/String;", "getFeatureConfiguration$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "component1", "component1$dd_sdk_android_rum_release", "component2", "component2$dd_sdk_android_rum_release", "copy", "equals", "", "other", "hashCode", "", "toString", "Builder", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class RumConfiguration {
    private final String applicationId;
    private final RumFeature.Configuration featureConfiguration;

    public RumConfiguration(String str, RumFeature.Configuration configuration) {
        str.getClass();
        configuration.getClass();
        this.applicationId = str;
        this.featureConfiguration = configuration;
    }

    public static /* synthetic */ RumConfiguration copy$default(RumConfiguration rumConfiguration, String str, RumFeature.Configuration configuration, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rumConfiguration.applicationId;
        }
        if ((i & 2) != 0) {
            configuration = rumConfiguration.featureConfiguration;
        }
        return rumConfiguration.copy(str, configuration);
    }

    /* JADX INFO: renamed from: component1$dd_sdk_android_rum_release, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: component2$dd_sdk_android_rum_release, reason: from getter */
    public final RumFeature.Configuration getFeatureConfiguration() {
        return this.featureConfiguration;
    }

    public final RumConfiguration copy(String applicationId, RumFeature.Configuration featureConfiguration) {
        applicationId.getClass();
        featureConfiguration.getClass();
        return new RumConfiguration(applicationId, featureConfiguration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RumConfiguration)) {
            return false;
        }
        RumConfiguration rumConfiguration = (RumConfiguration) other;
        return wl7.b(this.applicationId, rumConfiguration.applicationId) && wl7.b(this.featureConfiguration, rumConfiguration.featureConfiguration);
    }

    public final String getApplicationId$dd_sdk_android_rum_release() {
        return this.applicationId;
    }

    public final RumFeature.Configuration getFeatureConfiguration$dd_sdk_android_rum_release() {
        return this.featureConfiguration;
    }

    public int hashCode() {
        return this.featureConfiguration.hashCode() + (this.applicationId.hashCode() * 31);
    }

    public String toString() {
        return "RumConfiguration(applicationId=" + this.applicationId + ", featureConfiguration=" + this.featureConfiguration + ")";
    }

    @Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0000J\u0014\u0010\n\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ!\u0010\u000e\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0010H\u0000¢\u0006\u0002\b\u0011J\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00130\fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001b0\fJ\u0014\u0010\u001c\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u001d0\fJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020#J\u001b\u0010$\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020%0\fH\u0000¢\u0006\u0002\b&J\u0010\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020#J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020)J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/J\u0012\u00101\u001a\u00020\u00002\b\b\u0002\u00102\u001a\u000203H\u0007J\u000e\u00104\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/J'\u00105\u001a\u00020\u00002\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u000208072\b\b\u0002\u00109\u001a\u00020:H\u0007¢\u0006\u0002\u0010;J\u000e\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020\u0003J\u0010\u0010>\u001a\u00020\u00002\b\u0010?\u001a\u0004\u0018\u00010@R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/datadog/android/rum/RumConfiguration$Builder;", "", "applicationId", "", "(Ljava/lang/String;)V", "rumConfig", "Lcom/datadog/android/rum/internal/RumFeature$Configuration;", "build", "Lcom/datadog/android/rum/RumConfiguration;", "disableUserInteractionTracking", "setActionEventMapper", "eventMapper", "Lcom/datadog/android/event/EventMapper;", "Lcom/datadog/android/rum/model/ActionEvent;", "setAdditionalConfiguration", "additionalConfig", "", "setAdditionalConfiguration$dd_sdk_android_rum_release", "setErrorEventMapper", "Lcom/datadog/android/rum/model/ErrorEvent;", "setInitialResourceIdentifier", "initialResourceIdentifier", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "setLastInteractionIdentifier", "lastInteractionIdentifier", "Lcom/datadog/android/rum/metric/interactiontonextview/LastInteractionIdentifier;", "setLongTaskEventMapper", "Lcom/datadog/android/rum/model/LongTaskEvent;", "setResourceEventMapper", "Lcom/datadog/android/rum/model/ResourceEvent;", "setSessionListener", "sessionListener", "Lcom/datadog/android/rum/RumSessionListener;", "setSessionSampleRate", "sampleRate", "", "setTelemetryConfigurationEventMapper", "Lcom/datadog/android/telemetry/model/TelemetryConfigurationEvent;", "setTelemetryConfigurationEventMapper$dd_sdk_android_rum_release", "setTelemetrySampleRate", "setViewEventMapper", "Lcom/datadog/android/rum/event/ViewEventMapper;", "setVitalsUpdateFrequency", "frequency", "Lcom/datadog/android/rum/configuration/VitalsUpdateFrequency;", "trackBackgroundEvents", "enabled", "", "trackFrustrations", "trackLongTasks", "longTaskThresholdMs", "", "trackNonFatalAnrs", "trackUserInteractions", "touchTargetExtraAttributesProviders", "", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "interactionPredicate", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "([Lcom/datadog/android/rum/tracking/ViewAttributesProvider;Lcom/datadog/android/rum/tracking/InteractionPredicate;)Lcom/datadog/android/rum/RumConfiguration$Builder;", "useCustomEndpoint", "endpoint", "useViewTrackingStrategy", "strategy", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Builder {
        private final String applicationId;
        private RumFeature.Configuration rumConfig;

        public Builder(String str) {
            str.getClass();
            this.applicationId = str;
            this.rumConfig = RumFeature.INSTANCE.getDEFAULT_RUM_CONFIG$dd_sdk_android_rum_release();
        }

        public static /* synthetic */ Builder trackLongTasks$default(Builder builder, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 100;
            }
            return builder.trackLongTasks(j);
        }

        public static /* synthetic */ Builder trackUserInteractions$default(Builder builder, ViewAttributesProvider[] viewAttributesProviderArr, InteractionPredicate interactionPredicate, int i, Object obj) {
            if ((i & 1) != 0) {
                viewAttributesProviderArr = new ViewAttributesProvider[0];
            }
            if ((i & 2) != 0) {
                interactionPredicate = new NoOpInteractionPredicate();
            }
            return builder.trackUserInteractions(viewAttributesProviderArr, interactionPredicate);
        }

        public final RumConfiguration build() {
            Object obj = this.rumConfig.getAdditionalConfig().get(RumFeature.DD_TELEMETRY_CONFIG_SAMPLE_RATE_TAG);
            Float fValueOf = null;
            if (obj != null && (obj instanceof Number)) {
                fValueOf = Float.valueOf(((Number) obj).floatValue());
            }
            String str = this.applicationId;
            RumFeature.Configuration configurationCopy$default = this.rumConfig;
            if (fValueOf != null) {
                configurationCopy$default = RumFeature.Configuration.copy$default(configurationCopy$default, null, 0.0f, 0.0f, fValueOf.floatValue(), false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 8388599, null);
            }
            return new RumConfiguration(str, configurationCopy$default);
        }

        public final Builder disableUserInteractionTracking() {
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 8388591, null);
            return this;
        }

        public final Builder setActionEventMapper(EventMapper<ActionEvent> eventMapper) {
            eventMapper.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, eventMapper, null, null, false, false, false, null, null, null, null, null, 8384511, null);
            return this;
        }

        public final Builder setAdditionalConfiguration$dd_sdk_android_rum_release(Map<String, ? extends Object> additionalConfig) {
            additionalConfig.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, additionalConfig, 4194303, null);
            return this;
        }

        public final Builder setErrorEventMapper(EventMapper<ErrorEvent> eventMapper) {
            eventMapper.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, eventMapper, null, null, null, null, false, false, false, null, null, null, null, null, 8387583, null);
            return this;
        }

        public final Builder setInitialResourceIdentifier(InitialResourceIdentifier initialResourceIdentifier) {
            initialResourceIdentifier.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, initialResourceIdentifier, null, null, 7340031, null);
            return this;
        }

        public final Builder setLastInteractionIdentifier(LastInteractionIdentifier lastInteractionIdentifier) {
            lastInteractionIdentifier.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, lastInteractionIdentifier, null, 6291455, null);
            return this;
        }

        public final Builder setLongTaskEventMapper(EventMapper<LongTaskEvent> eventMapper) {
            eventMapper.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, eventMapper, null, false, false, false, null, null, null, null, null, 8380415, null);
            return this;
        }

        public final Builder setResourceEventMapper(EventMapper<ResourceEvent> eventMapper) {
            eventMapper.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, eventMapper, null, null, null, false, false, false, null, null, null, null, null, 8386559, null);
            return this;
        }

        public final Builder setSessionListener(RumSessionListener sessionListener) {
            sessionListener.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, sessionListener, null, null, null, 7864319, null);
            return this;
        }

        public final Builder setSessionSampleRate(float sampleRate) {
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, sampleRate, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 8388605, null);
            return this;
        }

        public final Builder setTelemetryConfigurationEventMapper$dd_sdk_android_rum_release(EventMapper<TelemetryConfigurationEvent> eventMapper) {
            eventMapper.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, eventMapper, false, false, false, null, null, null, null, null, 8372223, null);
            return this;
        }

        public final Builder setTelemetrySampleRate(float sampleRate) {
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, sampleRate, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 8388603, null);
            return this;
        }

        public final Builder setViewEventMapper(ViewEventMapper eventMapper) {
            eventMapper.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, eventMapper, null, null, null, null, null, false, false, false, null, null, null, null, null, 8388095, null);
            return this;
        }

        public final Builder setVitalsUpdateFrequency(VitalsUpdateFrequency frequency) {
            frequency.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, false, frequency, null, null, null, null, 8126463, null);
            return this;
        }

        public final Builder trackBackgroundEvents(boolean enabled) {
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, enabled, false, false, null, null, null, null, null, 8355839, null);
            return this;
        }

        public final Builder trackFrustrations(boolean enabled) {
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, enabled, false, null, null, null, null, null, 8323071, null);
            return this;
        }

        public final Builder trackLongTasks(long longTaskThresholdMs) {
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, longTaskThresholdMs > 0 ? new MainLooperLongTaskStrategy(longTaskThresholdMs) : null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 8388351, null);
            return this;
        }

        public final Builder trackNonFatalAnrs(boolean enabled) {
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, enabled, null, null, null, null, null, 8257535, null);
            return this;
        }

        public final Builder trackUserInteractions(ViewAttributesProvider[] touchTargetExtraAttributesProviders, InteractionPredicate interactionPredicate) {
            touchTargetExtraAttributesProviders.getClass();
            interactionPredicate.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, ut0.E0(touchTargetExtraAttributesProviders), interactionPredicate, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 8388511, null);
            return this;
        }

        public final Builder useCustomEndpoint(String endpoint) {
            endpoint.getClass();
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, endpoint, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 8388606, null);
            return this;
        }

        public final Builder useViewTrackingStrategy(ViewTrackingStrategy strategy) {
            this.rumConfig = RumFeature.Configuration.copy$default(this.rumConfig, null, 0.0f, 0.0f, 0.0f, false, null, null, strategy, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, 8388479, null);
            return this;
        }

        public final Builder trackUserInteractions(ViewAttributesProvider[] viewAttributesProviderArr) {
            viewAttributesProviderArr.getClass();
            return trackUserInteractions$default(this, viewAttributesProviderArr, null, 2, null);
        }

        public final Builder trackUserInteractions() {
            return trackUserInteractions$default(this, null, null, 3, null);
        }

        public final Builder trackLongTasks() {
            return trackLongTasks$default(this, 0L, 1, null);
        }
    }
}
