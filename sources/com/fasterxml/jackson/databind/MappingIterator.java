package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public class MappingIterator<T> implements Iterator<T>, Closeable {
    protected static final MappingIterator<?> EMPTY_ITERATOR = new MappingIterator<>(null, null, null, null, false, null);
    protected final boolean _closeParser;
    protected final DeserializationContext _context;
    protected final JsonDeserializer<T> _deserializer;
    protected final JsonParser _parser;
    protected final JsonStreamContext _seqContext;
    protected int _state;
    protected final JavaType _type;
    protected final T _updatedValue;

    /* JADX WARN: Multi-variable type inference failed */
    public MappingIterator(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z, Object obj) {
        this._type = javaType;
        this._parser = jsonParser;
        this._context = deserializationContext;
        this._deserializer = jsonDeserializer;
        this._closeParser = z;
        if (obj == 0) {
            this._updatedValue = null;
        } else {
            this._updatedValue = obj;
        }
        if (jsonParser == null) {
            this._seqContext = null;
            this._state = 0;
            return;
        }
        JsonStreamContext parsingContext = jsonParser.getParsingContext();
        if (z && jsonParser.isExpectedStartArrayToken()) {
            jsonParser.clearCurrentToken();
        } else {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.START_OBJECT || jsonTokenCurrentToken == JsonToken.START_ARRAY) {
                parsingContext = parsingContext.getParent();
            }
        }
        this._seqContext = parsingContext;
        this._state = 2;
    }

    public <R> R _handleIOException(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }

    public <R> R _handleMappingException(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    public void _resync() {
        JsonParser jsonParser = this._parser;
        if (jsonParser.getParsingContext() == this._seqContext) {
            return;
        }
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == JsonToken.END_ARRAY || jsonTokenNextToken == JsonToken.END_OBJECT) {
                if (jsonParser.getParsingContext() == this._seqContext) {
                    jsonParser.clearCurrentToken();
                    return;
                }
            } else if (jsonTokenNextToken == JsonToken.START_ARRAY || jsonTokenNextToken == JsonToken.START_OBJECT) {
                jsonParser.skipChildren();
            } else if (jsonTokenNextToken == null) {
                return;
            }
        }
    }

    public <R> R _throwNoSuchElement() {
        throw new NoSuchElementException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this._state != 0) {
            this._state = 0;
            JsonParser jsonParser = this._parser;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return hasNextValue();
        } catch (JsonMappingException e) {
            return ((Boolean) this._handleMappingException(e)).booleanValue();
        } catch (IOException e2) {
            return ((Boolean) this._handleIOException(e2)).booleanValue();
        }
    }

    public boolean hasNextValue() {
        JsonToken jsonTokenNextToken;
        int i = this._state;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            _resync();
        } else if (i != 2) {
            return true;
        }
        JsonParser jsonParser = this._parser;
        if (jsonParser == null) {
            return false;
        }
        if (jsonParser.currentToken() != null || ((jsonTokenNextToken = this._parser.nextToken()) != null && jsonTokenNextToken != JsonToken.END_ARRAY)) {
            this._state = 3;
            return true;
        }
        this._state = 0;
        if (this._closeParser) {
            this._parser.close();
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            return nextValue();
        } catch (JsonMappingException e) {
            return (T) this._handleMappingException(e);
        } catch (IOException e2) {
            return (T) this._handleIOException(e2);
        }
    }

    public T nextValue() {
        T tDeserialize;
        int i = this._state;
        if (i == 0) {
            return (T) _throwNoSuchElement();
        }
        if ((i == 1 || i == 2) && !hasNextValue()) {
            return (T) _throwNoSuchElement();
        }
        try {
            T t = this._updatedValue;
            JsonDeserializer<T> jsonDeserializer = this._deserializer;
            if (t == null) {
                tDeserialize = jsonDeserializer.deserialize(this._parser, this._context);
            } else {
                jsonDeserializer.deserialize(this._parser, this._context, t);
                tDeserialize = this._updatedValue;
            }
            this._state = 2;
            this._parser.clearCurrentToken();
            return tDeserialize;
        } catch (Throwable th) {
            this._state = 1;
            this._parser.clearCurrentToken();
            throw th;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
