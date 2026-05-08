package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.DatatypeFeature;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;

/* JADX INFO: loaded from: classes2.dex */
public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    protected static final PrettyPrinter DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();
    private static final int SER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(SerializationFeature.class);
    private static final long serialVersionUID = 1;
    protected final PrettyPrinter _defaultPrettyPrinter;
    protected final FilterProvider _filterProvider;
    protected final int _formatWriteFeatures;
    protected final int _formatWriteFeaturesToChange;
    protected final int _generatorFeatures;
    protected final int _generatorFeaturesToChange;
    protected final int _serFeatures;

    public SerializationConfig(SerializationConfig serializationConfig, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(serializationConfig, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _with(DatatypeFeatures datatypeFeatures) {
        return new SerializationConfig(this, datatypeFeatures);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new SerializationConfig(this, baseSettings);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final SerializationConfig _withMapperFeatures(long j) {
        return new SerializationConfig(this, j, this._serFeatures, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public PrettyPrinter constructDefaultPrettyPrinter() {
        PrettyPrinter prettyPrinter = this._defaultPrettyPrinter;
        return prettyPrinter instanceof Instantiatable ? (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance() : prettyPrinter;
    }

    public PrettyPrinter getDefaultPrettyPrinter() {
        return this._defaultPrettyPrinter;
    }

    public FilterProvider getFilterProvider() {
        return null;
    }

    public void initialize(JsonGenerator jsonGenerator) {
        PrettyPrinter prettyPrinterConstructDefaultPrettyPrinter;
        if (SerializationFeature.INDENT_OUTPUT.enabledIn(this._serFeatures) && jsonGenerator.getPrettyPrinter() == null && (prettyPrinterConstructDefaultPrettyPrinter = constructDefaultPrettyPrinter()) != null) {
            jsonGenerator.setPrettyPrinter(prettyPrinterConstructDefaultPrettyPrinter);
        }
        boolean zEnabledIn = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._serFeatures);
        int i = this._generatorFeaturesToChange;
        if (i != 0 || zEnabledIn) {
            int i2 = this._generatorFeatures;
            if (zEnabledIn) {
                int mask = JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
                i2 |= mask;
                i |= mask;
            }
            jsonGenerator.overrideStdFeatures(i2, i);
        }
        int i3 = this._formatWriteFeaturesToChange;
        if (i3 != 0) {
            jsonGenerator.overrideFormatFeatures(this._formatWriteFeatures, i3);
        }
    }

    public BeanDescription introspect(JavaType javaType) {
        return getClassIntrospector().forSerialization(this, javaType, this);
    }

    public final boolean isEnabled(JsonGenerator.Feature feature, JsonFactory jsonFactory) {
        return (feature.getMask() & this._generatorFeaturesToChange) != 0 ? (this._generatorFeatures & feature.getMask()) != 0 : jsonFactory.isEnabled(feature);
    }

    public SerializationConfig with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int mask = serializationFeature.getMask() | this._serFeatures;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            mask |= serializationFeature2.getMask();
        }
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig withDefaultPrettyPrinter(PrettyPrinter prettyPrinter) {
        return this._defaultPrettyPrinter == prettyPrinter ? this : new SerializationConfig(this, prettyPrinter);
    }

    public SerializationConfig withFilters(FilterProvider filterProvider) {
        return this;
    }

    public SerializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new SerializationConfig(this, cls);
    }

    public SerializationConfig without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        int i = (~serializationFeature.getMask()) & this._serFeatures;
        for (SerializationFeature serializationFeature2 : serializationFeatureArr) {
            i &= ~serializationFeature2.getMask();
        }
        return i == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public final boolean isEnabled(SerializationFeature serializationFeature) {
        return (this._serFeatures & serializationFeature.getMask()) != 0;
    }

    public SerializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, DatatypeFeatures datatypeFeatures) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, datatypeFeatures);
        this._serFeatures = SER_FEATURE_DEFAULTS;
        this._defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
        this._generatorFeatures = 0;
        this._generatorFeaturesToChange = 0;
        this._formatWriteFeatures = 0;
        this._formatWriteFeaturesToChange = 0;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final boolean isEnabled(DatatypeFeature datatypeFeature) {
        return this._datatypeFeatures.isEnabled(datatypeFeature);
    }

    private SerializationConfig(SerializationConfig serializationConfig, SubtypeResolver subtypeResolver) {
        super(serializationConfig, subtypeResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    private SerializationConfig(SerializationConfig serializationConfig, long j, int i, int i2, int i3, int i4, int i5) {
        super(serializationConfig, j);
        this._serFeatures = i;
        serializationConfig.getClass();
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = i2;
        this._generatorFeaturesToChange = i3;
        this._formatWriteFeatures = i4;
        this._formatWriteFeaturesToChange = i5;
    }

    public SerializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new SerializationConfig(this, contextAttributes);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public SerializationConfig with(DateFormat dateFormat) {
        SerializationConfig serializationConfig = (SerializationConfig) super.with(dateFormat);
        if (dateFormat == null) {
            return serializationConfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        return serializationConfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public SerializationConfig without(SerializationFeature serializationFeature) {
        int i = this._serFeatures & (~serializationFeature.getMask());
        return i == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, i, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    public SerializationConfig with(SerializationFeature serializationFeature) {
        int mask = this._serFeatures | serializationFeature.getMask();
        return mask == this._serFeatures ? this : new SerializationConfig(this, this._mapperFeatures, mask, this._generatorFeatures, this._generatorFeaturesToChange, this._formatWriteFeatures, this._formatWriteFeaturesToChange);
    }

    private SerializationConfig(SerializationConfig serializationConfig, BaseSettings baseSettings) {
        super(serializationConfig, baseSettings);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig with(SubtypeResolver subtypeResolver) {
        return subtypeResolver == this._subtypeResolver ? this : new SerializationConfig(this, subtypeResolver);
    }

    private SerializationConfig(SerializationConfig serializationConfig, Class<?> cls) {
        super(serializationConfig, cls);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, ContextAttributes contextAttributes) {
        super(serializationConfig, contextAttributes);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(serializationConfig, simpleMixInResolver);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, PrettyPrinter prettyPrinter) {
        super(serializationConfig);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = prettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }

    public SerializationConfig(SerializationConfig serializationConfig, DatatypeFeatures datatypeFeatures) {
        super(serializationConfig, datatypeFeatures);
        this._serFeatures = serializationConfig._serFeatures;
        this._defaultPrettyPrinter = serializationConfig._defaultPrettyPrinter;
        this._generatorFeatures = serializationConfig._generatorFeatures;
        this._generatorFeaturesToChange = serializationConfig._generatorFeaturesToChange;
        this._formatWriteFeatures = serializationConfig._formatWriteFeatures;
        this._formatWriteFeaturesToChange = serializationConfig._formatWriteFeaturesToChange;
    }
}
