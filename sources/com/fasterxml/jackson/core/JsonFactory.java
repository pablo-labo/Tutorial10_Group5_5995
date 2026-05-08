package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.json.async.NonBlockingJsonParser;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.JacksonFeature;
import com.fasterxml.jackson.core.util.JsonGeneratorDecorator;
import com.fasterxml.jackson.core.util.JsonRecyclerPools;
import com.fasterxml.jackson.core.util.RecyclerPool;
import defpackage.b0;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class JsonFactory extends TokenStreamFactory implements Serializable {
    private static final long serialVersionUID = 2;
    protected final transient ByteQuadsCanonicalizer _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    protected ErrorReportConfiguration _errorReportConfiguration;
    protected int _factoryFeatures;
    protected final List<JsonGeneratorDecorator> _generatorDecorators;
    protected int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    protected int _maximumNonEscapedChar;
    protected ObjectCodec _objectCodec;
    protected OutputDecorator _outputDecorator;
    protected int _parserFeatures;
    protected final char _quoteChar;
    protected RecyclerPool<BufferRecycler> _recyclerPool;
    protected transient CharsToNameCanonicalizer _rootCharSymbols;
    protected SerializableString _rootValueSeparator;
    protected StreamReadConstraints _streamReadConstraints;
    protected StreamWriteConstraints _streamWriteConstraints;
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    public static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");

    public enum Feature implements JacksonFeature {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true),
        CHARSET_DETECTION(true);

        private final boolean _defaultState;

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public boolean enabledIn(int i) {
            return (getMask() & i) != 0;
        }

        @Override // com.fasterxml.jackson.core.util.JacksonFeature
        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory(JsonFactory jsonFactory, ObjectCodec objectCodec) {
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._recyclerPool = jsonFactory._recyclerPool;
        this._objectCodec = objectCodec;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._generatorDecorators = _copy(jsonFactory._generatorDecorators);
        StreamReadConstraints streamReadConstraints = jsonFactory._streamReadConstraints;
        Objects.requireNonNull(streamReadConstraints);
        this._streamReadConstraints = streamReadConstraints;
        StreamWriteConstraints streamWriteConstraints = jsonFactory._streamWriteConstraints;
        Objects.requireNonNull(streamWriteConstraints);
        this._streamWriteConstraints = streamWriteConstraints;
        ErrorReportConfiguration errorReportConfiguration = jsonFactory._errorReportConfiguration;
        Objects.requireNonNull(errorReportConfiguration);
        this._errorReportConfiguration = errorReportConfiguration;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
        this._quoteChar = jsonFactory._quoteChar;
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot(this);
    }

    public static <T> List<T> _copy(List<T> list) {
        return list == null ? list : new ArrayList(list);
    }

    private final boolean _isJSONFactory() {
        return getFormatName() == "JSON";
    }

    private final void _requireJSONFactory(String str) {
        if (!_isJSONFactory()) {
            throw new UnsupportedOperationException(String.format(str, getFormatName()));
        }
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        b0.q("Failed copy(): ", getClass().getName(), " (version: ", version(), ") does not override copy(); it has to");
    }

    public ContentReference _createContentReference(Object obj) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj, this._errorReportConfiguration);
    }

    public IOContext _createContext(ContentReference contentReference, boolean z) {
        BufferRecycler bufferRecycler = null;
        boolean z2 = false;
        if (contentReference == null) {
            contentReference = ContentReference.unknown();
        } else {
            Object rawContent = contentReference.getRawContent();
            if ((rawContent instanceof BufferRecycler.Gettable) && (bufferRecycler = ((BufferRecycler.Gettable) rawContent).bufferRecycler()) != null) {
                z2 = true;
            }
        }
        ContentReference contentReference2 = contentReference;
        if (bufferRecycler == null) {
            bufferRecycler = _getBufferRecycler();
        }
        IOContext iOContext = new IOContext(this._streamReadConstraints, this._streamWriteConstraints, this._errorReportConfiguration, bufferRecycler, contentReference2, z);
        if (z2) {
            iOContext.markBufferRecyclerReleased();
        }
        return iOContext;
    }

    public JsonGenerator _createGenerator(Writer writer, IOContext iOContext) {
        WriterBasedJsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            writerBasedJsonGenerator.setHighestNonEscapedChar(i);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            writerBasedJsonGenerator.setRootValueSeparator(serializableString);
        }
        return _decorate(writerBasedJsonGenerator);
    }

    public IOContext _createNonBlockingContext(Object obj) {
        return new IOContext(this._streamReadConstraints, this._streamWriteConstraints, this._errorReportConfiguration, _getBufferRecycler(), _createContentReference(obj), false);
    }

    public JsonParser _createParser(InputStream inputStream, IOContext iOContext) {
        try {
            return new ByteSourceJsonBootstrapper(iOContext, inputStream).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
        } catch (IOException | RuntimeException e) {
            if (iOContext.isResourceManaged()) {
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
            }
            iOContext.close();
            throw e;
        }
    }

    public JsonGenerator _createUTF8Generator(OutputStream outputStream, IOContext iOContext) {
        UTF8JsonGenerator uTF8JsonGenerator = new UTF8JsonGenerator(iOContext, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            uTF8JsonGenerator.setHighestNonEscapedChar(i);
        }
        SerializableString serializableString = this._rootValueSeparator;
        if (serializableString != DEFAULT_ROOT_VALUE_SEPARATOR) {
            uTF8JsonGenerator.setRootValueSeparator(serializableString);
        }
        return _decorate(uTF8JsonGenerator);
    }

    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, IOContext iOContext) {
        return jsonEncoding == JsonEncoding.UTF8 ? new UTF8Writer(iOContext, outputStream) : new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    public JsonGenerator _decorate(JsonGenerator jsonGenerator) {
        List<JsonGeneratorDecorator> list = this._generatorDecorators;
        if (list != null) {
            Iterator<JsonGeneratorDecorator> it = list.iterator();
            while (it.hasNext()) {
                jsonGenerator = it.next().decorate(this, jsonGenerator);
            }
        }
        return jsonGenerator;
    }

    public BufferRecycler _getBufferRecycler() {
        return (BufferRecycler) _getRecyclerPool().acquireAndLinkPooled();
    }

    public RecyclerPool<BufferRecycler> _getRecyclerPool() {
        return !Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures) ? JsonRecyclerPools.nonRecyclingPool() : this._recyclerPool;
    }

    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canUseCharArrays() {
        return true;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        String formatName;
        return (formatSchema == null || (formatName = getFormatName()) == null || !formatName.equals(formatSchema.getSchemaType())) ? false : true;
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, null);
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) {
        OutputStream outputStream_fileOutputStream = _fileOutputStream(file);
        IOContext iOContext_createContext = _createContext(_createContentReference(outputStream_fileOutputStream), true);
        iOContext_createContext.setEncoding(jsonEncoding);
        return jsonEncoding == JsonEncoding.UTF8 ? _createUTF8Generator(_decorate(outputStream_fileOutputStream, iOContext_createContext), iOContext_createContext) : _createGenerator(_decorate(_createWriter(outputStream_fileOutputStream, jsonEncoding, iOContext_createContext), iOContext_createContext), iOContext_createContext);
    }

    public JsonParser createNonBlockingByteArrayParser() {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new NonBlockingJsonParser(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.makeChildOrPlaceholder(this._factoryFeatures));
    }

    public JsonParser createParser(String str) {
        int length = str.length();
        if (length > 32768 || !canUseCharArrays()) {
            return createParser(new StringReader(str));
        }
        IOContext iOContext_createContext = _createContext(_createContentReference(str), true);
        char[] cArrAllocTokenBuffer = iOContext_createContext.allocTokenBuffer(length);
        str.getChars(0, length, cArrAllocTokenBuffer, 0);
        return _createParser(cArrAllocTokenBuffer, 0, length, iOContext_createContext, true);
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures = (~feature.getMask()) & this._parserFeatures;
        return this;
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getFactoryFeatures() {
        return this._factoryFeatures;
    }

    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return "JSON";
        }
        return null;
    }

    public final boolean isEnabled(Feature feature) {
        return (this._factoryFeatures & feature.getMask()) != 0;
    }

    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    public boolean requiresPropertyOrdering() {
        return false;
    }

    public JsonFactory setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public StreamReadConstraints streamReadConstraints() {
        return this._streamReadConstraints;
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public ContentReference _createContentReference(Object obj, int i, int i2) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj, i, i2, this._errorReportConfiguration);
    }

    public final boolean isEnabled(JsonParser.Feature feature) {
        return (this._parserFeatures & feature.getMask()) != 0;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (this._generatorFeatures & feature.getMask()) != 0;
    }

    public final InputStream _decorate(InputStream inputStream, IOContext iOContext) {
        return inputStream;
    }

    public final OutputStream _decorate(OutputStream outputStream, IOContext iOContext) {
        return outputStream;
    }

    public final Reader _decorate(Reader reader, IOContext iOContext) {
        return reader;
    }

    public final Writer _decorate(Writer writer, IOContext iOContext) {
        return writer;
    }

    public final DataInput _decorate(DataInput dataInput, IOContext iOContext) {
        return dataInput;
    }

    public JsonGenerator createGenerator(Writer writer) {
        IOContext iOContext_createContext = _createContext(_createContentReference(writer), false);
        return _createGenerator(_decorate(writer, iOContext_createContext), iOContext_createContext);
    }

    public JsonParser _createParser(Reader reader, IOContext iOContext) {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.makeChild());
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) {
        IOContext iOContext_createContext = _createContext(_createContentReference(outputStream), false);
        iOContext_createContext.setEncoding(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(outputStream, iOContext_createContext), iOContext_createContext);
        }
        return _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, iOContext_createContext), iOContext_createContext), iOContext_createContext);
    }

    public JsonParser _createParser(char[] cArr, int i, int i2, IOContext iOContext, boolean z) {
        return new ReaderBasedJsonParser(iOContext, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.makeChild(), cArr, i, i + i2, z);
    }

    public JsonParser _createParser(byte[] bArr, int i, int i2, IOContext iOContext) {
        return new ByteSourceJsonBootstrapper(iOContext, bArr, i, i2).constructParser(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    public JsonParser _createParser(DataInput dataInput, IOContext iOContext) {
        _requireJSONFactory("InputData source not (yet?) supported for this format (%s)");
        int iSkipUTF8BOM = ByteSourceJsonBootstrapper.skipUTF8BOM(dataInput);
        return new UTF8DataInputJsonParser(iOContext, this._parserFeatures, dataInput, this._objectCodec, this._byteSymbolCanonicalizer.makeChildOrPlaceholder(this._factoryFeatures), iSkipUTF8BOM);
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) {
        return createGenerator(_createDataOutputWrapper(dataOutput), JsonEncoding.UTF8);
    }

    public JsonParser createParser(URL url) {
        IOContext iOContext_createContext = _createContext(_createContentReference(url), true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), iOContext_createContext), iOContext_createContext);
    }

    public JsonParser createParser(InputStream inputStream) {
        IOContext iOContext_createContext = _createContext(_createContentReference(inputStream), false);
        return _createParser(_decorate(inputStream, iOContext_createContext), iOContext_createContext);
    }

    public JsonParser createParser(Reader reader) {
        IOContext iOContext_createContext = _createContext(_createContentReference(reader), false);
        return _createParser(_decorate(reader, iOContext_createContext), iOContext_createContext);
    }

    public JsonParser createParser(byte[] bArr) {
        return _createParser(bArr, 0, bArr.length, _createContext(_createContentReference(bArr), true));
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) {
        _checkRangeBoundsForByteArray(bArr, i, i2);
        return _createParser(bArr, i, i2, _createContext(_createContentReference(bArr, i, i2), true));
    }

    public JsonParser createParser(File file) {
        IOContext iOContext_createContext = _createContext(_createContentReference(file), true);
        return _createParser(_decorate(_fileInputStream(file), iOContext_createContext), iOContext_createContext);
    }

    public JsonParser createParser(char[] cArr) {
        return createParser(cArr, 0, cArr.length);
    }

    public JsonParser createParser(char[] cArr, int i, int i2) {
        _checkRangeBoundsForCharArray(cArr, i, i2);
        return _createParser(cArr, i, i2, _createContext(_createContentReference(cArr, i, i2), true), false);
    }

    public JsonParser createParser(DataInput dataInput) {
        IOContext iOContext_createContext = _createContext(_createContentReference(dataInput), false);
        return _createParser(_decorate(dataInput, iOContext_createContext), iOContext_createContext);
    }

    public JsonFactory(ObjectCodec objectCodec) {
        this._byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._recyclerPool = JsonRecyclerPools.defaultPool();
        this._objectCodec = objectCodec;
        this._quoteChar = '\"';
        this._streamReadConstraints = StreamReadConstraints.defaults();
        this._streamWriteConstraints = StreamWriteConstraints.defaults();
        this._errorReportConfiguration = ErrorReportConfiguration.defaults();
        this._generatorDecorators = null;
        this._rootCharSymbols = CharsToNameCanonicalizer.createRoot(this);
    }

    public JsonFactory() {
        this(null);
    }
}
