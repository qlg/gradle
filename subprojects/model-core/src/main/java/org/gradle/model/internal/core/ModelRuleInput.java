/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.model.internal.core;

public class ModelRuleInput<T> {

    private final ModelReference<T> reference;
    private final ModelView<? extends T> view;

    public ModelRuleInput(ModelReference<T> reference, ModelView<? extends T> view) {
        this.reference = reference;
        this.view = view;
    }

    public static <T> ModelRuleInput<T> of(ModelReference<T> path, ModelView<? extends T> view) {
        return new ModelRuleInput<T>(path, view);
    }

    public ModelReference<T> getReference() {
        return reference;
    }

    public ModelView<? extends T> getView() {
        return view;
    }

    @Override
    public String toString() {
        return "ModelRuleInput{reference=" + reference + ", view=" + view + '}';
    }
}