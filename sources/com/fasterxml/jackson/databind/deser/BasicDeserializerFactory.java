package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.EnumNamingStrategy;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.EnumNamingStrategyFactory;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import defpackage.ja;
import defpackage.l5;
import defpackage.o6;
import defpackage.q6;
import defpackage.r6;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    protected final DeserializerFactoryConfig _factoryConfig;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_STRING = String.class;
    private static final Class<?> CLASS_CHAR_SEQUENCE = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Map.Entry.class;
    private static final Class<?> CLASS_SERIALIZABLE = Serializable.class;
    protected static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor;

        static {
            int[] iArr = new int[ConstructorDetector.SingleArgConstructor.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor = iArr;
            try {
                iArr[ConstructorDetector.SingleArgConstructor.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[ConstructorDetector.SingleArgConstructor.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[ConstructorDetector.SingleArgConstructor.REQUIRE_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[ConstructorDetector.SingleArgConstructor.HEURISTIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[JsonCreator.Mode.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode = iArr2;
            try {
                iArr2[JsonCreator.Mode.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[JsonCreator.Mode.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[JsonCreator.Mode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class ContainerDefaultMappings {
        static final HashMap<String, Class<? extends Collection>> _collectionFallbacks;
        static final HashMap<String, Class<? extends Map>> _mapFallbacks;

        static {
            HashMap<String, Class<? extends Collection>> map = new HashMap<>();
            map.put(Collection.class.getName(), ArrayList.class);
            map.put(List.class.getName(), ArrayList.class);
            map.put(Set.class.getName(), HashSet.class);
            map.put(SortedSet.class.getName(), TreeSet.class);
            map.put(Queue.class.getName(), LinkedList.class);
            map.put(AbstractList.class.getName(), ArrayList.class);
            map.put(AbstractSet.class.getName(), HashSet.class);
            map.put(Deque.class.getName(), LinkedList.class);
            map.put(NavigableSet.class.getName(), TreeSet.class);
            map.put("java.util.SequencedCollection", ArrayList.class);
            map.put("java.util.SequencedSet", LinkedHashSet.class);
            _collectionFallbacks = map;
            HashMap<String, Class<? extends Map>> map2 = new HashMap<>();
            map2.put(Map.class.getName(), LinkedHashMap.class);
            map2.put(AbstractMap.class.getName(), LinkedHashMap.class);
            map2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            map2.put(SortedMap.class.getName(), TreeMap.class);
            map2.put(NavigableMap.class.getName(), TreeMap.class);
            map2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            map2.put("java.util.SequencedMap", LinkedHashMap.class);
            _mapFallbacks = map2;
        }

        public static Class<?> findCollectionFallback(JavaType javaType) {
            return _collectionFallbacks.get(javaType.getRawClass().getName());
        }

        public static Class<?> findMapFallback(JavaType javaType) {
            return _mapFallbacks.get(javaType.getRawClass().getName());
        }
    }

    public static class CreatorCollectionState {
        private int _explicitConstructorCount;
        private int _explicitFactoryCount;
        private List<CreatorCandidate> _implicitConstructorCandidates;
        private List<CreatorCandidate> _implicitFactoryCandidates;
        public final BeanDescription beanDesc;
        public final DeserializationContext context;
        public final Map<AnnotatedWithParams, BeanPropertyDefinition[]> creatorParams;
        public final CreatorCollector creators;
        public final VisibilityChecker<?> vchecker;

        public CreatorCollectionState(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, CreatorCollector creatorCollector, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) {
            this.context = deserializationContext;
            this.beanDesc = beanDescription;
            this.vchecker = visibilityChecker;
            this.creators = creatorCollector;
            this.creatorParams = map;
        }

        public void addImplicitConstructorCandidate(CreatorCandidate creatorCandidate) {
            if (this._implicitConstructorCandidates == null) {
                this._implicitConstructorCandidates = new LinkedList();
            }
            this._implicitConstructorCandidates.add(creatorCandidate);
        }

        public void addImplicitFactoryCandidate(CreatorCandidate creatorCandidate) {
            if (this._implicitFactoryCandidates == null) {
                this._implicitFactoryCandidates = new LinkedList();
            }
            this._implicitFactoryCandidates.add(creatorCandidate);
        }

        public AnnotationIntrospector annotationIntrospector() {
            return this.context.getAnnotationIntrospector();
        }

        public boolean hasExplicitConstructors() {
            return this._explicitConstructorCount > 0;
        }

        public boolean hasExplicitFactories() {
            return this._explicitFactoryCount > 0;
        }

        public boolean hasImplicitConstructorCandidates() {
            return this._implicitConstructorCandidates != null;
        }

        public boolean hasImplicitFactoryCandidates() {
            return this._implicitFactoryCandidates != null;
        }

        public List<CreatorCandidate> implicitConstructorCandidates() {
            return this._implicitConstructorCandidates;
        }

        public List<CreatorCandidate> implicitFactoryCandidates() {
            return this._implicitFactoryCandidates;
        }

        public void increaseExplicitConstructorCount() {
            this._explicitConstructorCount++;
        }

        public void increaseExplicitFactoryCount() {
            this._explicitFactoryCount++;
        }
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    private boolean _checkIfCreatorPropertyBased(BeanDescription beanDescription, AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition beanPropertyDefinition) {
        if (beanPropertyDefinition != null && beanPropertyDefinition.isExplicitlyNamed()) {
            return true;
        }
        if (beanDescription.findJsonValueAccessor() != null) {
            return false;
        }
        if (annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) != null) {
            return true;
        }
        if (beanPropertyDefinition != null) {
            String name = beanPropertyDefinition.getName();
            if (name != null && !name.isEmpty() && beanPropertyDefinition.couldSerialize()) {
                return true;
            }
            if (!beanPropertyDefinition.isExplicitlyNamed() && beanDescription.isRecordType()) {
                return true;
            }
        }
        return false;
    }

    private void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, List<AnnotatedWithParams> list) {
        int i;
        Iterator<AnnotatedWithParams> it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams next = it.next();
            if (visibilityChecker.isCreatorVisible(next)) {
                int parameterCount = next.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i2 = 0;
                while (true) {
                    if (i2 < parameterCount) {
                        AnnotatedParameter parameter = next.getParameter(i2);
                        PropertyName propertyName_findParamName = _findParamName(parameter, annotationIntrospector);
                        if (propertyName_findParamName == null || propertyName_findParamName.isEmpty()) {
                            break;
                        }
                        settableBeanPropertyArr2[i2] = constructCreatorProperty(deserializationContext, beanDescription, propertyName_findParamName, parameter.getIndex(), parameter, null);
                        i2++;
                    } else {
                        if (annotatedWithParams2 != null) {
                            break;
                        }
                        annotatedWithParams2 = next;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedWithParams != null) {
            creatorCollector.addPropertyCreator(annotatedWithParams, false, settableBeanPropertyArr);
            BasicBeanDescription basicBeanDescription = (BasicBeanDescription) beanDescription;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!basicBeanDescription.hasProperty(fullName)) {
                    basicBeanDescription.addProperty(SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        BeanDescription beanDescriptionIntrospect = config.introspect(javaType);
        KeyDeserializer keyDeserializerFindKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, beanDescriptionIntrospect.getClassInfo());
        if (keyDeserializerFindKeyDeserializerFromAnnotation != null) {
            return keyDeserializerFindKeyDeserializerFromAnnotation;
        }
        JsonDeserializer<?> jsonDeserializer_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescriptionIntrospect);
        if (jsonDeserializer_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, jsonDeserializer_findCustomEnumDeserializer);
        }
        JsonDeserializer<Object> jsonDeserializerFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, beanDescriptionIntrospect.getClassInfo());
        if (jsonDeserializerFindDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, jsonDeserializerFindDeserializerFromAnnotation);
        }
        EnumResolver enumResolverConstructEnumResolver = constructEnumResolver(rawClass, config, beanDescriptionIntrospect);
        EnumResolver enumResolverConstructEnumNamingStrategyResolver = constructEnumNamingStrategyResolver(config, beanDescriptionIntrospect.getClassInfo());
        EnumResolver enumResolverConstructUsingToString = EnumResolver.constructUsingToString(config, beanDescriptionIntrospect.getClassInfo());
        EnumResolver enumResolverConstructUsingIndex = EnumResolver.constructUsingIndex(config, beanDescriptionIntrospect.getClassInfo());
        for (AnnotatedMethod annotatedMethod : beanDescriptionIntrospect.getFactoryMethods()) {
            if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                if (annotatedMethod.getParameterCount() != 1 || !annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                    StringBuilder sb = new StringBuilder("Unsuitable method (");
                    sb.append(annotatedMethod);
                    sb.append(") decorated with @JsonCreator (for Enum type ");
                    l5.q(o6.e(rawClass, sb, ")"));
                    return null;
                }
                if (annotatedMethod.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(enumResolverConstructEnumResolver, annotatedMethod, enumResolverConstructEnumNamingStrategyResolver, enumResolverConstructUsingToString, enumResolverConstructUsingIndex);
                }
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(enumResolverConstructEnumResolver, enumResolverConstructEnumNamingStrategyResolver, enumResolverConstructUsingToString, enumResolverConstructUsingIndex);
    }

    private PropertyName _findParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotationIntrospector == null) {
            return null;
        }
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if (propertyNameFindNameForDeserialization != null && !propertyNameFindNameForDeserialization.isEmpty()) {
            return propertyNameFindNameForDeserialization;
        }
        String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(strFindImplicitPropertyName);
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        if (!this._factoryConfig.hasAbstractTypeResolvers()) {
            return null;
        }
        Iterator<AbstractTypeResolver> it = this._factoryConfig.abstractTypeResolvers().iterator();
        while (it.hasNext()) {
            JavaType javaTypeFindTypeMapping = it.next().findTypeMapping(deserializationConfig, javaType);
            if (javaTypeFindTypeMapping != null && !javaTypeFindTypeMapping.hasRawClass(rawClass)) {
                return javaTypeFindTypeMapping;
            }
        }
        return null;
    }

    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate, ConstructorDetector constructorDetector) throws InvalidDefinitionException {
        PropertyName propertyName;
        boolean z;
        int iFindOnlyParamWithoutInjection;
        if (1 != creatorCandidate.paramCount()) {
            if (constructorDetector.singleArgCreatorDefaultsToProperties() || (iFindOnlyParamWithoutInjection = creatorCandidate.findOnlyParamWithoutInjection()) < 0 || !(constructorDetector.singleArgCreatorDefaultsToDelegating() || creatorCandidate.paramName(iFindOnlyParamWithoutInjection) == null)) {
                _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
                return;
            } else {
                _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
                return;
            }
        }
        AnnotatedParameter annotatedParameterParameter = creatorCandidate.parameter(0);
        JacksonInject.Value valueInjection = creatorCandidate.injection(0);
        int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[constructorDetector.singleArgMode().ordinal()];
        if (i != 1) {
            if (i == 2) {
                PropertyName propertyNameParamName = creatorCandidate.paramName(0);
                if (propertyNameParamName == null) {
                    _validateNamedPropertyParameter(deserializationContext, beanDescription, creatorCandidate, 0, propertyNameParamName, valueInjection);
                }
                propertyName = propertyNameParamName;
            } else {
                if (i == 3) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Single-argument constructor (%s) is annotated but no 'mode' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", creatorCandidate.creator());
                    return;
                }
                BeanPropertyDefinition beanPropertyDefinitionPropertyDef = creatorCandidate.propertyDef(0);
                PropertyName propertyNameExplicitParamName = creatorCandidate.explicitParamName(0);
                z = propertyNameExplicitParamName != null;
                if (!z && beanDescription.findJsonValueAccessor() == null) {
                    if (valueInjection != null) {
                        propertyName = propertyNameExplicitParamName;
                    } else if (beanPropertyDefinitionPropertyDef != null) {
                        propertyNameExplicitParamName = creatorCandidate.paramName(0);
                        z = propertyNameExplicitParamName != null && beanPropertyDefinitionPropertyDef.couldSerialize();
                    }
                }
                propertyName = propertyNameExplicitParamName;
            }
            z = true;
        } else {
            propertyName = null;
            z = false;
        }
        if (z) {
            creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, beanDescription, propertyName, 0, annotatedParameterParameter, valueInjection)});
            return;
        }
        _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
        BeanPropertyDefinition beanPropertyDefinitionPropertyDef2 = creatorCandidate.propertyDef(0);
        if (beanPropertyDefinitionPropertyDef2 != null) {
            ((POJOPropertyBuilder) beanPropertyDefinitionPropertyDef2).removeConstructors();
        }
    }

    public void _addExplicitConstructorCreators(DeserializationContext deserializationContext, CreatorCollectionState creatorCollectionState, boolean z) throws InvalidDefinitionException {
        DeserializationContext deserializationContext2;
        BeanDescription beanDescription = creatorCollectionState.beanDesc;
        CreatorCollector creatorCollector = creatorCollectionState.creators;
        AnnotationIntrospector annotationIntrospector = creatorCollectionState.annotationIntrospector();
        VisibilityChecker<?> visibilityChecker = creatorCollectionState.vchecker;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map = creatorCollectionState.creatorParams;
        AnnotatedConstructor annotatedConstructorFindDefaultConstructor = beanDescription.findDefaultConstructor();
        if (annotatedConstructorFindDefaultConstructor != null && (!creatorCollector.hasDefaultCreator() || _hasCreatorAnnotation(deserializationContext, annotatedConstructorFindDefaultConstructor))) {
            creatorCollector.setDefaultCreator(annotatedConstructorFindDefaultConstructor);
        }
        for (AnnotatedConstructor annotatedConstructor : beanDescription.getConstructors()) {
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotatedConstructor);
            if (JsonCreator.Mode.DISABLED != modeFindCreatorAnnotation) {
                if (modeFindCreatorAnnotation != null) {
                    int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[modeFindCreatorAnnotation.ordinal()];
                    if (i == 1) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitDelegatingCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedConstructor, null));
                    } else if (i != 2) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitAnyCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedConstructor, map.get(annotatedConstructor)), deserializationContext.getConfig().getConstructorDetector());
                    } else {
                        deserializationContext2 = deserializationContext;
                        _addExplicitPropertyCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedConstructor, map.get(annotatedConstructor)));
                    }
                    creatorCollectionState.increaseExplicitConstructorCount();
                    deserializationContext = deserializationContext2;
                } else if (z && visibilityChecker.isCreatorVisible(annotatedConstructor)) {
                    creatorCollectionState.addImplicitConstructorCandidate(CreatorCandidate.construct(annotationIntrospector, annotatedConstructor, map.get(annotatedConstructor)));
                }
            }
        }
    }

    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws InvalidDefinitionException {
        BasicDeserializerFactory basicDeserializerFactory;
        DeserializationContext deserializationContext2;
        BeanDescription beanDescription2;
        int iParamCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iParamCount];
        int i = -1;
        int i2 = 0;
        while (i2 < iParamCount) {
            AnnotatedParameter annotatedParameterParameter = creatorCandidate.parameter(i2);
            JacksonInject.Value valueInjection = creatorCandidate.injection(i2);
            if (valueInjection != null) {
                basicDeserializerFactory = this;
                deserializationContext2 = deserializationContext;
                beanDescription2 = beanDescription;
                settableBeanPropertyArr[i2] = basicDeserializerFactory.constructCreatorProperty(deserializationContext2, beanDescription2, null, i2, annotatedParameterParameter, valueInjection);
            } else {
                basicDeserializerFactory = this;
                deserializationContext2 = deserializationContext;
                beanDescription2 = beanDescription;
                if (i < 0) {
                    i = i2;
                } else {
                    deserializationContext2.reportBadTypeDefinition(beanDescription2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i), Integer.valueOf(i2), creatorCandidate);
                }
            }
            i2++;
            this = basicDeserializerFactory;
            deserializationContext = deserializationContext2;
            beanDescription = beanDescription2;
        }
        BasicDeserializerFactory basicDeserializerFactory2 = this;
        DeserializationContext deserializationContext3 = deserializationContext;
        BeanDescription beanDescription3 = beanDescription;
        if (i < 0) {
            deserializationContext3.reportBadTypeDefinition(beanDescription3, "No argument left as delegating for Creator %s: exactly one required", creatorCandidate);
        }
        if (iParamCount != 1) {
            creatorCollector.addDelegatingCreator(creatorCandidate.creator(), true, settableBeanPropertyArr, i);
            return;
        }
        basicDeserializerFactory2._handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
        BeanPropertyDefinition beanPropertyDefinitionPropertyDef = creatorCandidate.propertyDef(0);
        if (beanPropertyDefinitionPropertyDef != null) {
            ((POJOPropertyBuilder) beanPropertyDefinitionPropertyDef).removeConstructors();
        }
    }

    public void _addExplicitFactoryCreators(DeserializationContext deserializationContext, CreatorCollectionState creatorCollectionState, boolean z) throws InvalidDefinitionException {
        DeserializationContext deserializationContext2;
        BeanDescription beanDescription = creatorCollectionState.beanDesc;
        CreatorCollector creatorCollector = creatorCollectionState.creators;
        AnnotationIntrospector annotationIntrospector = creatorCollectionState.annotationIntrospector();
        VisibilityChecker<?> visibilityChecker = creatorCollectionState.vchecker;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map = creatorCollectionState.creatorParams;
        for (AnnotatedMethod annotatedMethod : beanDescription.getFactoryMethods()) {
            JsonCreator.Mode modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotatedMethod);
            int parameterCount = annotatedMethod.getParameterCount();
            if (modeFindCreatorAnnotation == null) {
                if (z && parameterCount == 1 && visibilityChecker.isCreatorVisible(annotatedMethod)) {
                    creatorCollectionState.addImplicitFactoryCandidate(CreatorCandidate.construct(annotationIntrospector, annotatedMethod, null));
                }
            } else if (modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                if (parameterCount == 0) {
                    creatorCollector.setDefaultCreator(annotatedMethod);
                } else {
                    int i = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[modeFindCreatorAnnotation.ordinal()];
                    if (i == 1) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitDelegatingCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedMethod, null));
                    } else if (i != 2) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitAnyCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedMethod, map.get(annotatedMethod)), ConstructorDetector.DEFAULT);
                    } else {
                        deserializationContext2 = deserializationContext;
                        _addExplicitPropertyCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedMethod, map.get(annotatedMethod)));
                    }
                    creatorCollectionState.increaseExplicitFactoryCount();
                    deserializationContext = deserializationContext2;
                }
            }
        }
    }

    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws InvalidDefinitionException {
        DeserializationContext deserializationContext2;
        CreatorCandidate creatorCandidate2;
        BeanDescription beanDescription2;
        PropertyName propertyName;
        BasicDeserializerFactory basicDeserializerFactory;
        int iParamCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[iParamCount];
        int i = 0;
        while (i < iParamCount) {
            JacksonInject.Value valueInjection = creatorCandidate.injection(i);
            AnnotatedParameter annotatedParameterParameter = creatorCandidate.parameter(i);
            PropertyName propertyNameParamName = creatorCandidate.paramName(i);
            if (propertyNameParamName == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(annotatedParameterParameter) != null) {
                    this._reportUnwrappedCreatorProperty(deserializationContext, beanDescription, annotatedParameterParameter);
                }
                PropertyName propertyNameFindImplicitParamName = creatorCandidate.findImplicitParamName(i);
                basicDeserializerFactory = this;
                deserializationContext2 = deserializationContext;
                beanDescription2 = beanDescription;
                CreatorCandidate creatorCandidate3 = creatorCandidate;
                basicDeserializerFactory._validateNamedPropertyParameter(deserializationContext2, beanDescription2, creatorCandidate3, i, propertyNameFindImplicitParamName, valueInjection);
                creatorCandidate2 = creatorCandidate3;
                propertyName = propertyNameFindImplicitParamName;
            } else {
                deserializationContext2 = deserializationContext;
                creatorCandidate2 = creatorCandidate;
                beanDescription2 = beanDescription;
                propertyName = propertyNameParamName;
                basicDeserializerFactory = this;
            }
            settableBeanPropertyArr[i] = basicDeserializerFactory.constructCreatorProperty(deserializationContext2, beanDescription2, propertyName, i, annotatedParameterParameter, valueInjection);
            i++;
            creatorCandidate = creatorCandidate2;
            this = basicDeserializerFactory;
            deserializationContext = deserializationContext2;
            beanDescription = beanDescription2;
        }
        creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, settableBeanPropertyArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.BasicDeserializerFactory] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.fasterxml.jackson.databind.deser.impl.CreatorCandidate] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [int] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.fasterxml.jackson.databind.deser.impl.CreatorCandidate] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.fasterxml.jackson.databind.deser.impl.CreatorCandidate] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.fasterxml.jackson.databind.introspect.AnnotatedMember, com.fasterxml.jackson.databind.introspect.AnnotatedWithParams, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.fasterxml.jackson.databind.deser.impl.CreatorCollector] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void _addImplicitConstructorCreators(DeserializationContext deserializationContext, CreatorCollectionState creatorCollectionState, List<CreatorCandidate> list) throws InvalidDefinitionException {
        VisibilityChecker<?> visibilityChecker;
        boolean z;
        ?? r0;
        ?? r3;
        ?? r14;
        int i;
        boolean z2;
        byte b;
        VisibilityChecker<?> visibilityChecker2;
        SettableBeanProperty[] settableBeanPropertyArr;
        ?? r02 = this;
        DeserializationConfig config = deserializationContext.getConfig();
        BeanDescription beanDescription = creatorCollectionState.beanDesc;
        ?? r7 = creatorCollectionState.creators;
        AnnotationIntrospector annotationIntrospector = creatorCollectionState.annotationIntrospector();
        VisibilityChecker<?> visibilityChecker3 = creatorCollectionState.vchecker;
        int i2 = 1;
        ?? r11 = 0;
        boolean z3 = config.getConstructorDetector().singleArgCreatorDefaultsToProperties() && !beanDescription.isRecordType();
        LinkedList linkedList = null;
        boolean z4 = z3;
        for (CreatorCandidate creatorCandidate : list) {
            int iParamCount = creatorCandidate.paramCount();
            ?? Creator = creatorCandidate.creator();
            if (iParamCount == i2) {
                BeanPropertyDefinition beanPropertyDefinitionPropertyDef = creatorCandidate.propertyDef(r11);
                if (z4 || r02._checkIfCreatorPropertyBased(beanDescription, annotationIntrospector, Creator, beanPropertyDefinitionPropertyDef)) {
                    JacksonInject.Value valueInjection = creatorCandidate.injection(r11);
                    PropertyName propertyNameParamName = creatorCandidate.paramName(r11);
                    if (propertyNameParamName != null || (propertyNameParamName = creatorCandidate.findImplicitParamName(r11)) != null || valueInjection != null) {
                        r7.addPropertyCreator(Creator, r11, new SettableBeanProperty[]{r02.constructCreatorProperty(deserializationContext, beanDescription, propertyNameParamName, 0, creatorCandidate.parameter(r11), valueInjection)});
                        r0 = this;
                    }
                    visibilityChecker = visibilityChecker3;
                    r3 = r11;
                    z = z4 ? 1 : 0;
                } else {
                    r02._handleSingleArgumentCreator(r7, Creator, r11, visibilityChecker3.isCreatorVisible(Creator));
                    if (beanPropertyDefinitionPropertyDef != null) {
                        ((POJOPropertyBuilder) beanPropertyDefinitionPropertyDef).removeConstructors();
                    }
                }
                r0 = r02;
                visibilityChecker = visibilityChecker3;
                r3 = r11;
                z = z4 ? 1 : 0;
            } else {
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[iParamCount];
                byte b2 = -1;
                ?? r5 = r11;
                ?? r16 = r5;
                int i3 = r16 == true ? 1 : 0;
                ?? r1 = creatorCandidate;
                ?? r52 = r5;
                boolean z5 = z4;
                ?? r162 = r16;
                while (r52 < iParamCount) {
                    AnnotatedParameter parameter = Creator.getParameter(r52);
                    BeanPropertyDefinition beanPropertyDefinitionPropertyDef2 = r1.propertyDef(r52);
                    byte b3 = b2;
                    ?? r4 = r52;
                    JacksonInject.Value valueFindInjectableValue = annotationIntrospector.findInjectableValue(parameter);
                    PropertyName fullName = beanPropertyDefinitionPropertyDef2 == null ? null : beanPropertyDefinitionPropertyDef2.getFullName();
                    if (beanPropertyDefinitionPropertyDef2 == null || !(beanPropertyDefinitionPropertyDef2.isExplicitlyNamed() || beanDescription.isRecordType())) {
                        r14 = r1;
                        i = iParamCount;
                        PropertyName propertyName = fullName;
                        z2 = z5;
                        b = b3 == true ? 1 : 0;
                        visibilityChecker2 = visibilityChecker3;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                        if (valueFindInjectableValue != null) {
                            i3++;
                            settableBeanPropertyArr[r4 == true ? 1 : 0] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, r4 == true ? 1 : 0, parameter, valueFindInjectableValue);
                        } else if (annotationIntrospector.findUnwrappingNameTransformer(parameter) != null) {
                            _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                        } else if (b < 0) {
                            b = r4 == true ? 1 : 0;
                        }
                    } else {
                        r162++;
                        r14 = r1;
                        i = iParamCount;
                        PropertyName propertyName2 = fullName;
                        z2 = z5;
                        b = b3 == true ? 1 : 0;
                        visibilityChecker2 = visibilityChecker3;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                        settableBeanPropertyArr[r4 == true ? 1 : 0] = constructCreatorProperty(deserializationContext, beanDescription, propertyName2, r4 == true ? 1 : 0, parameter, valueFindInjectableValue);
                    }
                    int i4 = (r4 == true ? 1 : 0) + 1;
                    settableBeanPropertyArr2 = settableBeanPropertyArr;
                    iParamCount = i;
                    b2 = b;
                    r1 = r14;
                    visibilityChecker3 = visibilityChecker2;
                    z5 = z2;
                    r52 = i4;
                    r162 = r162;
                }
                ?? r142 = r1;
                int i5 = iParamCount;
                visibilityChecker = visibilityChecker3;
                z = z5;
                SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                byte b4 = b2;
                r0 = this;
                if (r162 <= 0 && i3 <= 0) {
                    r3 = 0;
                } else if (r162 + i3 == i5) {
                    r3 = 0;
                    r7.addPropertyCreator(Creator, false, settableBeanPropertyArr3);
                } else {
                    r3 = 0;
                    r3 = 0;
                    r3 = 0;
                    if (r162 == 0 && i3 + 1 == i5) {
                        r7.addDelegatingCreator(Creator, false, settableBeanPropertyArr3, 0);
                    } else {
                        PropertyName propertyNameFindImplicitParamName = r142.findImplicitParamName(b4 == true ? 1 : 0);
                        if (propertyNameFindImplicitParamName == null || propertyNameFindImplicitParamName.isEmpty()) {
                            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(b4 == true ? 1 : 0), Creator);
                        }
                    }
                }
                if (!r7.hasDefaultCreator()) {
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(Creator);
                }
            }
            r11 = r3;
            visibilityChecker3 = visibilityChecker;
            z4 = z;
            i2 = 1;
            r02 = r0;
        }
        VisibilityChecker<?> visibilityChecker4 = visibilityChecker3;
        if (linkedList == null || r7.hasDelegatingCreator() || r7.hasPropertyBasedCreator()) {
            return;
        }
        r02._checkImplicitlyNamedConstructors(deserializationContext, beanDescription, visibilityChecker4, annotationIntrospector, r7, linkedList);
    }

    public void _addImplicitFactoryCreators(DeserializationContext deserializationContext, CreatorCollectionState creatorCollectionState, List<CreatorCandidate> list) throws InvalidDefinitionException {
        SettableBeanProperty[] settableBeanPropertyArr;
        BasicDeserializerFactory basicDeserializerFactory = this;
        BeanDescription beanDescription = creatorCollectionState.beanDesc;
        CreatorCollector creatorCollector = creatorCollectionState.creators;
        AnnotationIntrospector annotationIntrospector = creatorCollectionState.annotationIntrospector();
        VisibilityChecker<?> visibilityChecker = creatorCollectionState.vchecker;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map = creatorCollectionState.creatorParams;
        for (CreatorCandidate creatorCandidate : list) {
            int iParamCount = creatorCandidate.paramCount();
            AnnotatedWithParams annotatedWithParamsCreator = creatorCandidate.creator();
            BeanPropertyDefinition[] beanPropertyDefinitionArr = map.get(annotatedWithParamsCreator);
            if (iParamCount == 1) {
                BeanPropertyDefinition beanPropertyDefinitionPropertyDef = creatorCandidate.propertyDef(0);
                if (basicDeserializerFactory._checkIfCreatorPropertyBased(beanDescription, annotationIntrospector, annotatedWithParamsCreator, beanPropertyDefinitionPropertyDef)) {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[iParamCount];
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    AnnotatedParameter annotatedParameter = null;
                    while (i < iParamCount) {
                        AnnotatedParameter parameter = annotatedWithParamsCreator.getParameter(i);
                        BeanPropertyDefinition beanPropertyDefinition = beanPropertyDefinitionArr == null ? null : beanPropertyDefinitionArr[i];
                        JacksonInject.Value valueFindInjectableValue = annotationIntrospector.findInjectableValue(parameter);
                        PropertyName fullName = beanPropertyDefinition == null ? null : beanPropertyDefinition.getFullName();
                        if (beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) {
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            PropertyName propertyName = fullName;
                            if (valueFindInjectableValue != null) {
                                i3++;
                                basicDeserializerFactory = this;
                                settableBeanPropertyArr[i] = basicDeserializerFactory.constructCreatorProperty(deserializationContext, beanDescription, propertyName, i, parameter, valueFindInjectableValue);
                            } else {
                                basicDeserializerFactory = this;
                                if (annotationIntrospector.findUnwrappingNameTransformer(parameter) != null) {
                                    basicDeserializerFactory._reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                                } else if (annotatedParameter == null) {
                                    annotatedParameter = parameter;
                                }
                            }
                        } else {
                            i2++;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            settableBeanPropertyArr[i] = basicDeserializerFactory.constructCreatorProperty(deserializationContext, beanDescription, fullName, i, parameter, valueFindInjectableValue);
                            basicDeserializerFactory = this;
                        }
                        i++;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                    }
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    if (i2 > 0 || i3 > 0) {
                        if (i2 + i3 == iParamCount) {
                            creatorCollector.addPropertyCreator(annotatedWithParamsCreator, false, settableBeanPropertyArr3);
                        } else if (i2 == 0 && i3 + 1 == iParamCount) {
                            creatorCollector.addDelegatingCreator(annotatedWithParamsCreator, false, settableBeanPropertyArr3, 0);
                        } else {
                            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(annotatedParameter == null ? -1 : annotatedParameter.getIndex()), annotatedWithParamsCreator);
                        }
                    }
                } else {
                    basicDeserializerFactory._handleSingleArgumentCreator(creatorCollector, annotatedWithParamsCreator, false, visibilityChecker.isCreatorVisible(annotatedWithParamsCreator));
                    if (beanPropertyDefinitionPropertyDef != null) {
                        ((POJOPropertyBuilder) beanPropertyDefinitionPropertyDef).removeConstructors();
                    }
                }
            }
        }
    }

    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws InvalidDefinitionException {
        DeserializationConfig config = deserializationContext.getConfig();
        VisibilityChecker<?> defaultVisibilityChecker = config.getDefaultVisibilityChecker(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        ConstructorDetector constructorDetector = config.getConstructorDetector();
        CreatorCollectionState creatorCollectionState = new CreatorCollectionState(deserializationContext, beanDescription, defaultVisibilityChecker, new CreatorCollector(beanDescription, config), _findCreatorsFromProperties(deserializationContext, beanDescription));
        _addExplicitFactoryCreators(deserializationContext, creatorCollectionState, !constructorDetector.requireCtorAnnotation());
        if (beanDescription.getType().isConcrete() && !beanDescription.isNonStaticInnerClass()) {
            _addExplicitConstructorCreators(deserializationContext, creatorCollectionState, constructorDetector.shouldIntrospectorImplicitConstructors(beanDescription.getBeanClass()));
            if (creatorCollectionState.hasImplicitConstructorCandidates() && !creatorCollectionState.hasExplicitConstructors()) {
                _addImplicitConstructorCreators(deserializationContext, creatorCollectionState, creatorCollectionState.implicitConstructorCandidates());
            }
        }
        if (creatorCollectionState.hasImplicitFactoryCandidates() && !creatorCollectionState.hasExplicitFactories() && !creatorCollectionState.hasExplicitConstructors()) {
            _addImplicitFactoryCreators(deserializationContext, creatorCollectionState, creatorCollectionState.implicitFactoryCandidates());
        }
        return creatorCollectionState.creators.constructValueInstantiator(deserializationContext);
    }

    public Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, BeanDescription beanDescription) throws InvalidDefinitionException {
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> linkedHashMap = Collections.EMPTY_MAP;
        for (BeanPropertyDefinition beanPropertyDefinition : beanDescription.findProperties()) {
            Iterator<AnnotatedParameter> constructorParameters = beanPropertyDefinition.getConstructorParameters();
            while (constructorParameters.hasNext()) {
                AnnotatedParameter next = constructorParameters.next();
                AnnotatedWithParams owner = next.getOwner();
                BeanPropertyDefinition[] beanPropertyDefinitionArr = linkedHashMap.get(owner);
                int index = next.getIndex();
                if (beanPropertyDefinitionArr == null) {
                    if (linkedHashMap.isEmpty()) {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                    beanPropertyDefinitionArr = new BeanPropertyDefinition[owner.getParameterCount()];
                    linkedHashMap.put(owner, beanPropertyDefinitionArr);
                } else if (beanPropertyDefinitionArr[index] != null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, beanPropertyDefinitionArr[index], beanPropertyDefinition);
                }
                beanPropertyDefinitionArr[index] = beanPropertyDefinition;
            }
        }
        return linkedHashMap;
    }

    public JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            ArrayType arrayType2 = arrayType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> jsonDeserializerFindArrayDeserializer = it.next().findArrayDeserializer(arrayType2, deserializationConfig2, beanDescription2, typeDeserializer2, jsonDeserializer2);
            if (jsonDeserializerFindArrayDeserializer != null) {
                return jsonDeserializerFindArrayDeserializer;
            }
            arrayType = arrayType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindBeanDeserializer = it.next().findBeanDeserializer(javaType, deserializationConfig, beanDescription);
            if (jsonDeserializerFindBeanDeserializer != null) {
                return jsonDeserializerFindBeanDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            CollectionType collectionType2 = collectionType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> jsonDeserializerFindCollectionDeserializer = it.next().findCollectionDeserializer(collectionType2, deserializationConfig2, beanDescription2, typeDeserializer2, jsonDeserializer2);
            if (jsonDeserializerFindCollectionDeserializer != null) {
                return jsonDeserializerFindCollectionDeserializer;
            }
            collectionType = collectionType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            CollectionLikeType collectionLikeType2 = collectionLikeType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> jsonDeserializerFindCollectionLikeDeserializer = it.next().findCollectionLikeDeserializer(collectionLikeType2, deserializationConfig2, beanDescription2, typeDeserializer2, jsonDeserializer2);
            if (jsonDeserializerFindCollectionLikeDeserializer != null) {
                return jsonDeserializerFindCollectionLikeDeserializer;
            }
            collectionLikeType = collectionLikeType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindEnumDeserializer = it.next().findEnumDeserializer(cls, deserializationConfig, beanDescription);
            if (jsonDeserializerFindEnumDeserializer != null) {
                return jsonDeserializerFindEnumDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            MapType mapType2 = mapType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            KeyDeserializer keyDeserializer2 = keyDeserializer;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> jsonDeserializerFindMapDeserializer = it.next().findMapDeserializer(mapType2, deserializationConfig2, beanDescription2, keyDeserializer2, typeDeserializer2, jsonDeserializer2);
            if (jsonDeserializerFindMapDeserializer != null) {
                return jsonDeserializerFindMapDeserializer;
            }
            mapType = mapType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            keyDeserializer = keyDeserializer2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            MapLikeType mapLikeType2 = mapLikeType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            KeyDeserializer keyDeserializer2 = keyDeserializer;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> jsonDeserializerFindMapLikeDeserializer = it.next().findMapLikeDeserializer(mapLikeType2, deserializationConfig2, beanDescription2, keyDeserializer2, typeDeserializer2, jsonDeserializer2);
            if (jsonDeserializerFindMapLikeDeserializer != null) {
                return jsonDeserializerFindMapLikeDeserializer;
            }
            mapLikeType = mapLikeType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            keyDeserializer = keyDeserializer2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            ReferenceType referenceType2 = referenceType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> jsonDeserializerFindReferenceDeserializer = it.next().findReferenceDeserializer(referenceType2, deserializationConfig2, beanDescription2, typeDeserializer2, jsonDeserializer2);
            if (jsonDeserializerFindReferenceDeserializer != null) {
                return jsonDeserializerFindReferenceDeserializer;
            }
            referenceType = referenceType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> jsonDeserializerFindTreeNodeDeserializer = it.next().findTreeNodeDeserializer(cls, deserializationConfig, beanDescription);
            if (jsonDeserializerFindTreeNodeDeserializer != null) {
                return jsonDeserializerFindTreeNodeDeserializer;
            }
        }
        return null;
    }

    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) {
        JavaType javaTypeMapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (javaTypeMapAbstractType == null || javaTypeMapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return javaTypeMapAbstractType;
    }

    public PropertyMetadata _getSetterInfo(DeserializationContext deserializationContext, BeanProperty beanProperty, PropertyMetadata propertyMetadata) {
        Nulls nullsNonDefaultContentNulls;
        JsonSetter.Value valueFindSetterInfo;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedMember member = beanProperty.getMember();
        Nulls nullsNonDefaultValueNulls = null;
        if (member != null) {
            if (annotationIntrospector == null || (valueFindSetterInfo = annotationIntrospector.findSetterInfo(member)) == null) {
                nullsNonDefaultContentNulls = null;
            } else {
                nullsNonDefaultValueNulls = valueFindSetterInfo.nonDefaultValueNulls();
                nullsNonDefaultContentNulls = valueFindSetterInfo.nonDefaultContentNulls();
            }
            JsonSetter.Value setterInfo = config.getConfigOverride(beanProperty.getType().getRawClass()).getSetterInfo();
            if (setterInfo != null) {
                if (nullsNonDefaultValueNulls == null) {
                    nullsNonDefaultValueNulls = setterInfo.nonDefaultValueNulls();
                }
                if (nullsNonDefaultContentNulls == null) {
                    nullsNonDefaultContentNulls = setterInfo.nonDefaultContentNulls();
                }
            }
        } else {
            nullsNonDefaultContentNulls = null;
        }
        JsonSetter.Value defaultSetterInfo = config.getDefaultSetterInfo();
        if (nullsNonDefaultValueNulls == null) {
            nullsNonDefaultValueNulls = defaultSetterInfo.nonDefaultValueNulls();
        }
        if (nullsNonDefaultContentNulls == null) {
            nullsNonDefaultContentNulls = defaultSetterInfo.nonDefaultContentNulls();
        }
        return (nullsNonDefaultValueNulls == null && nullsNonDefaultContentNulls == null) ? propertyMetadata : propertyMetadata.withNulls(nullsNonDefaultValueNulls, nullsNonDefaultContentNulls);
    }

    public boolean _handleSingleArgumentCreator(CreatorCollector creatorCollector, AnnotatedWithParams annotatedWithParams, boolean z, boolean z2) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CLASS_CHAR_SEQUENCE) {
            if (z || z2) {
                creatorCollector.addStringCreator(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z || z2) {
                creatorCollector.addIntCreator(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z || z2) {
                creatorCollector.addLongCreator(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z || z2) {
                creatorCollector.addDoubleCreator(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z || z2) {
                creatorCollector.addBooleanCreator(annotatedWithParams, z);
            }
            return true;
        }
        if (rawParameterType == BigInteger.class && (z || z2)) {
            creatorCollector.addBigIntegerCreator(annotatedWithParams, z);
        }
        if (rawParameterType == BigDecimal.class && (z || z2)) {
            creatorCollector.addBigDecimalCreator(annotatedWithParams, z);
        }
        if (!z) {
            return false;
        }
        creatorCollector.addDelegatingCreator(annotatedWithParams, z, null, 0);
        return true;
    }

    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return (annotationIntrospector == null || (modeFindCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotated)) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) ? false : true;
    }

    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> clsFindCollectionFallback = ContainerDefaultMappings.findCollectionFallback(javaType);
        if (clsFindCollectionFallback != null) {
            return (CollectionType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, clsFindCollectionFallback, true);
        }
        return null;
    }

    public MapType _mapAbstractMapType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> clsFindMapFallback = ContainerDefaultMappings.findMapFallback(javaType);
        if (clsFindMapFallback != null) {
            return (MapType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, clsFindMapFallback, true);
        }
        return null;
    }

    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedParameter annotatedParameter) throws InvalidDefinitionException {
        deserializationContext.reportBadTypeDefinition(beanDescription, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.getIndex()));
    }

    public void _validateNamedPropertyParameter(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCandidate creatorCandidate, int i, PropertyName propertyName, JacksonInject.Value value) throws InvalidDefinitionException {
        if (propertyName == null && value == null) {
            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i), creatorCandidate);
        }
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, Annotated annotated, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (!(obj instanceof Class)) {
            ja.q("AnnotationIntrospector returned key deserializer definition of type ", obj.getClass().getName(), "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
            return null;
        }
        Class cls = (Class) obj;
        if (ClassUtil.isBogusClass(cls)) {
            return null;
        }
        if (ValueInstantiator.class.isAssignableFrom(cls)) {
            deserializationConfig.getHandlerInstantiator();
            return (ValueInstantiator) ClassUtil.createInstance(cls, deserializationConfig.canOverrideAccessModifiers());
        }
        r6.g(o6.e(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<ValueInstantiator>"));
        return null;
    }

    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, PropertyName propertyName, int i, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        PropertyName propertyNameFindWrapperName;
        PropertyMetadata propertyMetadata;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            propertyNameFindWrapperName = null;
        } else {
            PropertyMetadata propertyMetadataConstruct = PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter), annotationIntrospector.findPropertyDescription(annotatedParameter), annotationIntrospector.findPropertyIndex(annotatedParameter), annotationIntrospector.findPropertyDefaultValue(annotatedParameter));
            propertyNameFindWrapperName = annotationIntrospector.findWrapperName(annotatedParameter);
            propertyMetadata = propertyMetadataConstruct;
        }
        JavaType javaTypeResolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedParameter, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, javaTypeResolveMemberAndTypeAnnotations, propertyNameFindWrapperName, annotatedParameter, propertyMetadata);
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) javaTypeResolveMemberAndTypeAnnotations.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, javaTypeResolveMemberAndTypeAnnotations);
        }
        CreatorProperty creatorPropertyConstruct = CreatorProperty.construct(propertyName, javaTypeResolveMemberAndTypeAnnotations, std.getWrapperName(), typeDeserializerFindTypeDeserializer, beanDescription.getClassAnnotations(), annotatedParameter, i, value, _getSetterInfo(deserializationContext, std, propertyMetadata));
        JsonDeserializer<?> jsonDeserializerFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedParameter);
        if (jsonDeserializerFindDeserializerFromAnnotation == null) {
            jsonDeserializerFindDeserializerFromAnnotation = (JsonDeserializer) javaTypeResolveMemberAndTypeAnnotations.getValueHandler();
        }
        return jsonDeserializerFindDeserializerFromAnnotation != null ? creatorPropertyConstruct.withValueDeserializer(deserializationContext.handlePrimaryContextualization(jsonDeserializerFindDeserializerFromAnnotation, creatorPropertyConstruct, javaTypeResolveMemberAndTypeAnnotations)) : creatorPropertyConstruct;
    }

    public EnumResolver constructEnumNamingStrategyResolver(DeserializationConfig deserializationConfig, AnnotatedClass annotatedClass) {
        EnumNamingStrategy enumNamingStrategyCreateEnumNamingStrategyInstance = EnumNamingStrategyFactory.createEnumNamingStrategyInstance(deserializationConfig.getAnnotationIntrospector().findEnumNamingStrategy(deserializationConfig, annotatedClass), deserializationConfig.canOverrideAccessModifiers());
        if (enumNamingStrategyCreateEnumNamingStrategyInstance == null) {
            return null;
        }
        return EnumResolver.constructUsingEnumNamingStrategy(deserializationConfig, annotatedClass, enumNamingStrategyCreateEnumNamingStrategyInstance);
    }

    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) {
        AnnotatedMember annotatedMemberFindJsonValueAccessor = beanDescription.findJsonValueAccessor();
        if (annotatedMemberFindJsonValueAccessor == null) {
            return EnumResolver.constructFor(deserializationConfig, beanDescription.getClassInfo());
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMemberFindJsonValueAccessor.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUsingMethod(deserializationConfig, beanDescription.getClassInfo(), annotatedMemberFindJsonValueAccessor);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer = typeDeserializerFindTypeDeserializer;
        JsonDeserializer<?> jsonDeserializer_findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, beanDescription, typeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                if (contentType.isPrimitive()) {
                    jsonDeserializer_findCustomArrayDeserializer = PrimitiveArrayDeserializers.forType(contentType.getRawClass());
                } else if (contentType.hasRawClass(String.class)) {
                    jsonDeserializer_findCustomArrayDeserializer = StringArrayDeserializer.instance;
                }
            }
            if (jsonDeserializer_findCustomArrayDeserializer == null) {
                jsonDeserializer_findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, jsonDeserializer, typeDeserializer);
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomArrayDeserializer = it.next().modifyArrayDeserializer(config, arrayType, beanDescription, jsonDeserializer_findCustomArrayDeserializer);
            }
        }
        return jsonDeserializer_findCustomArrayDeserializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createCollectionDeserializer(com.fasterxml.jackson.databind.DeserializationContext r10, com.fasterxml.jackson.databind.type.CollectionType r11, com.fasterxml.jackson.databind.BeanDescription r12) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.JavaType r0 = r11.getContentType()
            java.lang.Object r1 = r0.getValueHandler()
            r7 = r1
            com.fasterxml.jackson.databind.JsonDeserializer r7 = (com.fasterxml.jackson.databind.JsonDeserializer) r7
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r10.getConfig()
            java.lang.Object r1 = r0.getTypeHandler()
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r1
            if (r1 != 0) goto L1b
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = r9.findTypeDeserializer(r4, r0)
        L1b:
            r2 = r9
            r3 = r11
            r5 = r12
            r6 = r1
            com.fasterxml.jackson.databind.JsonDeserializer r9 = r2._findCustomCollectionDeserializer(r3, r4, r5, r6, r7)
            r1 = r6
            r11 = 0
            if (r9 != 0) goto L3a
            java.lang.Class r12 = r3.getRawClass()
            if (r7 != 0) goto L3a
            java.lang.Class<java.util.EnumSet> r6 = java.util.EnumSet.class
            boolean r12 = r6.isAssignableFrom(r12)
            if (r12 == 0) goto L3a
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer r9 = new com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer
            r9.<init>(r0, r11, r1)
        L3a:
            if (r9 != 0) goto La0
            boolean r12 = r3.isInterface()
            if (r12 != 0) goto L4c
            boolean r12 = r3.isAbstract()
            if (r12 == 0) goto L49
            goto L4c
        L49:
            r11 = r3
            r12 = r5
            goto L6a
        L4c:
            com.fasterxml.jackson.databind.type.CollectionType r12 = r2._mapAbstractCollectionType(r3, r4)
            if (r12 != 0) goto L63
            java.lang.Object r9 = r3.getTypeHandler()
            if (r9 == 0) goto L5d
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r9 = com.fasterxml.jackson.databind.deser.AbstractDeserializer.constructForNonPOJO(r5)
            goto L49
        L5d:
            java.lang.String r9 = "Cannot find a deserializer for non-concrete Collection type "
            defpackage.akb.o(r3, r9)
            return r11
        L63:
            com.fasterxml.jackson.databind.BeanDescription r11 = r4.introspectForCreation(r12)
            r8 = r12
            r12 = r11
            r11 = r8
        L6a:
            if (r9 != 0) goto La2
            com.fasterxml.jackson.databind.deser.ValueInstantiator r9 = r2.findValueInstantiator(r10, r12)
            boolean r3 = r9.canCreateUsingDefault()
            if (r3 != 0) goto L8b
            java.lang.Class<java.util.concurrent.ArrayBlockingQueue> r3 = java.util.concurrent.ArrayBlockingQueue.class
            boolean r3 = r11.hasRawClass(r3)
            if (r3 == 0) goto L84
            com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer r10 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            r10.<init>(r11, r7, r1, r9)
            return r10
        L84:
            com.fasterxml.jackson.databind.JsonDeserializer r10 = com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForCollection(r10, r11)
            if (r10 == 0) goto L8b
            return r10
        L8b:
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r10 = r0.hasRawClass(r10)
            if (r10 == 0) goto L9a
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r10 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            r10.<init>(r11, r7, r9)
        L98:
            r9 = r10
            goto La2
        L9a:
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r10 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
            r10.<init>(r11, r7, r1, r9)
            goto L98
        La0:
            r11 = r3
            r12 = r5
        La2:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r10 = r2._factoryConfig
            boolean r10 = r10.hasDeserializerModifiers()
            if (r10 == 0) goto Lc5
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r10 = r2._factoryConfig
            java.lang.Iterable r10 = r10.deserializerModifiers()
            java.util.Iterator r10 = r10.iterator()
        Lb4:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r0 = r10.next()
            com.fasterxml.jackson.databind.deser.BeanDeserializerModifier r0 = (com.fasterxml.jackson.databind.deser.BeanDeserializerModifier) r0
            com.fasterxml.jackson.databind.JsonDeserializer r9 = r0.modifyCollectionDeserializer(r4, r11, r12, r9)
            goto Lb4
        Lc5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createCollectionDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.CollectionType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = collectionLikeType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> jsonDeserializer_findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, beanDescription, typeDeserializerFindTypeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomCollectionLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomCollectionLikeDeserializer = it.next().modifyCollectionLikeDeserializer(config, collectionLikeType, beanDescription, jsonDeserializer_findCustomCollectionLikeDeserializer);
            }
        }
        return jsonDeserializer_findCustomCollectionLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws InvalidDefinitionException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> jsonDeserializer_findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (jsonDeserializer_findCustomEnumDeserializer == null) {
            if (rawClass == Enum.class) {
                return AbstractDeserializer.constructForNonPOJO(beanDescription);
            }
            ValueInstantiator valueInstantiator_constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            SettableBeanProperty[] fromObjectArguments = valueInstantiator_constructDefaultValueInstantiator == null ? null : valueInstantiator_constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            Iterator<AnnotatedMethod> it = beanDescription.getFactoryMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod next = it.next();
                if (_hasCreatorAnnotation(deserializationContext, next)) {
                    if (next.getParameterCount() == 0) {
                        jsonDeserializer_findCustomEnumDeserializer = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, next);
                    } else {
                        if (!next.getRawReturnType().isAssignableFrom(rawClass)) {
                            deserializationContext.reportBadDefinition(javaType, "Invalid `@JsonCreator` annotated Enum factory method [" + next.toString() + "]: needs to return compatible type");
                        }
                        jsonDeserializer_findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config, rawClass, next, valueInstantiator_constructDefaultValueInstantiator, fromObjectArguments);
                    }
                }
            }
            if (jsonDeserializer_findCustomEnumDeserializer == null) {
                jsonDeserializer_findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, beanDescription), config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS), constructEnumNamingStrategyResolver(config, beanDescription.getClassInfo()), EnumResolver.constructUsingToString(config, beanDescription.getClassInfo()));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                jsonDeserializer_findCustomEnumDeserializer = it2.next().modifyEnumDeserializer(config, javaType, beanDescription, jsonDeserializer_findCustomEnumDeserializer);
            }
        }
        return jsonDeserializer_findCustomEnumDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        BeanDescription beanDescriptionIntrospectClassAnnotations;
        DeserializationConfig config = deserializationContext.getConfig();
        KeyDeserializer keyDeserializerModifyKeyDeserializer = null;
        if (this._factoryConfig.hasKeyDeserializers()) {
            beanDescriptionIntrospectClassAnnotations = config.introspectClassAnnotations(javaType);
            Iterator<KeyDeserializers> it = this._factoryConfig.keyDeserializers().iterator();
            while (it.hasNext() && (keyDeserializerModifyKeyDeserializer = it.next().findKeyDeserializer(javaType, config, beanDescriptionIntrospectClassAnnotations)) == null) {
            }
        } else {
            beanDescriptionIntrospectClassAnnotations = null;
        }
        if (keyDeserializerModifyKeyDeserializer == null) {
            if (beanDescriptionIntrospectClassAnnotations == null) {
                beanDescriptionIntrospectClassAnnotations = config.introspectClassAnnotations(javaType.getRawClass());
            }
            keyDeserializerModifyKeyDeserializer = findKeyDeserializerFromAnnotation(deserializationContext, beanDescriptionIntrospectClassAnnotations.getClassInfo());
            if (keyDeserializerModifyKeyDeserializer == null) {
                keyDeserializerModifyKeyDeserializer = javaType.isEnumType() ? _createEnumKeyDeserializer(deserializationContext, javaType) : StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
            }
        }
        if (keyDeserializerModifyKeyDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.deserializerModifiers().iterator();
            while (it2.hasNext()) {
                keyDeserializerModifyKeyDeserializer = it2.next().modifyKeyDeserializer(config, javaType, keyDeserializerModifyKeyDeserializer);
            }
        }
        return keyDeserializerModifyKeyDeserializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext r18, com.fasterxml.jackson.databind.type.MapType r19, com.fasterxml.jackson.databind.BeanDescription r20) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.MapType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> jsonDeserializer_findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, beanDescription, keyDeserializer, typeDeserializerFindTypeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomMapLikeDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomMapLikeDeserializer = it.next().modifyMapLikeDeserializer(config, mapLikeType, beanDescription, jsonDeserializer_findCustomMapLikeDeserializer);
            }
        }
        return jsonDeserializer_findCustomMapLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializerFindTypeDeserializer == null) {
            typeDeserializerFindTypeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer = typeDeserializerFindTypeDeserializer;
        JsonDeserializer<?> jsonDeserializer_findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, beanDescription, typeDeserializer, jsonDeserializer);
        if (jsonDeserializer_findCustomReferenceDeserializer == null && referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return new AtomicReferenceDeserializer(referenceType, referenceType.getRawClass() == AtomicReference.class ? null : findValueInstantiator(deserializationContext, beanDescription), typeDeserializer, jsonDeserializer);
        }
        if (jsonDeserializer_findCustomReferenceDeserializer != null && this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            while (it.hasNext()) {
                jsonDeserializer_findCustomReferenceDeserializer = it.next().modifyReferenceDeserializer(config, referenceType, beanDescription, jsonDeserializer_findCustomReferenceDeserializer);
            }
        }
        return jsonDeserializer_findCustomReferenceDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) {
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> jsonDeserializer_findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, beanDescription);
        return jsonDeserializer_findCustomTreeNodeDeserializer != null ? jsonDeserializer_findCustomTreeNodeDeserializer : JsonNodeDeserializer.getDeserializer(rawClass);
    }

    public JsonDeserializer<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        Object objFindContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, objFindContentDeserializer);
    }

    public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        JavaType javaType_findRemappedType;
        JavaType javaType_findRemappedType2;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT || rawClass == CLASS_SERIALIZABLE) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType_findRemappedType = _findRemappedType(config, List.class);
                javaType_findRemappedType2 = _findRemappedType(config, Map.class);
            } else {
                javaType_findRemappedType = null;
                javaType_findRemappedType2 = null;
            }
            return new UntypedObjectDeserializer(javaType_findRemappedType, javaType_findRemappedType2);
        }
        if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_SEQUENCE) {
            return StringDeserializer.instance;
        }
        Class<?> cls = CLASS_ITERABLE;
        if (rawClass == cls) {
            TypeFactory typeFactory = deserializationContext.getTypeFactory();
            JavaType[] javaTypeArrFindTypeParameters = typeFactory.findTypeParameters(javaType, cls);
            return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType(Collection.class, (javaTypeArrFindTypeParameters == null || javaTypeArrFindTypeParameters.length != 1) ? TypeFactory.unknownType() : javaTypeArrFindTypeParameters[0]), beanDescription);
        }
        if (rawClass == CLASS_MAP_ENTRY) {
            JavaType javaTypeContainedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
            JavaType javaTypeContainedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
            TypeDeserializer typeDeserializerFindTypeDeserializer = (TypeDeserializer) javaTypeContainedTypeOrUnknown2.getTypeHandler();
            if (typeDeserializerFindTypeDeserializer == null) {
                typeDeserializerFindTypeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), javaTypeContainedTypeOrUnknown2);
            }
            return new MapEntryDeserializer(javaType, (KeyDeserializer) javaTypeContainedTypeOrUnknown.getValueHandler(), (JsonDeserializer<Object>) javaTypeContainedTypeOrUnknown2.getValueHandler(), typeDeserializerFindTypeDeserializer);
        }
        String name = rawClass.getName();
        if (rawClass.isPrimitive() || name.startsWith("java.")) {
            JsonDeserializer<?> jsonDeserializerFind = NumberDeserializers.find(rawClass, name);
            if (jsonDeserializerFind == null) {
                jsonDeserializerFind = DateDeserializers.find(rawClass, name);
            }
            if (jsonDeserializerFind != null) {
                return jsonDeserializerFind;
            }
        }
        if (rawClass == TokenBuffer.class) {
            return new TokenBufferDeserializer();
        }
        JsonDeserializer<?> jsonDeserializerFindOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
        return jsonDeserializerFindOptionalStdDeserializer != null ? jsonDeserializerFindOptionalStdDeserializer : JdkDeserializers.find(deserializationContext, rawClass, name);
    }

    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        Object objFindDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindDeserializer = annotationIntrospector.findDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, objFindDeserializer);
    }

    public KeyDeserializer findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        Object objFindKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(annotated, objFindKeyDeserializer);
    }

    public JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), beanDescription);
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        return typeResolverBuilderFindPropertyContentTypeResolver == null ? findTypeDeserializer(deserializationConfig, contentType) : typeResolverBuilderFindPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> typeResolverBuilderFindPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (typeResolverBuilderFindPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        try {
            return typeResolverBuilderFindPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw InvalidDefinitionException.from((JsonParser) null, ClassUtil.exceptionMessage(e), javaType).withCause(e);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeMapAbstractType;
        AnnotatedClass classInfo = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> typeResolverBuilderFindTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, classInfo, javaType);
        if (typeResolverBuilderFindTypeResolver == null && (typeResolverBuilderFindTypeResolver = deserializationConfig.getDefaultTyper(javaType)) == null) {
            return null;
        }
        Collection<NamedType> collectionCollectAndResolveSubtypesByTypeId = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, classInfo);
        if (typeResolverBuilderFindTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (javaTypeMapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && !javaTypeMapAbstractType.hasRawClass(javaType.getRawClass())) {
            typeResolverBuilderFindTypeResolver = typeResolverBuilderFindTypeResolver.withDefaultImpl(javaTypeMapAbstractType.getRawClass());
        }
        try {
            return typeResolverBuilderFindTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collectionCollectAndResolveSubtypesByTypeId);
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw InvalidDefinitionException.from((JsonParser) null, ClassUtil.exceptionMessage(e), javaType).withCause(e);
        }
    }

    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedClass classInfo = beanDescription.getClassInfo();
        Object objFindValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        ValueInstantiator valueInstantiator_valueInstantiatorInstance = objFindValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, objFindValueInstantiator) : null;
        if (valueInstantiator_valueInstantiatorInstance == null && (valueInstantiator_valueInstantiatorInstance = JDKValueInstantiators.findStdValueInstantiator(config, beanDescription.getBeanClass())) == null) {
            valueInstantiator_valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            for (ValueInstantiators valueInstantiators : this._factoryConfig.valueInstantiators()) {
                valueInstantiator_valueInstantiatorInstance = valueInstantiators.findValueInstantiator(config, beanDescription, valueInstantiator_valueInstantiatorInstance);
                if (valueInstantiator_valueInstantiatorInstance == null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", valueInstantiators.getClass().getName());
                }
            }
        }
        return valueInstantiator_valueInstantiatorInstance != null ? valueInstantiator_valueInstantiatorInstance.createContextual(deserializationContext, beanDescription) : valueInstantiator_valueInstantiatorInstance;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) {
        JavaType javaType_mapAbstractType2;
        while (true) {
            javaType_mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (javaType_mapAbstractType2 == null) {
                return javaType;
            }
            Class<?> rawClass = javaType.getRawClass();
            Class<?> rawClass2 = javaType_mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
                break;
            }
            javaType = javaType_mapAbstractType2;
        }
        q6.l("Invalid abstract type resolution from ", javaType, " to ", javaType_mapAbstractType2, ": latter is not a subtype of former");
        return null;
    }

    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) {
        KeyDeserializer keyDeserializerKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && javaType.getKeyType() != null && (keyDeserializerKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember))) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerKeyDeserializerInstance);
            javaType.getKeyType();
        }
        if (javaType.hasContentType()) {
            JsonDeserializer<Object> jsonDeserializerDeserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (jsonDeserializerDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(jsonDeserializerDeserializerInstance);
            }
            TypeDeserializer typeDeserializerFindPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (typeDeserializerFindPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(typeDeserializerFindPropertyContentTypeDeserializer);
            }
        }
        TypeDeserializer typeDeserializerFindPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (typeDeserializerFindPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(typeDeserializerFindPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }
}
