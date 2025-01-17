<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Детали операции</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .breadcrumb-item a {
            text-decoration: none;
        }
        .table th, .table td {
            vertical-align: middle;
        }
        .btn-primary {
            background-color: #ff8c00;
            border: none;
        }
        .btn-primary:hover {
            background-color: #e67e00;
        }
        .btn-danger {
            background-color: #dc3545;
            border: none;
        }
        .btn-danger:hover {
            background-color: #c82333;
        }
    </style>
</head>
<body>
<div class="container py-5">
    <!-- Навигация -->
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">История операций</a></li>
            <li class="breadcrumb-item active" aria-current="page">Детали операции</li>
        </ol>
    </nav>

    <!-- Шапка страницы -->
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h1 class="h3">Детали операции №${operation.id}</h1>
        <div>
            <button class="btn btn-danger me-2">Аннулировать</button>
            <button class="btn btn-primary">Редактировать</button>
        </div>
    </div>

    <!-- Основная информация -->
    <div class="mb-4 p-3 bg-white rounded shadow-sm">
        <h5>Основная информация</h5>
        <ul class="list-unstyled mb-0">
            <li><strong>Тип операции:</strong> ${operation.operationType.name}</li>
            <li><strong>Дата:</strong> ${operation.date}</li>
            <li><strong>Пользователь:</strong> ${operation.warehouse.moll.fullName}</li>
            <li><strong>Склад:</strong> ${operation.warehouse.name}</li>
        </ul>
    </div>

    <!-- Детали операции -->
    <div class="bg-white rounded shadow-sm p-3">
        <h5>Список товаров</h5>
        <table class="table table-hover mt-3">
            <thead class="table-light">
            <tr>
                <th>#</th>
                <th>Наименование</th>
                <th>Количество</th>
                <th>Единица</th>
            </tr>
            </thead>
            <tbody>
<#--            <tr>-->
<#--                <td>1</td>-->
<#--                <td>Сахар</td>-->
<#--                <td>1,000</td>-->
<#--                <td>кг</td>-->
<#--            </tr>-->
            <#list nomenclatures as nomenclature>
                <tr>
                    <td>${nomenclature.id}</td>
                    <td>${nomenclature.nomenclature.name}</td>
                    <td>${nomenclature.qty}</td>
                    <td>${nomenclature.nomenclature.unitType.name}</td>
                </tr>
            </#list>
            <tr>
                <td>2</td>
                <td>Пшеница</td>
                <td>500</td>
                <td>кг</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>