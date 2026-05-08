package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jdk14.JDK14Util;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class POJOPropertiesCollector {
    protected final AccessorNamingStrategy _accessorNaming;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected LinkedList<AnnotatedMember> _anyGetterField;
    protected LinkedList<AnnotatedMember> _anyGetters;
    protected LinkedList<AnnotatedMember> _anySetterField;
    protected LinkedList<AnnotatedMethod> _anySetters;
    protected final AnnotatedClass _classDef;
    protected boolean _collected;
    protected final MapperConfig<?> _config;
    protected LinkedList<POJOPropertyBuilder> _creatorProperties;
    protected Map<PropertyName, PropertyName> _fieldRenameMappings;
    protected final boolean _forSerialization;
    protected JsonFormat.Value _formatOverrides;
    protected HashSet<String> _ignoredPropertyNames;
    protected LinkedHashMap<Object, AnnotatedMember> _injectables;
    protected final boolean _isRecordType;
    protected LinkedList<AnnotatedMember> _jsonKeyAccessors;
    protected LinkedList<AnnotatedMember> _jsonValueAccessors;

    @Deprecated
    protected String _mutatorPrefix = "set";
    protected LinkedHashMap<String, POJOPropertyBuilder> _properties;

    @Deprecated
    protected final boolean _stdBeanNaming;
    protected final JavaType _type;
    protected final boolean _useAnnotations;
    protected final VisibilityChecker<?> _visibilityChecker;

    public POJOPropertiesCollector(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, AnnotatedClass annotatedClass, AccessorNamingStrategy accessorNamingStrategy) {
        this._config = mapperConfig;
        this._forSerialization = z;
        this._type = javaType;
        this._classDef = annotatedClass;
        this._isRecordType = javaType.isRecordType();
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this._useAnnotations = true;
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        } else {
            this._useAnnotations = false;
            this._annotationIntrospector = AnnotationIntrospector.nopInstance();
        }
        this._visibilityChecker = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), annotatedClass);
        this._accessorNaming = accessorNamingStrategy;
        this._stdBeanNaming = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
    }

    private void _addCreatorParam(Map<String, POJOPropertyBuilder> map, AnnotatedParameter annotatedParameter, String str) {
        String strFindImplicitPropertyName;
        if (str != null) {
            strFindImplicitPropertyName = str;
        } else {
            strFindImplicitPropertyName = this._annotationIntrospector.findImplicitPropertyName(annotatedParameter);
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = "";
            }
        }
        PropertyName propertyNameFindNameForDeserialization = this._annotationIntrospector.findNameForDeserialization(annotatedParameter);
        boolean z = (propertyNameFindNameForDeserialization == null || propertyNameFindNameForDeserialization.isEmpty()) ? false : true;
        if (!z) {
            if (strFindImplicitPropertyName.isEmpty()) {
                return;
            }
            JsonCreator.Mode modeFindCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedParameter.getOwner());
            boolean z2 = str != null;
            if ((modeFindCreatorAnnotation == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED || modeFindCreatorAnnotation == JsonCreator.Mode.DELEGATING) && !z2) {
                return;
            } else {
                propertyNameFindNameForDeserialization = PropertyName.construct(strFindImplicitPropertyName);
            }
        }
        PropertyName propertyName = propertyNameFindNameForDeserialization;
        String str_checkRenameByField = _checkRenameByField(strFindImplicitPropertyName);
        POJOPropertyBuilder pOJOPropertyBuilder_property = (z && str_checkRenameByField.isEmpty()) ? _property(map, propertyName) : _property(map, str_checkRenameByField);
        pOJOPropertyBuilder_property.addCtor(annotatedParameter, propertyName, z, true, false);
        this._creatorProperties.add(pOJOPropertyBuilder_property);
    }

    private boolean _anyIndexed(Collection<POJOPropertyBuilder> collection) {
        Iterator<POJOPropertyBuilder> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().getMetadata().hasIndex()) {
                return true;
            }
        }
        return false;
    }

    private String _checkRenameByField(String str) {
        PropertyName propertyName;
        Map<PropertyName, PropertyName> map = this._fieldRenameMappings;
        return (map == null || (propertyName = map.get(_propNameFromSimple(str))) == null) ? str : propertyName.getSimpleName();
    }

    private PropertyNamingStrategy _findNamingStrategy() {
        Object objFindNamingStrategy = this._annotationIntrospector.findNamingStrategy(this._classDef);
        if (objFindNamingStrategy == null) {
            return this._config.getPropertyNamingStrategy();
        }
        if (objFindNamingStrategy instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) objFindNamingStrategy;
        }
        if (!(objFindNamingStrategy instanceof Class)) {
            reportProblem("AnnotationIntrospector returned PropertyNamingStrategy definition of type %s; expected type `PropertyNamingStrategy` or `Class<PropertyNamingStrategy>` instead", ClassUtil.classNameOf(objFindNamingStrategy));
        }
        Class cls = (Class) objFindNamingStrategy;
        if (cls == PropertyNamingStrategy.class) {
            return null;
        }
        if (!PropertyNamingStrategy.class.isAssignableFrom(cls)) {
            reportProblem("AnnotationIntrospector returned Class %s; expected `Class<PropertyNamingStrategy>`", ClassUtil.classNameOf(cls));
        }
        this._config.getHandlerInstantiator();
        return (PropertyNamingStrategy) ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers());
    }

    private PropertyName _propNameFromSimple(String str) {
        return PropertyName.construct(str, null);
    }

    public void _addCreators(Map<String, POJOPropertyBuilder> map) {
        ArrayList arrayList;
        AnnotatedConstructor annotatedConstructorFindRecordConstructor;
        if (this._useAnnotations) {
            for (AnnotatedConstructor annotatedConstructor : this._classDef.getConstructors()) {
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList<>();
                }
                int parameterCount = annotatedConstructor.getParameterCount();
                for (int i = 0; i < parameterCount; i++) {
                    _addCreatorParam(map, annotatedConstructor.getParameter(i));
                }
            }
            for (AnnotatedMethod annotatedMethod : this._classDef.getFactoryMethods()) {
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList<>();
                }
                int parameterCount2 = annotatedMethod.getParameterCount();
                for (int i2 = 0; i2 < parameterCount2; i2++) {
                    _addCreatorParam(map, annotatedMethod.getParameter(i2));
                }
            }
        }
        if (!isRecordType() || (annotatedConstructorFindRecordConstructor = JDK14Util.findRecordConstructor(this._classDef, this._annotationIntrospector, this._config, (arrayList = new ArrayList()))) == null) {
            return;
        }
        if (this._creatorProperties == null) {
            this._creatorProperties = new LinkedList<>();
        }
        HashSet hashSet = new HashSet();
        Iterator<POJOPropertyBuilder> it = this._creatorProperties.iterator();
        while (it.hasNext()) {
            Iterator<AnnotatedParameter> constructorParameters = it.next().getConstructorParameters();
            while (constructorParameters.hasNext()) {
                AnnotatedParameter next = constructorParameters.next();
                if (next.getOwner().equals(annotatedConstructorFindRecordConstructor)) {
                    hashSet.add(next);
                }
            }
        }
        if (this._creatorProperties.isEmpty() || !hashSet.isEmpty()) {
            for (int i3 = 0; i3 < annotatedConstructorFindRecordConstructor.getParameterCount(); i3++) {
                AnnotatedParameter parameter = annotatedConstructorFindRecordConstructor.getParameter(i3);
                if (!hashSet.contains(parameter)) {
                    _addCreatorParam(map, parameter, (String) arrayList.get(i3));
                }
            }
        }
    }

    public void _addFields(Map<String, POJOPropertyBuilder> map) {
        boolean z;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        boolean z2 = (this._forSerialization || this._config.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean zIsEnabled = this._config.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField annotatedField : this._classDef.fields()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAsKey(this._config, annotatedField))) {
                if (this._jsonKeyAccessors == null) {
                    this._jsonKeyAccessors = new LinkedList<>();
                }
                this._jsonKeyAccessors.add(annotatedField);
            }
            if (bool.equals(annotationIntrospector.hasAsValue(annotatedField))) {
                if (this._jsonValueAccessors == null) {
                    this._jsonValueAccessors = new LinkedList<>();
                }
                this._jsonValueAccessors.add(annotatedField);
            } else {
                boolean zEquals = bool.equals(annotationIntrospector.hasAnyGetter(annotatedField));
                boolean zEquals2 = bool.equals(annotationIntrospector.hasAnySetter(annotatedField));
                if (zEquals || zEquals2) {
                    if (zEquals) {
                        if (this._anyGetterField == null) {
                            this._anyGetterField = new LinkedList<>();
                        }
                        this._anyGetterField.add(annotatedField);
                    }
                    if (zEquals2) {
                        if (this._anySetterField == null) {
                            this._anySetterField = new LinkedList<>();
                        }
                        this._anySetterField.add(annotatedField);
                    }
                } else {
                    String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedField);
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = annotatedField.getName();
                    }
                    String strModifyFieldName = this._accessorNaming.modifyFieldName(annotatedField, strFindImplicitPropertyName);
                    if (strModifyFieldName != null) {
                        PropertyName propertyName_propNameFromSimple = _propNameFromSimple(strModifyFieldName);
                        PropertyName propertyNameFindRenameByField = annotationIntrospector.findRenameByField(this._config, annotatedField, propertyName_propNameFromSimple);
                        if (propertyNameFindRenameByField != null && !propertyNameFindRenameByField.equals(propertyName_propNameFromSimple)) {
                            if (this._fieldRenameMappings == null) {
                                this._fieldRenameMappings = new HashMap();
                            }
                            this._fieldRenameMappings.put(propertyNameFindRenameByField, propertyName_propNameFromSimple);
                        }
                        PropertyName propertyNameFindNameForSerialization = this._forSerialization ? annotationIntrospector.findNameForSerialization(annotatedField) : annotationIntrospector.findNameForDeserialization(annotatedField);
                        boolean z3 = propertyNameFindNameForSerialization != null;
                        if (z3 && propertyNameFindNameForSerialization.isEmpty()) {
                            propertyNameFindNameForSerialization = _propNameFromSimple(strModifyFieldName);
                            z = false;
                        } else {
                            z = z3;
                        }
                        boolean zIsFieldVisible = propertyNameFindNameForSerialization != null;
                        if (!zIsFieldVisible) {
                            zIsFieldVisible = this._visibilityChecker.isFieldVisible(annotatedField);
                        }
                        boolean zHasIgnoreMarker = annotationIntrospector.hasIgnoreMarker(annotatedField);
                        if (annotatedField.isTransient() && !z3) {
                            if (zIsEnabled) {
                                zHasIgnoreMarker = true;
                            } else if (!zHasIgnoreMarker) {
                            }
                        }
                        if (!z2 || propertyNameFindNameForSerialization != null || zHasIgnoreMarker || !Modifier.isFinal(annotatedField.getModifiers())) {
                            _property(map, strModifyFieldName).addField(annotatedField, propertyNameFindNameForSerialization, z, zIsFieldVisible, zHasIgnoreMarker);
                        }
                    }
                }
            }
        }
    }

    public void _addGetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        boolean z;
        boolean z2;
        String strFindImplicitPropertyName;
        boolean zIsGetterVisible;
        Class<?> rawReturnType = annotatedMethod.getRawReturnType();
        if (rawReturnType != Void.TYPE) {
            if (rawReturnType != Void.class || this._config.isEnabled(MapperFeature.ALLOW_VOID_VALUED_PROPERTIES)) {
                Boolean bool = Boolean.TRUE;
                if (bool.equals(annotationIntrospector.hasAnyGetter(annotatedMethod))) {
                    if (this._anyGetters == null) {
                        this._anyGetters = new LinkedList<>();
                    }
                    this._anyGetters.add(annotatedMethod);
                    return;
                }
                if (bool.equals(annotationIntrospector.hasAsKey(this._config, annotatedMethod))) {
                    if (this._jsonKeyAccessors == null) {
                        this._jsonKeyAccessors = new LinkedList<>();
                    }
                    this._jsonKeyAccessors.add(annotatedMethod);
                    return;
                }
                if (bool.equals(annotationIntrospector.hasAsValue(annotatedMethod))) {
                    if (this._jsonValueAccessors == null) {
                        this._jsonValueAccessors = new LinkedList<>();
                    }
                    this._jsonValueAccessors.add(annotatedMethod);
                    return;
                }
                PropertyName propertyNameFindNameForSerialization = annotationIntrospector.findNameForSerialization(annotatedMethod);
                boolean z3 = false;
                boolean z4 = propertyNameFindNameForSerialization != null;
                if (z4) {
                    String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (strFindImplicitPropertyName2 == null && (strFindImplicitPropertyName2 = this._accessorNaming.findNameForRegularGetter(annotatedMethod, annotatedMethod.getName())) == null) {
                        strFindImplicitPropertyName2 = this._accessorNaming.findNameForIsGetter(annotatedMethod, annotatedMethod.getName());
                    }
                    if (strFindImplicitPropertyName2 == null) {
                        strFindImplicitPropertyName2 = annotatedMethod.getName();
                    }
                    if (propertyNameFindNameForSerialization.isEmpty()) {
                        propertyNameFindNameForSerialization = _propNameFromSimple(strFindImplicitPropertyName2);
                    } else {
                        z3 = z4;
                    }
                    propertyName = propertyNameFindNameForSerialization;
                    z = z3;
                    z2 = true;
                    strFindImplicitPropertyName = strFindImplicitPropertyName2;
                } else {
                    strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = this._accessorNaming.findNameForRegularGetter(annotatedMethod, annotatedMethod.getName());
                    }
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = this._accessorNaming.findNameForIsGetter(annotatedMethod, annotatedMethod.getName());
                        if (strFindImplicitPropertyName == null) {
                            return;
                        } else {
                            zIsGetterVisible = this._visibilityChecker.isIsGetterVisible(annotatedMethod);
                        }
                    } else {
                        zIsGetterVisible = this._visibilityChecker.isGetterVisible(annotatedMethod);
                    }
                    propertyName = propertyNameFindNameForSerialization;
                    z2 = zIsGetterVisible;
                    z = z4;
                }
                _property(map, _checkRenameByField(strFindImplicitPropertyName)).addGetter(annotatedMethod, propertyName, z, z2, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
            }
        }
    }

    public void _addInjectables(Map<String, POJOPropertyBuilder> map) {
        for (AnnotatedMember annotatedMember : this._classDef.fields()) {
            _doAddInjectable(this._annotationIntrospector.findInjectableValue(annotatedMember), annotatedMember);
        }
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            if (annotatedMethod.getParameterCount() == 1) {
                _doAddInjectable(this._annotationIntrospector.findInjectableValue(annotatedMethod), annotatedMethod);
            }
        }
    }

    public void _addMethods(Map<String, POJOPropertyBuilder> map) {
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount == 0) {
                _addGetterMethod(map, annotatedMethod, this._annotationIntrospector);
            } else if (parameterCount == 1) {
                _addSetterMethod(map, annotatedMethod, this._annotationIntrospector);
            } else if (parameterCount == 2 && Boolean.TRUE.equals(this._annotationIntrospector.hasAnySetter(annotatedMethod))) {
                if (this._anySetters == null) {
                    this._anySetters = new LinkedList<>();
                }
                this._anySetters.add(annotatedMethod);
            }
        }
    }

    public void _addSetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        boolean z;
        String strFindImplicitPropertyName;
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean z2 = false;
        boolean zIsSetterVisible = true;
        boolean z3 = propertyNameFindNameForDeserialization != null;
        if (z3) {
            String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = this._accessorNaming.findNameForMutator(annotatedMethod, annotatedMethod.getName());
            }
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = annotatedMethod.getName();
            }
            if (propertyNameFindNameForDeserialization.isEmpty()) {
                propertyNameFindNameForDeserialization = _propNameFromSimple(strFindImplicitPropertyName2);
            } else {
                z2 = z3;
            }
            z = z2;
            strFindImplicitPropertyName = strFindImplicitPropertyName2;
        } else {
            strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = this._accessorNaming.findNameForMutator(annotatedMethod, annotatedMethod.getName());
            }
            if (strFindImplicitPropertyName == null) {
                return;
            }
            zIsSetterVisible = this._visibilityChecker.isSetterVisible(annotatedMethod);
            z = z3;
        }
        PropertyName propertyName = propertyNameFindNameForDeserialization;
        boolean z4 = zIsSetterVisible;
        _property(map, _checkRenameByField(strFindImplicitPropertyName)).addSetter(annotatedMethod, propertyName, z, z4, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
    }

    public void _collectIgnorals(String str) {
        if (this._forSerialization || str == null) {
            return;
        }
        if (this._ignoredPropertyNames == null) {
            this._ignoredPropertyNames = new HashSet<>();
        }
        this._ignoredPropertyNames.add(str);
    }

    public void _doAddInjectable(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value == null) {
            return;
        }
        Object id = value.getId();
        if (this._injectables == null) {
            this._injectables = new LinkedHashMap<>();
        }
        AnnotatedMember annotatedMemberPut = this._injectables.put(id, annotatedMember);
        if (annotatedMemberPut == null || annotatedMemberPut.getClass() != annotatedMember.getClass()) {
            return;
        }
        reportProblem("Duplicate injectable value with id '%s' (of type %s)", id, ClassUtil.classNameOf(id));
    }

    public POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, PropertyName propertyName) {
        String simpleName = propertyName.getSimpleName();
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(simpleName);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, propertyName);
        map.put(simpleName, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }

    public void _removeUnwantedAccessor(Map<String, POJOPropertyBuilder> map) {
        boolean z = !isRecordType() && this._config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().removeNonVisible(z, this._forSerialization ? null : this);
        }
    }

    public void _removeUnwantedProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            POJOPropertyBuilder next = it.next();
            if (!next.anyVisible()) {
                it.remove();
            } else if (next.anyIgnorals()) {
                if (isRecordType() && !this._forSerialization) {
                    next.removeIgnored();
                    _collectIgnorals(next.getName());
                } else if (next.anyExplicitsWithoutIgnoral()) {
                    next.removeIgnored();
                    if (!next.couldDeserialize()) {
                        _collectIgnorals(next.getName());
                    }
                } else {
                    it.remove();
                    _collectIgnorals(next.getName());
                }
            }
        }
    }

    public void _renameProperties(Map<String, POJOPropertyBuilder> map) {
        HashSet<String> hashSet;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList<POJOPropertyBuilder> linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            Set<PropertyName> setFindExplicitNames = value.findExplicitNames();
            if (!setFindExplicitNames.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (setFindExplicitNames.size() == 1) {
                    linkedList.add(value.withName(setFindExplicitNames.iterator().next()));
                } else {
                    linkedList.addAll(value.explode(setFindExplicitNames));
                }
            }
        }
        if (linkedList != null) {
            for (POJOPropertyBuilder pOJOPropertyBuilder : linkedList) {
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
                if (_replaceCreatorProperty(pOJOPropertyBuilder, this._creatorProperties) && (hashSet = this._ignoredPropertyNames) != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void _renameUsing(java.util.Map<java.lang.String, com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder> r9, com.fasterxml.jackson.databind.PropertyNamingStrategy r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector._renameUsing(java.util.Map, com.fasterxml.jackson.databind.PropertyNamingStrategy):void");
    }

    public void _renameWithWrappers(Map<String, POJOPropertyBuilder> map) {
        PropertyName propertyNameFindWrapperName;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList<POJOPropertyBuilder> linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            AnnotatedMember primaryMember = value.getPrimaryMember();
            if (primaryMember != null && (propertyNameFindWrapperName = this._annotationIntrospector.findWrapperName(primaryMember)) != null && propertyNameFindWrapperName.hasSimpleName() && !propertyNameFindWrapperName.equals(value.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.withName(propertyNameFindWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            for (POJOPropertyBuilder pOJOPropertyBuilder : linkedList) {
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
            }
        }
    }

    public boolean _replaceCreatorProperty(POJOPropertyBuilder pOJOPropertyBuilder, List<POJOPropertyBuilder> list) {
        if (list != null) {
            String internalName = pOJOPropertyBuilder.getInternalName();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).getInternalName().equals(internalName)) {
                    list.set(i, pOJOPropertyBuilder);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean _resolveFieldVsGetter(List<AnnotatedMember> list) {
        do {
            AnnotatedMember annotatedMember = list.get(0);
            AnnotatedMember annotatedMember2 = list.get(1);
            if (annotatedMember instanceof AnnotatedField) {
                if (!(annotatedMember2 instanceof AnnotatedMethod)) {
                    return false;
                }
                list.remove(0);
            } else {
                if (!(annotatedMember instanceof AnnotatedMethod) || !(annotatedMember2 instanceof AnnotatedField)) {
                    return false;
                }
                list.remove(1);
            }
        } while (list.size() > 1);
        return true;
    }

    public void _sortProperties(Map<String, POJOPropertyBuilder> map) {
        Collection<POJOPropertyBuilder> collectionValues;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        Boolean boolFindSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this._classDef);
        boolean zShouldSortPropertiesAlphabetically = boolFindSerializationSortAlphabetically == null ? this._config.shouldSortPropertiesAlphabetically() : boolFindSerializationSortAlphabetically.booleanValue();
        boolean z_anyIndexed = _anyIndexed(map.values());
        String[] strArrFindSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this._classDef);
        if (zShouldSortPropertiesAlphabetically || z_anyIndexed || this._creatorProperties != null || strArrFindSerializationPropertyOrder != null) {
            int size = map.size();
            Map<? extends Object, ? extends Object> treeMap = zShouldSortPropertiesAlphabetically ? new TreeMap<>() : new LinkedHashMap<>(size + size);
            for (POJOPropertyBuilder pOJOPropertyBuilder : map.values()) {
                treeMap.put(pOJOPropertyBuilder.getName(), pOJOPropertyBuilder);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
            if (strArrFindSerializationPropertyOrder != null) {
                for (String name : strArrFindSerializationPropertyOrder) {
                    POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) treeMap.remove(name);
                    if (pOJOPropertyBuilder2 == null) {
                        Iterator<POJOPropertyBuilder> it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            POJOPropertyBuilder next = it.next();
                            if (name.equals(next.getInternalName())) {
                                name = next.getName();
                                pOJOPropertyBuilder2 = next;
                                break;
                            }
                        }
                    }
                    if (pOJOPropertyBuilder2 != null) {
                        linkedHashMap.put(name, pOJOPropertyBuilder2);
                    }
                }
            }
            if (z_anyIndexed) {
                TreeMap treeMap2 = new TreeMap();
                Iterator<Map.Entry<? extends Object, ? extends Object>> it2 = treeMap.entrySet().iterator();
                while (it2.hasNext()) {
                    POJOPropertyBuilder pOJOPropertyBuilder3 = (POJOPropertyBuilder) it2.next().getValue();
                    Integer index = pOJOPropertyBuilder3.getMetadata().getIndex();
                    if (index != null) {
                        treeMap2.put(index, pOJOPropertyBuilder3);
                        it2.remove();
                    }
                }
                for (POJOPropertyBuilder pOJOPropertyBuilder4 : treeMap2.values()) {
                    linkedHashMap.put(pOJOPropertyBuilder4.getName(), pOJOPropertyBuilder4);
                }
            }
            if (this._creatorProperties != null && (!zShouldSortPropertiesAlphabetically || this._config.isEnabled(MapperFeature.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (zShouldSortPropertiesAlphabetically) {
                    TreeMap treeMap3 = new TreeMap();
                    for (POJOPropertyBuilder pOJOPropertyBuilder5 : this._creatorProperties) {
                        treeMap3.put(pOJOPropertyBuilder5.getName(), pOJOPropertyBuilder5);
                    }
                    collectionValues = treeMap3.values();
                } else {
                    collectionValues = this._creatorProperties;
                }
                for (POJOPropertyBuilder pOJOPropertyBuilder6 : collectionValues) {
                    String name2 = pOJOPropertyBuilder6.getName();
                    if (treeMap.containsKey(name2)) {
                        linkedHashMap.put(name2, pOJOPropertyBuilder6);
                    }
                }
            }
            linkedHashMap.putAll(treeMap);
            map.clear();
            map.putAll(linkedHashMap);
        }
    }

    public void collectAll() {
        LinkedHashMap<String, POJOPropertyBuilder> linkedHashMap = new LinkedHashMap<>();
        boolean zIsRecordType = isRecordType();
        if (!zIsRecordType || this._forSerialization) {
            _addFields(linkedHashMap);
        }
        _addMethods(linkedHashMap);
        if (!this._classDef.isNonStaticInnerClass() && (!this._forSerialization || !zIsRecordType)) {
            _addCreators(linkedHashMap);
        }
        _removeUnwantedProperties(linkedHashMap);
        _removeUnwantedAccessor(linkedHashMap);
        _renameProperties(linkedHashMap);
        _addInjectables(linkedHashMap);
        Iterator<POJOPropertyBuilder> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().mergeAnnotations(this._forSerialization);
        }
        PropertyNamingStrategy propertyNamingStrategy_findNamingStrategy = _findNamingStrategy();
        if (propertyNamingStrategy_findNamingStrategy != null) {
            _renameUsing(linkedHashMap, propertyNamingStrategy_findNamingStrategy);
        }
        Iterator<POJOPropertyBuilder> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().trimByVisibility();
        }
        if (this._config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            _renameWithWrappers(linkedHashMap);
        }
        _sortProperties(linkedHashMap);
        this._properties = linkedHashMap;
        this._collected = true;
    }

    public AnnotatedMember getAnyGetterField() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anyGetterField;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-getter' fields defined (%s vs %s)", this._anyGetterField.get(0), this._anyGetterField.get(1));
        }
        return this._anyGetterField.getFirst();
    }

    public AnnotatedMember getAnyGetterMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anyGetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-getter' methods defined (%s vs %s)", this._anyGetters.get(0), this._anyGetters.get(1));
        }
        return this._anyGetters.getFirst();
    }

    public AnnotatedMember getAnySetterField() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anySetterField;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setter' fields defined (%s vs %s)", this._anySetterField.get(0), this._anySetterField.get(1));
        }
        return this._anySetterField.getFirst();
    }

    public AnnotatedMethod getAnySetterMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMethod> linkedList = this._anySetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem("Multiple 'any-setter' methods defined (%s vs %s)", this._anySetters.get(0), this._anySetters.get(1));
        }
        return this._anySetters.getFirst();
    }

    public AnnotatedClass getClassDef() {
        return this._classDef;
    }

    public MapperConfig<?> getConfig() {
        return this._config;
    }

    public JsonFormat.Value getFormatOverrides() {
        if (this._formatOverrides == null) {
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            JsonFormat.Value valueFindFormat = annotationIntrospector != null ? annotationIntrospector.findFormat(this._classDef) : null;
            JsonFormat.Value defaultPropertyFormat = this._config.getDefaultPropertyFormat(this._type.getRawClass());
            if (defaultPropertyFormat != null) {
                valueFindFormat = valueFindFormat == null ? defaultPropertyFormat : valueFindFormat.withOverrides(defaultPropertyFormat);
            }
            if (valueFindFormat == null) {
                valueFindFormat = JsonFormat.Value.empty();
            }
            this._formatOverrides = valueFindFormat;
        }
        return this._formatOverrides;
    }

    public Set<String> getIgnoredPropertyNames() {
        return this._ignoredPropertyNames;
    }

    public Map<Object, AnnotatedMember> getInjectables() {
        if (!this._collected) {
            collectAll();
        }
        return this._injectables;
    }

    public AnnotatedMember getJsonKeyAccessor() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._jsonKeyAccessors;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !_resolveFieldVsGetter(this._jsonKeyAccessors)) {
            reportProblem("Multiple 'as-key' properties defined (%s vs %s)", this._jsonKeyAccessors.get(0), this._jsonKeyAccessors.get(1));
        }
        return this._jsonKeyAccessors.get(0);
    }

    public AnnotatedMember getJsonValueAccessor() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._jsonValueAccessors;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !_resolveFieldVsGetter(this._jsonValueAccessors)) {
            reportProblem("Multiple 'as-value' properties defined (%s vs %s)", this._jsonValueAccessors.get(0), this._jsonValueAccessors.get(1));
        }
        return this._jsonValueAccessors.get(0);
    }

    public ObjectIdInfo getObjectIdInfo() {
        ObjectIdInfo objectIdInfoFindObjectIdInfo = this._annotationIntrospector.findObjectIdInfo(this._classDef);
        return objectIdInfoFindObjectIdInfo != null ? this._annotationIntrospector.findObjectReferenceInfo(this._classDef, objectIdInfoFindObjectIdInfo) : objectIdInfoFindObjectIdInfo;
    }

    public List<BeanPropertyDefinition> getProperties() {
        return new ArrayList(getPropertyMap().values());
    }

    public Map<String, POJOPropertyBuilder> getPropertyMap() {
        if (!this._collected) {
            collectAll();
        }
        return this._properties;
    }

    public JavaType getType() {
        return this._type;
    }

    public boolean isRecordType() {
        return this._isRecordType;
    }

    public void reportProblem(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this._classDef + ": " + str);
    }

    public POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, String str) {
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(str);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, PropertyName.construct(str));
        map.put(str, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }

    public void _addCreatorParam(Map<String, POJOPropertyBuilder> map, AnnotatedParameter annotatedParameter) {
        _addCreatorParam(map, annotatedParameter, null);
    }
}
