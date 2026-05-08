package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import defpackage.l5;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectWriter implements Serializable {
    protected static final PrettyPrinter NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
    private static final long serialVersionUID = 1;
    protected final SerializationConfig _config;
    protected final JsonFactory _generatorFactory;
    protected final GeneratorSettings _generatorSettings;
    protected final Prefetch _prefetch;
    protected final SerializerFactory _serializerFactory;
    protected final DefaultSerializerProvider _serializerProvider;

    public static final class Prefetch implements Serializable {
        public static final Prefetch empty = new Prefetch(null, null, null);
        private static final long serialVersionUID = 1;
        private final JavaType rootType;
        private final TypeSerializer typeSerializer;
        private final JsonSerializer<Object> valueSerializer;

        private Prefetch(JavaType javaType, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer) {
            this.rootType = javaType;
            this.valueSerializer = jsonSerializer;
            this.typeSerializer = typeSerializer;
        }

        public Prefetch forRootType(ObjectWriter objectWriter, JavaType javaType) {
            JavaType javaType2 = this.rootType;
            if (javaType == null) {
                if (javaType2 != null && this.valueSerializer != null) {
                    return new Prefetch(null, null, null);
                }
            } else if (!javaType.equals(javaType2)) {
                if (javaType.isJavaLangObject()) {
                    try {
                        return new Prefetch(null, null, objectWriter._serializerProvider().findTypeSerializer(javaType));
                    } catch (JsonMappingException e) {
                        throw new RuntimeJsonMappingException(e);
                    }
                }
                if (objectWriter.isEnabled(SerializationFeature.EAGER_SERIALIZER_FETCH)) {
                    try {
                        JsonSerializer<Object> jsonSerializerFindTypedValueSerializer = objectWriter._serializerProvider().findTypedValueSerializer(javaType, true, (BeanProperty) null);
                        return jsonSerializerFindTypedValueSerializer instanceof TypeWrappedSerializer ? new Prefetch(javaType, null, ((TypeWrappedSerializer) jsonSerializerFindTypedValueSerializer).typeSerializer()) : new Prefetch(javaType, jsonSerializerFindTypedValueSerializer, null);
                    } catch (DatabindException unused) {
                    }
                }
                return new Prefetch(javaType, null, this.typeSerializer);
            }
            return this;
        }

        public void serialize(JsonGenerator jsonGenerator, Object obj, DefaultSerializerProvider defaultSerializerProvider) {
            TypeSerializer typeSerializer = this.typeSerializer;
            if (typeSerializer != null) {
                defaultSerializerProvider.serializePolymorphic(jsonGenerator, obj, this.rootType, this.valueSerializer, typeSerializer);
                return;
            }
            JsonSerializer<Object> jsonSerializer = this.valueSerializer;
            JavaType javaType = this.rootType;
            if (jsonSerializer != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, javaType, jsonSerializer);
            } else if (javaType != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, javaType);
            } else {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj);
            }
        }
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, JavaType javaType, PrettyPrinter prettyPrinter) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = prettyPrinter == null ? GeneratorSettings.empty : new GeneratorSettings(prettyPrinter, null, null, null);
        if (javaType == null) {
            this._prefetch = Prefetch.empty;
        } else if (javaType.hasRawClass(Object.class)) {
            this._prefetch = Prefetch.empty.forRootType(this, javaType);
        } else {
            this._prefetch = Prefetch.empty.forRootType(this, javaType.withStaticTyping());
        }
    }

    private final void _writeCloseable(JsonGenerator jsonGenerator, Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj != null) {
            return;
        }
        l5.q(l5.m("argument \"", str, "\" is null"));
    }

    public final JsonGenerator _configureGenerator(JsonGenerator jsonGenerator) {
        this._config.initialize(jsonGenerator);
        this._generatorSettings.initialize(jsonGenerator);
        return jsonGenerator;
    }

    public ObjectWriter _new(GeneratorSettings generatorSettings, Prefetch prefetch) {
        return (this._generatorSettings == generatorSettings && this._prefetch == prefetch) ? this : new ObjectWriter(this, this._config, generatorSettings, prefetch);
    }

    public DefaultSerializerProvider _serializerProvider() {
        return this._serializerProvider.createInstance(this._config, this._serializerFactory);
    }

    public final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        if (this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseable(jsonGenerator, obj);
            return;
        }
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            jsonGenerator.close();
        } catch (Exception e) {
            ClassUtil.closeOnFailAndThrowAsIOE(jsonGenerator, e);
        }
    }

    public JsonGenerator createGenerator(Writer writer) {
        _assertNotNull("w", writer);
        return _configureGenerator(this._generatorFactory.createGenerator(writer));
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public ObjectWriter with(PrettyPrinter prettyPrinter) {
        return _new(this._generatorSettings.with(prettyPrinter), this._prefetch);
    }

    public ObjectWriter withDefaultPrettyPrinter() {
        return with(this._config.getDefaultPrettyPrinter());
    }

    public String writeValueAsString(Object obj) {
        BufferRecycler bufferRecycler_getBufferRecycler = this._generatorFactory._getBufferRecycler();
        try {
            try {
                SegmentedStringWriter segmentedStringWriter = new SegmentedStringWriter(bufferRecycler_getBufferRecycler);
                try {
                    _writeValueAndClose(createGenerator(segmentedStringWriter), obj);
                    String andClear = segmentedStringWriter.getAndClear();
                    segmentedStringWriter.close();
                    return andClear;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            segmentedStringWriter.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (JsonProcessingException e) {
                throw e;
            } catch (IOException e2) {
                throw JsonMappingException.fromUnexpectedIOE(e2);
            }
        } finally {
            bufferRecycler_getBufferRecycler.releaseToPool();
        }
    }

    public ObjectWriter with(CharacterEscapes characterEscapes) {
        return _new(this._generatorSettings.with(characterEscapes), this._prefetch);
    }

    public static final class GeneratorSettings implements Serializable {
        public static final GeneratorSettings empty = new GeneratorSettings(null, null, null, null);
        private static final long serialVersionUID = 1;
        public final CharacterEscapes characterEscapes;
        public final PrettyPrinter prettyPrinter;
        public final SerializableString rootValueSeparator;
        public final FormatSchema schema;

        public GeneratorSettings(PrettyPrinter prettyPrinter, FormatSchema formatSchema, CharacterEscapes characterEscapes, SerializableString serializableString) {
            this.prettyPrinter = prettyPrinter;
            this.rootValueSeparator = serializableString;
        }

        public void initialize(JsonGenerator jsonGenerator) {
            PrettyPrinter prettyPrinter = this.prettyPrinter;
            if (prettyPrinter != null) {
                if (prettyPrinter == ObjectWriter.NULL_PRETTY_PRINTER) {
                    jsonGenerator.setPrettyPrinter(null);
                } else {
                    if (prettyPrinter instanceof Instantiatable) {
                        prettyPrinter = (PrettyPrinter) ((Instantiatable) prettyPrinter).createInstance();
                    }
                    jsonGenerator.setPrettyPrinter(prettyPrinter);
                }
            }
            SerializableString serializableString = this.rootValueSeparator;
            if (serializableString != null) {
                jsonGenerator.setRootValueSeparator(serializableString);
            }
        }

        public GeneratorSettings with(PrettyPrinter prettyPrinter) {
            if (prettyPrinter == null) {
                prettyPrinter = ObjectWriter.NULL_PRETTY_PRINTER;
            }
            return prettyPrinter == this.prettyPrinter ? this : new GeneratorSettings(prettyPrinter, null, null, this.rootValueSeparator);
        }

        public GeneratorSettings with(CharacterEscapes characterEscapes) {
            return this;
        }
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = GeneratorSettings.empty;
        this._prefetch = Prefetch.empty;
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, FormatSchema formatSchema) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = formatSchema == null ? GeneratorSettings.empty : new GeneratorSettings(null, formatSchema, null, null);
        this._prefetch = Prefetch.empty;
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig, GeneratorSettings generatorSettings, Prefetch prefetch) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = objectWriter._generatorFactory;
        this._generatorSettings = generatorSettings;
        this._prefetch = prefetch;
    }
}
