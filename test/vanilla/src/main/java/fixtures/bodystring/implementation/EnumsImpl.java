/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodystring.Enums;
import fixtures.bodystring.models.Colors;
import fixtures.bodystring.models.ErrorException;
import fixtures.bodystring.models.RefColorConstant;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined in
 * Enums.
 */
public class EnumsImpl implements Enums {
    /**
     * The RestProxy service to perform REST calls.
     */
    private EnumsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestSwaggerBATServiceImpl client;

    /**
     * Initializes an instance of Enums.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public EnumsImpl(AutoRestSwaggerBATServiceImpl client) {
        this.service = RestProxy.create(EnumsService.class, client.httpPipeline(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Enums to be used by
     * RestProxy to perform REST calls.
     */
    @Host("http://localhost")
    interface EnumsService {
        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums getNotExpandable" })
        @GET("string/enum/notExpandable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Colors>> getNotExpandable();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums putNotExpandable" })
        @PUT("string/enum/notExpandable")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putNotExpandable(@BodyParam("application/json; charset=utf-8") Colors stringBody);

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums getReferenced" })
        @GET("string/enum/Referenced")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Colors>> getReferenced();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums putReferenced" })
        @PUT("string/enum/Referenced")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putReferenced(@BodyParam("application/json; charset=utf-8") Colors enumStringBody);

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums getReferencedConstant" })
        @GET("string/enum/ReferencedConstant")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, RefColorConstant>> getReferencedConstant();

        @Headers({ "x-ms-logging-context: fixtures.bodystring.Enums putReferencedConstant" })
        @PUT("string/enum/ReferencedConstant")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putReferencedConstant(@BodyParam("application/json; charset=utf-8") RefColorConstant enumStringBody);

    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Colors object if successful.
     */
    public Colors getNotExpandable() {
        return getNotExpandableAsync().blockingGet();
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Colors> getNotExpandableAsync(ServiceCallback<Colors> serviceCallback) {
        return ServiceFuture.fromBody(getNotExpandableAsync(), serviceCallback);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Colors> object
     */
    public Single<RestResponse<Void, Colors>> getNotExpandableWithRestResponseAsync() {
        return service.getNotExpandable();
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Colors> object
     */
    public Maybe<Colors> getNotExpandableAsync() {
        return getNotExpandableWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, Colors>, Maybe<Colors>>() {
                public Maybe<Colors> apply(RestResponse<Void, Colors> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
        }


    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putNotExpandable(Colors stringBody) {
        putNotExpandableAsync(stringBody).blockingAwait();
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putNotExpandableAsync(Colors stringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putNotExpandableAsync(stringBody), serviceCallback);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putNotExpandableWithRestResponseAsync(Colors stringBody) {
        if (stringBody == null) {
            throw new IllegalArgumentException("Parameter stringBody is required and cannot be null.");
        }
        return service.putNotExpandable(stringBody);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param stringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putNotExpandableAsync(Colors stringBody) {
        return putNotExpandableWithRestResponseAsync(stringBody)
            .toCompletable();
        }


    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Colors object if successful.
     */
    public Colors getReferenced() {
        return getReferencedAsync().blockingGet();
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Colors> getReferencedAsync(ServiceCallback<Colors> serviceCallback) {
        return ServiceFuture.fromBody(getReferencedAsync(), serviceCallback);
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Colors> object
     */
    public Single<RestResponse<Void, Colors>> getReferencedWithRestResponseAsync() {
        return service.getReferenced();
    }

    /**
     * Get enum value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Colors> object
     */
    public Maybe<Colors> getReferencedAsync() {
        return getReferencedWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, Colors>, Maybe<Colors>>() {
                public Maybe<Colors> apply(RestResponse<Void, Colors> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
        }


    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putReferenced(Colors enumStringBody) {
        putReferencedAsync(enumStringBody).blockingAwait();
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putReferencedAsync(Colors enumStringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putReferencedAsync(enumStringBody), serviceCallback);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putReferencedWithRestResponseAsync(Colors enumStringBody) {
        if (enumStringBody == null) {
            throw new IllegalArgumentException("Parameter enumStringBody is required and cannot be null.");
        }
        return service.putReferenced(enumStringBody);
    }

    /**
     * Sends value 'red color' from enumeration of 'red color', 'green-color', 'blue_color'.
     *
     * @param enumStringBody Possible values include: 'red color', 'green-color', 'blue_color'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putReferencedAsync(Colors enumStringBody) {
        return putReferencedWithRestResponseAsync(enumStringBody)
            .toCompletable();
        }


    /**
     * Get value 'green-color' from the constant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RefColorConstant object if successful.
     */
    public RefColorConstant getReferencedConstant() {
        return getReferencedConstantAsync().blockingGet();
    }

    /**
     * Get value 'green-color' from the constant.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RefColorConstant> getReferencedConstantAsync(ServiceCallback<RefColorConstant> serviceCallback) {
        return ServiceFuture.fromBody(getReferencedConstantAsync(), serviceCallback);
    }

    /**
     * Get value 'green-color' from the constant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, RefColorConstant> object
     */
    public Single<RestResponse<Void, RefColorConstant>> getReferencedConstantWithRestResponseAsync() {
        return service.getReferencedConstant();
    }

    /**
     * Get value 'green-color' from the constant.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, RefColorConstant> object
     */
    public Maybe<RefColorConstant> getReferencedConstantAsync() {
        return getReferencedConstantWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, RefColorConstant>, Maybe<RefColorConstant>>() {
                public Maybe<RefColorConstant> apply(RestResponse<Void, RefColorConstant> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
        }


    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putReferencedConstant(RefColorConstant enumStringBody) {
        putReferencedConstantAsync(enumStringBody).blockingAwait();
    }

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putReferencedConstantAsync(RefColorConstant enumStringBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putReferencedConstantAsync(enumStringBody), serviceCallback);
    }

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putReferencedConstantWithRestResponseAsync(RefColorConstant enumStringBody) {
        if (enumStringBody == null) {
            throw new IllegalArgumentException("Parameter enumStringBody is required and cannot be null.");
        }
        Validator.validate(enumStringBody);
        return service.putReferencedConstant(enumStringBody);
    }

    /**
     * Sends value 'green-color' from a constant.
     *
     * @param enumStringBody the RefColorConstant value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putReferencedConstantAsync(RefColorConstant enumStringBody) {
        return putReferencedConstantWithRestResponseAsync(enumStringBody)
            .toCompletable();
        }


}
