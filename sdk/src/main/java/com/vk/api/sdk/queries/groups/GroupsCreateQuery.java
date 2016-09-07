package com.vk.api.sdk.queries.groups;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.Actor;
import com.vk.api.sdk.objects.groups.Group;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Groups.create method
 */
public class GroupsCreateQuery extends AbstractQueryBuilder<GroupsCreateQuery, Group> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor  actor with access token
     * @param title  value of "title" parameter.
     */
    public GroupsCreateQuery(VkApiClient client, Actor actor, String title) {
        super(client, "groups.create", Group.class);
        accessToken(actor.getAccessToken());
        title(title);
    }

    /**
     * Community title
     *
     * @param value value of "title" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected GroupsCreateQuery title(String value) {
        return unsafeParam("title", value);
    }

    /**
     * Community description (ignored fof "type"=public)
     *
     * @param value value of "description" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsCreateQuery description(String value) {
        return unsafeParam("description", value);
    }

    /**
     * Community type:
     * ''group'' - group;
     * ''event'' - event;
     * ''public'' - public page
     *
     * @param value value of "type" parameter. By default 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsCreateQuery type(String value) {
        return unsafeParam("type", value);
    }

    /**
     * Set public category
     *
     * @param value value of "public category" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsCreateQuery publicCategory(Integer value) {
        return unsafeParam("public_category", value);
    }

    /**
     * Public page subtype:
     * ''1'' - place or small business;
     * ''2'' - company, organizaton or website;
     * ''3'' - famous person or group of people;
     * ''4'' - porduct or work of art
     *
     * @param value value of "subtype" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public GroupsCreateQuery subtype(Integer value) {
        return unsafeParam("subtype", value);
    }

    @Override
    protected GroupsCreateQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("title", "access_token");
    }
}