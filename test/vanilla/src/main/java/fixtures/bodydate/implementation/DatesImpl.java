/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import fixtures.bodydate.Dates;
import fixtures.bodydate.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.io.IOException;
import org.joda.time.LocalDate;

/**
 * An instance of this class provides access to all the operations defined in
 * Dates.
 */
public class DatesImpl implements Dates {
    /**
     * The RestProxy service to perform REST calls.
     */
    private DatesService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestDateTestServiceImpl client;

    /**
     * Initializes an instance of Dates.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public DatesImpl(AutoRestDateTestServiceImpl client) {
        this.service = RestProxy.create(DatesService.class, client.httpPipeline(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Dates to be used by
     * RestProxy to perform REST calls.
     */
    @Host("https://localhost")
    interface DatesService {
        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getNull" })
        @GET("date/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getNull();

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getInvalidDate" })
        @GET("date/invaliddate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getInvalidDate();

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getOverflowDate" })
        @GET("date/overflowdate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getOverflowDate();

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getUnderflowDate" })
        @GET("date/underflowdate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getUnderflowDate();

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates putMaxDate" })
        @PUT("date/max")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putMaxDate(@BodyParam("application/json; charset=utf-8") LocalDate dateBody);

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getMaxDate" })
        @GET("date/max")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getMaxDate();

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates putMinDate" })
        @PUT("date/min")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putMinDate(@BodyParam("application/json; charset=utf-8") LocalDate dateBody);

        @Headers({ "x-ms-logging-context: fixtures.bodydate.Dates getMinDate" })
        @GET("date/min")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, LocalDate>> getMinDate();

    }

    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get null date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getNullAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Maybe<LocalDate> getNullAsync() {
        return getNullWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, LocalDate>, Maybe<LocalDate>>() {
                public Maybe<LocalDate> apply(RestResponse<Void, LocalDate> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
        }


    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getInvalidDate() {
        return getInvalidDateAsync().blockingGet();
    }

    /**
     * Get invalid date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getInvalidDateAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidDateAsync(), serviceCallback);
    }

    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getInvalidDateWithRestResponseAsync() {
        return service.getInvalidDate();
    }

    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Maybe<LocalDate> getInvalidDateAsync() {
        return getInvalidDateWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, LocalDate>, Maybe<LocalDate>>() {
                public Maybe<LocalDate> apply(RestResponse<Void, LocalDate> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
        }


    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getOverflowDate() {
        return getOverflowDateAsync().blockingGet();
    }

    /**
     * Get overflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getOverflowDateAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getOverflowDateAsync(), serviceCallback);
    }

    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getOverflowDateWithRestResponseAsync() {
        return service.getOverflowDate();
    }

    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Maybe<LocalDate> getOverflowDateAsync() {
        return getOverflowDateWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, LocalDate>, Maybe<LocalDate>>() {
                public Maybe<LocalDate> apply(RestResponse<Void, LocalDate> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
        }


    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getUnderflowDate() {
        return getUnderflowDateAsync().blockingGet();
    }

    /**
     * Get underflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getUnderflowDateAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getUnderflowDateAsync(), serviceCallback);
    }

    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getUnderflowDateWithRestResponseAsync() {
        return service.getUnderflowDate();
    }

    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Maybe<LocalDate> getUnderflowDateAsync() {
        return getUnderflowDateWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, LocalDate>, Maybe<LocalDate>>() {
                public Maybe<LocalDate> apply(RestResponse<Void, LocalDate> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
        }


    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putMaxDate(LocalDate dateBody) {
        putMaxDateAsync(dateBody).blockingAwait();
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMaxDateAsync(LocalDate dateBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMaxDateAsync(dateBody), serviceCallback);
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putMaxDateWithRestResponseAsync(LocalDate dateBody) {
        if (dateBody == null) {
            throw new IllegalArgumentException("Parameter dateBody is required and cannot be null.");
        }
        return service.putMaxDate(dateBody);
    }

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putMaxDateAsync(LocalDate dateBody) {
        return putMaxDateWithRestResponseAsync(dateBody)
            .toCompletable();
        }


    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getMaxDate() {
        return getMaxDateAsync().blockingGet();
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getMaxDateAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getMaxDateAsync(), serviceCallback);
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getMaxDateWithRestResponseAsync() {
        return service.getMaxDate();
    }

    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Maybe<LocalDate> getMaxDateAsync() {
        return getMaxDateWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, LocalDate>, Maybe<LocalDate>>() {
                public Maybe<LocalDate> apply(RestResponse<Void, LocalDate> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
        }


    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putMinDate(LocalDate dateBody) {
        putMinDateAsync(dateBody).blockingAwait();
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putMinDateAsync(LocalDate dateBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMinDateAsync(dateBody), serviceCallback);
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putMinDateWithRestResponseAsync(LocalDate dateBody) {
        if (dateBody == null) {
            throw new IllegalArgumentException("Parameter dateBody is required and cannot be null.");
        }
        return service.putMinDate(dateBody);
    }

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putMinDateAsync(LocalDate dateBody) {
        return putMinDateWithRestResponseAsync(dateBody)
            .toCompletable();
        }


    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    public LocalDate getMinDate() {
        return getMinDateAsync().blockingGet();
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocalDate> getMinDateAsync(ServiceCallback<LocalDate> serviceCallback) {
        return ServiceFuture.fromBody(getMinDateAsync(), serviceCallback);
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Single<RestResponse<Void, LocalDate>> getMinDateWithRestResponseAsync() {
        return service.getMinDate();
    }

    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, LocalDate> object
     */
    public Maybe<LocalDate> getMinDateAsync() {
        return getMinDateWithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, LocalDate>, Maybe<LocalDate>>() {
                public Maybe<LocalDate> apply(RestResponse<Void, LocalDate> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
        }


}
