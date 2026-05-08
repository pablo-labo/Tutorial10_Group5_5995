package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.DatatypeFeature;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> implements Serializable {
    private static final int DESER_FEATURE_DEFAULTS = MapperConfig.collectFeatureDefaults(DeserializationFeature.class);
    private static final long serialVersionUID = 2;
    protected final CoercionConfigs _coercionConfigs;
    protected final ConstructorDetector _ctorDetector;
    protected final int _deserFeatures;
    protected final int _formatReadFeatures;
    protected final int _formatReadFeaturesToChange;
    protected final JsonNodeFactory _nodeFactory;
    protected final int _parserFeatures;
    protected final int _parserFeaturesToChange;
    protected final LinkedNode<DeserializationProblemHandler> _problemHandlers;

    private DeserializationConfig(DeserializationConfig deserializationConfig, SubtypeResolver subtypeResolver) {
        super(deserializationConfig, subtypeResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _with(DatatypeFeatures datatypeFeatures) {
        return new DeserializationConfig(this, datatypeFeatures);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withBase(BaseSettings baseSettings) {
        return this._base == baseSettings ? this : new DeserializationConfig(this, baseSettings);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfigBase
    public final DeserializationConfig _withMapperFeatures(long j) {
        return new DeserializationConfig(this, j, this._deserFeatures, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public CoercionAction findCoercionAction(LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        return this._coercionConfigs.findCoercion(this, logicalType, cls, coercionInputShape);
    }

    public CoercionAction findCoercionFromBlankString(LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        return this._coercionConfigs.findCoercionFromBlankString(this, logicalType, cls, coercionAction);
    }

    public TypeDeserializer findTypeDeserializer(JavaType javaType) {
        Collection<NamedType> collectionCollectAndResolveSubtypesByTypeId;
        AnnotatedClass classInfo = introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> typeResolverBuilderFindTypeResolver = getAnnotationIntrospector().findTypeResolver(this, classInfo, javaType);
        if (typeResolverBuilderFindTypeResolver == null) {
            typeResolverBuilderFindTypeResolver = getDefaultTyper(javaType);
            collectionCollectAndResolveSubtypesByTypeId = null;
            if (typeResolverBuilderFindTypeResolver == null) {
                return null;
            }
        } else {
            collectionCollectAndResolveSubtypesByTypeId = getSubtypeResolver().collectAndResolveSubtypesByTypeId(this, classInfo);
        }
        return typeResolverBuilderFindTypeResolver.buildTypeDeserializer(this, javaType, collectionCollectAndResolveSubtypesByTypeId);
    }

    public BaseSettings getBaseSettings() {
        return this._base;
    }

    public ConstructorDetector getConstructorDetector() {
        ConstructorDetector constructorDetector = this._ctorDetector;
        return constructorDetector == null ? ConstructorDetector.DEFAULT : constructorDetector;
    }

    public final int getDeserializationFeatures() {
        return this._deserFeatures;
    }

    public final JsonNodeFactory getNodeFactory() {
        return this._nodeFactory;
    }

    public LinkedNode<DeserializationProblemHandler> getProblemHandlers() {
        return this._problemHandlers;
    }

    public JsonParser initialize(JsonParser jsonParser, FormatSchema formatSchema) {
        int i = this._parserFeaturesToChange;
        if (i != 0) {
            jsonParser.overrideStdFeatures(this._parserFeatures, i);
        }
        int i2 = this._formatReadFeaturesToChange;
        if (i2 != 0) {
            jsonParser.overrideFormatFeatures(this._formatReadFeatures, i2);
        }
        if (formatSchema != null) {
            jsonParser.setSchema(formatSchema);
        }
        return jsonParser;
    }

    public BeanDescription introspect(JavaType javaType) {
        return getClassIntrospector().forDeserialization(this, javaType, this);
    }

    public BeanDescription introspectForBuilder(JavaType javaType, BeanDescription beanDescription) {
        return getClassIntrospector().forDeserializationWithBuilder(this, javaType, this, beanDescription);
    }

    public BeanDescription introspectForCreation(JavaType javaType) {
        return getClassIntrospector().forCreation(this, javaType, this);
    }

    public final boolean isEnabled(JsonParser.Feature feature, JsonFactory jsonFactory) {
        return (feature.getMask() & this._parserFeaturesToChange) != 0 ? (this._parserFeatures & feature.getMask()) != 0 : jsonFactory.isEnabled(feature);
    }

    public boolean useRootWrapping() {
        return this._rootName != null ? !r0.isEmpty() : isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int mask = deserializationFeature.getMask() | this._deserFeatures;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            mask |= deserializationFeature2.getMask();
        }
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig withHandler(DeserializationProblemHandler deserializationProblemHandler) {
        return LinkedNode.contains(this._problemHandlers, deserializationProblemHandler) ? this : new DeserializationConfig(this, (LinkedNode<DeserializationProblemHandler>) new LinkedNode(deserializationProblemHandler, this._problemHandlers));
    }

    public DeserializationConfig withNoProblemHandlers() {
        return this._problemHandlers == null ? this : new DeserializationConfig(this, (LinkedNode<DeserializationProblemHandler>) null);
    }

    public DeserializationConfig withView(Class<?> cls) {
        return this._view == cls ? this : new DeserializationConfig(this, cls);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        int i = (~deserializationFeature.getMask()) & this._deserFeatures;
        for (DeserializationFeature deserializationFeature2 : deserializationFeatureArr) {
            i &= ~deserializationFeature2.getMask();
        }
        return i == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public JsonParser initialize(JsonParser jsonParser) {
        int i = this._parserFeaturesToChange;
        if (i != 0) {
            jsonParser.overrideStdFeatures(this._parserFeatures, i);
        }
        int i2 = this._formatReadFeaturesToChange;
        if (i2 != 0) {
            jsonParser.overrideFormatFeatures(this._formatReadFeatures, i2);
        }
        return jsonParser;
    }

    public final boolean isEnabled(DeserializationFeature deserializationFeature) {
        return (this._deserFeatures & deserializationFeature.getMask()) != 0;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final boolean isEnabled(DatatypeFeature datatypeFeature) {
        return this._datatypeFeatures.isEnabled(datatypeFeature);
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs) {
        super(deserializationConfig, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._coercionConfigs = coercionConfigs;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig with(ContextAttributes contextAttributes) {
        return contextAttributes == this._attributes ? this : new DeserializationConfig(this, contextAttributes);
    }

    public DeserializationConfig with(DeserializationFeature deserializationFeature) {
        int mask = this._deserFeatures | deserializationFeature.getMask();
        return mask == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, mask, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig without(DeserializationFeature deserializationFeature) {
        int i = this._deserFeatures & (~deserializationFeature.getMask());
        return i == this._deserFeatures ? this : new DeserializationConfig(this, this._mapperFeatures, i, this._parserFeatures, this._parserFeaturesToChange, this._formatReadFeatures, this._formatReadFeaturesToChange);
    }

    public DeserializationConfig with(SubtypeResolver subtypeResolver) {
        return this._subtypeResolver == subtypeResolver ? this : new DeserializationConfig(this, subtypeResolver);
    }

    public DeserializationConfig with(JsonNodeFactory jsonNodeFactory) {
        return this._nodeFactory == jsonNodeFactory ? this : new DeserializationConfig(this, jsonNodeFactory);
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, long j, int i, int i2, int i3, int i4, int i5) {
        super(deserializationConfig, j);
        this._deserFeatures = i;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = i2;
        this._parserFeaturesToChange = i3;
        this._formatReadFeatures = i4;
        this._formatReadFeaturesToChange = i5;
    }

    public DeserializationConfig with(ConstructorDetector constructorDetector) {
        return this._ctorDetector == constructorDetector ? this : new DeserializationConfig(this, constructorDetector);
    }

    public DeserializationConfig(BaseSettings baseSettings, SubtypeResolver subtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs, DatatypeFeatures datatypeFeatures) {
        super(baseSettings, subtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, datatypeFeatures);
        this._deserFeatures = DESER_FEATURE_DEFAULTS;
        this._problemHandlers = null;
        this._nodeFactory = JsonNodeFactory.instance;
        this._ctorDetector = null;
        this._coercionConfigs = coercionConfigs;
        this._parserFeatures = 0;
        this._parserFeaturesToChange = 0;
        this._formatReadFeatures = 0;
        this._formatReadFeaturesToChange = 0;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, BaseSettings baseSettings) {
        super(deserializationConfig, baseSettings);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, JsonNodeFactory jsonNodeFactory) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = jsonNodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, ConstructorDetector constructorDetector) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = constructorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, LinkedNode<DeserializationProblemHandler> linkedNode) {
        super(deserializationConfig);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = linkedNode;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    private DeserializationConfig(DeserializationConfig deserializationConfig, Class<?> cls) {
        super(deserializationConfig, cls);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, ContextAttributes contextAttributes) {
        super(deserializationConfig, contextAttributes);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, SimpleMixInResolver simpleMixInResolver) {
        super(deserializationConfig, simpleMixInResolver);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, DatatypeFeatures datatypeFeatures) {
        super(deserializationConfig, datatypeFeatures);
        this._deserFeatures = deserializationConfig._deserFeatures;
        this._problemHandlers = deserializationConfig._problemHandlers;
        this._nodeFactory = deserializationConfig._nodeFactory;
        this._coercionConfigs = deserializationConfig._coercionConfigs;
        this._ctorDetector = deserializationConfig._ctorDetector;
        this._parserFeatures = deserializationConfig._parserFeatures;
        this._parserFeaturesToChange = deserializationConfig._parserFeaturesToChange;
        this._formatReadFeatures = deserializationConfig._formatReadFeatures;
        this._formatReadFeaturesToChange = deserializationConfig._formatReadFeaturesToChange;
    }
}
