/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodystring.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Strings.
 */
public interface Strings {
    /**
     * Get null string value value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getNull();

    /**
     * Get null string value value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;String&gt;} object
     */
    ServiceFuture<String> getNullAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Get null string value value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;String&gt;} object if successful.
     */
    Maybe<String> getNullAsync();

    /**
     * Get null string value value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, String&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, String>> getNullWithRestResponseAsync();

    /**
     * Set string value null.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putNull();

    /**
     * Set string value null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putNullAsync(final ServiceCallback<Void> serviceCallback);

    /**
     * Set string value null.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putNullAsync();

    /**
     * Set string value null.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putNullWithRestResponseAsync();

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putNull(String stringBody);

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putNullAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putNullAsync(String stringBody);

    /**
     * Set string value null.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putNullWithRestResponseAsync(String stringBody);

    /**
     * Get empty string value value ''.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getEmpty();

    /**
     * Get empty string value value ''.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;String&gt;} object
     */
    ServiceFuture<String> getEmptyAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Get empty string value value ''.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;String&gt;} object if successful.
     */
    Maybe<String> getEmptyAsync();

    /**
     * Get empty string value value ''.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, String&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, String>> getEmptyWithRestResponseAsync();

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putEmpty(String stringBody);

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putEmptyAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putEmptyAsync(String stringBody);

    /**
     * Set string value empty ''.
     *
     * @param stringBody Possible values include: ''
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putEmptyWithRestResponseAsync(String stringBody);

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getMbcs();

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;String&gt;} object
     */
    ServiceFuture<String> getMbcsAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;String&gt;} object if successful.
     */
    Maybe<String> getMbcsAsync();

    /**
     * Get mbcs string value '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, String&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, String>> getMbcsWithRestResponseAsync();

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putMbcs(String stringBody);

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putMbcsAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putMbcsAsync(String stringBody);

    /**
     * Set string value mbcs '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '.
     *
     * @param stringBody Possible values include: '啊齄丂狛狜隣郎隣兀﨩ˊ▇█〞〡￤℡㈱‐ー﹡﹢﹫、〓ⅰⅹ⒈€㈠㈩ⅠⅫ！￣ぁんァヶΑ︴АЯаяāɡㄅㄩ─╋︵﹄︻︱︳︴ⅰⅹɑɡ〇〾⿻⺁䜣€ '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putMbcsWithRestResponseAsync(String stringBody);

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getWhitespace();

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;String&gt;} object
     */
    ServiceFuture<String> getWhitespaceAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;String&gt;} object if successful.
     */
    Maybe<String> getWhitespaceAsync();

    /**
     * Get string value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, String&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, String>> getWhitespaceWithRestResponseAsync();

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putWhitespace(String stringBody);

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putWhitespaceAsync(String stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putWhitespaceAsync(String stringBody);

    /**
     * Set String value with leading and trailing whitespace '&lt;tab&gt;&lt;space&gt;&lt;space&gt;Now is the time for all good men to come to the aid of their country&lt;tab&gt;&lt;space&gt;&lt;space&gt;'.
     *
     * @param stringBody Possible values include: '    Now is the time for all good men to come to the aid of their country    '
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putWhitespaceWithRestResponseAsync(String stringBody);

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    String getNotProvided();

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;String&gt;} object
     */
    ServiceFuture<String> getNotProvidedAsync(final ServiceCallback<String> serviceCallback);

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;String&gt;} object if successful.
     */
    Maybe<String> getNotProvidedAsync();

    /**
     * Get String value when no string value is sent in response payload.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, String&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, String>> getNotProvidedWithRestResponseAsync();

    /**
     * Get value that is base64 encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the byte[] object if successful.
     */
    byte[] getBase64Encoded();

    /**
     * Get value that is base64 encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;byte[]&gt;} object
     */
    ServiceFuture<byte[]> getBase64EncodedAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get value that is base64 encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;byte[]&gt;} object if successful.
     */
    Maybe<byte[]> getBase64EncodedAsync();

    /**
     * Get value that is base64 encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, byte[]&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, byte[]>> getBase64EncodedWithRestResponseAsync();

    /**
     * Get value that is base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the byte[] object if successful.
     */
    byte[] getBase64UrlEncoded();

    /**
     * Get value that is base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;byte[]&gt;} object
     */
    ServiceFuture<byte[]> getBase64UrlEncodedAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get value that is base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;byte[]&gt;} object if successful.
     */
    Maybe<byte[]> getBase64UrlEncodedAsync();

    /**
     * Get value that is base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, byte[]&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, byte[]>> getBase64UrlEncodedWithRestResponseAsync();

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putBase64UrlEncoded(byte[] stringBody);

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putBase64UrlEncodedAsync(byte[] stringBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putBase64UrlEncodedAsync(byte[] stringBody);

    /**
     * Put value that is base64url encoded.
     *
     * @param stringBody the Base64Url value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putBase64UrlEncodedWithRestResponseAsync(byte[] stringBody);

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the byte[] object if successful.
     */
    byte[] getNullBase64UrlEncoded();

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;byte[]&gt;} object
     */
    ServiceFuture<byte[]> getNullBase64UrlEncodedAsync(final ServiceCallback<byte[]> serviceCallback);

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Maybe&lt;byte[]&gt;} object if successful.
     */
    Maybe<byte[]> getNullBase64UrlEncodedAsync();

    /**
     * Get null value that is expected to be base64url encoded.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, byte[]&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, byte[]>> getNullBase64UrlEncodedWithRestResponseAsync();

}
